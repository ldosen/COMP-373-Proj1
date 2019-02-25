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
import service.RenterService;

public class FacilityDAO {

    public FacilityDAO(){}

    public Apartment getApartmentInformation(int buildingId){
        try {
            RenterDAO renterDAO = new RenterDAO();
            //Get Apartment details from DB
            Statement st = DBHelper.getConnection().createStatement();
            String selectApartmentQuery = "SELECT ApartmentID, NumberOfRooms, MonthlyRent, Status, Capacity, RenterID, BuildingID FROM Apartment WHERE BuildingID = '" + buildingId + "'";

            ResultSet apptRS = st.executeQuery(selectApartmentQuery);
            System.out.println("RenterDAO: *************** Query " + selectApartmentQuery);

            //Create new address object
            Apartment apartment = new Apartment();
            while ( apptRS.next() ) {
                apartment.setApartmentId(apptRS.getInt("ApartmentID"));
                apartment.setNumberOfRooms(apptRS.getInt("NumberOfRooms"));
                apartment.setMonthlyRent(apptRS.getInt("MonthlyRent"));
                apartment.setStatus(apptRS.getString("Status"));
                apartment.setCapacity(apptRS.getInt("Capacity"));
                apartment.addTenant(renterDAO.getRenter(apptRS.getInt("RenterID")));
                apartment.setBuildingId(apptRS.getInt("BuildingID"));
            }
            //close to manage resources
            apptRS.close();

            return apartment;
        }
        catch (SQLException se) {
            System.err.println("RenterDAO: Threw a SQLException retrieving the address object.");
            System.err.println(se.getMessage());
            se.printStackTrace();
        }
        return null;
    }

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
