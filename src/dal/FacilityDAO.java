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
        PreparedStatement addPst = null;

        try{
            String bldStm = "INSERT INTO Building(BuildingID, AddressID) VALUES(?, ?)";
            bldPst = con.prepareStatement(bldStm);
            bldPst.setInt(1, building.getFacilityId());
            bldPst.setString(2, building.getAddress().getAddressID());
            bldPst.executeUpdate();
        } catch (SQLException ex){

        } finally {
            try{
                if(addPst != null){
                    addPst.close();
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
}
