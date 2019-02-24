package view;

import facility.*;
import service.FacilityService;
import renter.*;

public class FacilityView {

    public static void main(String args[]) throws Exception{

        Building building = new Building();
        building.setFacilityId(1000);

        Address address = new Address();
        address.setAddressID("4113");
        address.setApartmentNumber("2F");
        address.setStreetName("Damen");
        address.setCity("Chicago");
        address.setState("Illinois");
        address.setZip("60618");

        building.setAddress(address);

        FacilityService facilityService = new FacilityService();

        facilityService.addFacility(building);


    }
}
