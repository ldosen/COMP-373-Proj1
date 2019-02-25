package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import facility.*;
import renter.*;

public class FacilityDAO {

    public FacilityDAO(){}

    public void addFacility(Building building){
        Connection con = DBHelper.getConnection();
        PreparedStatement bldPst = null;

        try{
            String bldStm = "INSERT INTO Building(BuildingID, AddressID) VALUES(?, ?)";
            bldPst = con.prepareStatement(bldStm);
            bldPst.setInt(1, building.getFacilityId());
            bldPst.setString(2, building.getAddress().getAddressID());
            bldPst.executeUpdate();
        } catch (SQLException ex){

        } finally {
            try{
                if(bldPst != null){
                    bldPst.close();
                }
                if(con != null){
                    con.close();
                }
            } catch (SQLException ex){
                System.err.println("CustomerDAO: Threw a SQLException saving the customer object");
                System.err.println(ex.getMessage());
            }
        }
    }

    public void removeFacility(int facilityId){
        // remove Apartments with this BuildingID due to FK constraints.
        try {
            Statement st = DBHelper.getConnection().createStatement();
            String apartmentRemovalQuery = "DELETE FROM Apartment WHERE BuildingId = '" + facilityId + "'";
            st.execute(apartmentRemovalQuery);
            st.close();
        } catch ( SQLException e){
            System.err.println("FacilityDAO: Error removing building");
            System.err.println(e.getMessage());
        }
        // remove building from the building table
        try {
            Statement st = DBHelper.getConnection().createStatement();
            String facilityRemovalQuery = "DELETE FROM Building WHERE BuildingId = '" + facilityId + "'";
            st.execute(facilityRemovalQuery);
            st.close();
        } catch ( SQLException e){
            System.err.println("FacilityDAO: Error removing building");
            System.err.println(e.getMessage());
        }
    }

    public List<Integer> listFacilities(){

        List<Integer> facilities = new ArrayList<Integer>();

        try{
            Statement st = DBHelper.getConnection().createStatement();
            String getFacilitiesList = "SELECT* FROM Building";
            ResultSet facilitiesResult = st.executeQuery(getFacilitiesList);


            while (facilitiesResult.next()){
                facilities.add(facilitiesResult.getInt("BuildingId"));
            }
            facilitiesResult.close();
            st.close();
            return facilities;

        } catch (SQLException e){
            System.err.println("FacilityDAO: error while retrieving facilities list");
            System.err.println(e.getMessage());
        }
        return null;
    }

}
