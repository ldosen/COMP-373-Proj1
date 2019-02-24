package service;

import dal.FacilityDAO;
import facility.*;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import renter.Address;

public class FacilityService {

    private FacilityDAO facilityDAO = new FacilityDAO();

    public void addFacility(Building building){
        try{
            facilityDAO.addFacility(building);
        } catch (Exception e){
            System.err.println("FacilityService: threw and exception adding a new facility");
            System.err .println(e.getMessage());
        }
    }

    public void removeFacility(int buildingId){
        try{
            facilityDAO.removeFacility(buildingId);
        } catch (Exception e){
            System.err.println("FacilityService: error removing facility");
            System.err.println(e.getMessage());
        }
    }
}
