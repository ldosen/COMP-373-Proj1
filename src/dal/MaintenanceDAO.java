package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import maintenance.*;

public class MaintenanceDAO {

    public MaintenanceDAO(){}

    public MaintenanceRequest getRequest(String id) {

        try {
            Statement st = DBHelper.getConnection().createStatement();
            String selectMaintenanceRequestQuery = "SELECT id, description, apartmentId FROM MaintenanceRequest WHERE ID = '" + id + "'";

            ResultSet mtncRS = st.executeQuery(selectMaintenanceRequestQuery);
            System.out.println("MaintenanceDAO: *************** Query " + selectMaintenanceRequestQuery);

            MaintenanceRequest mrequest = new MaintenanceRequest();
            while ( mtncRS.next() ) {
                mrequest.setID(mtncRS.getString("ID"));
                mrequest.setDescription(mtncRS.getString("Description"));
                mrequest.setApartmentID(mtncRS.getString("ApartmentID"));
            }
            //close to manage resources
            mtncRS.close();

            return mrequest;
        }
        catch (SQLException se) {
            System.err.println("MaintenanceDAO: Threw a SQLException retrieving the address object.");
            System.err.println(se.getMessage());
            se.printStackTrace();
        }
        return null;
    }

    public void addRequest(Maintenance mrequest){
        Connection con = DBHelper.getConnection();
        PreparedStatement addMtnc = null;

        try{
            String MtncStm = "INSERT INTO MaintenanceRequest(ID, Description, ApartmentID) VALUES(?, ?, ?)";
            addMtnc = con.prepareStatement(MtncStm);
            addMtnc.setString(1, mrequest.getID());
            addMtnc.setString(2, mrequest.getDescription());
            addMtnc.setString(3, mrequest.getApartmentID());
            addMtnc.executeUpdate();
        } catch (SQLException ex){

        } finally {
            try{
                if(addMtnc != null){
                    addMtnc.close();
                }
                if(con != null){
                    con.close();
                }
            } catch (SQLException ex){
                System.err.println("MaintenanceDAO: Threw a SQLException saving the maintenance request object");
                System.err.println(ex.getMessage());
            }
        }
    }

    public void removeRequest(String id){
        try{
            Statement st = DBHelper.getConnection().createStatement();
            String requestRemovalQuery = "delete from Request where ID = '" + id + "'";
            st.execute(requestRemovalQuery);
            st.close();
        } catch (SQLException e){
            System.err.println("MaintenanceDAO: error removing address primary key references");
            System.err.println(e.getMessage());
        }
    }

    public List<Integer> MaintenanceRequests(){

        List<Integer> MaintenanceRequests = new ArrayList<Integer>();

        try{
            Statement st = DBHelper.getConnection().createStatement();
            String getRequestsList = "SELECT* FROM Maintenance";
            ResultSet requestsResult = st.executeQuery(getRequestsList);


            while (requestsResult.next()){
                maintenanceRequests.add(requestsResult.getInt("ID"));
            }
            facilitiesResult.close();
            st.close();
            return maintenanceRequests;

        } catch (SQLException e){
            System.err.println("MaintenanceDAO: error while retrieving maintenance requests list");
            System.err.println(e.getMessage());
        }
        return null;
    }
}