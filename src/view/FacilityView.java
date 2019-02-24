package view;

import facility.*;
import service.FacilityService;
import service.RenterService;
import renter.*;

public class FacilityView {

    public static void main(String args[]) throws Exception{

        // instantiate the necessary services
        FacilityService facilityService = new FacilityService();
        RenterService renterService = new RenterService();

        // create a new building with a unique ID of 1000
        Building building = new Building();
        building.setFacilityId(1000);

        // retrieve a valid address and set it to the building. This step is needed because of the FK constraints of building.
        Address address = renterService.getAddress("4113");
        building.setAddress(address);
        facilityService.addFacility(building);

        // create facility without an apartment
        Building building1 = new Building();
        building.setFacilityId(1001);
        Address address1 = new Address("7217", "Orchard", null, "Downers Grove", "Illinois", "60516" );
        renterService.addAddress(address1); // necessary due to primary key constraints.
        building.setAddress(address1);
        facilityService.addFacility(building1);

        //remove facility two

    }
}
