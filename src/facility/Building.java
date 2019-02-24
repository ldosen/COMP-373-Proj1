package facility;

import renter.Address;

public class Building {
    private String buildingId;
    private Apartment apartmentDetails;
    private Address address;

    public Building(String buildingId){
        this.buildingId = buildingId;
    }

    public String getFacilityId() {
        return buildingId;
    }

    public void setFacilityId(String buildingId) {
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
