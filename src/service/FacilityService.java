package service;

import dal.FacilityDAO;
import facility.*;
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
}
