package domain.facility;

import domain.renter.Address;

public class Building {
    private int buildingId;
    private Address address;

    public Building(){}

    public Building(int buildingId){
        this.buildingId = buildingId;
    }

    public int getFacilityId() {
        return buildingId;
    }

    public void setFacilityId(int buildingId) {
        this.buildingId = buildingId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }
}
