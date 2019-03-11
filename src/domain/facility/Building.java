package facility;

import renter.Address;

public class Building {
    private int buildingId;
    private Apartment apartmentDetails;
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

    public Apartment getApartmentDetails(){
        return apartmentDetails;
    }

    public void setApartmentDetails(Apartment apartmentDetails){
        this.apartmentDetails = apartmentDetails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }
}
