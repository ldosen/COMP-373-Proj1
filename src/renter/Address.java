package renter;

public class Address {
    private String addressID;
    private String streetName;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zip;

    public Address(){}

    public String getAddressID(){
        return addressID;
    }

    public void setAddressID(String addressID){
        this.addressID = addressID;
    }

    public String getStreetName(){
        return streetName;
    }

    public void setStreetName(String streetName){
        this.streetName = streetName;
    }

    public String getApartmentNumber(){
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber){
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getZip(){
        return zip;
    }

    public void  setZip(String zip){
        this.zip = zip;
    }
}
