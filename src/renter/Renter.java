package renter;

public class Renter {
    private String renterId;
    private String lastName;
    private String firstName;
    private Address rentingAddress;

    public String getRenterId() {
        return renterId;
    }

    public void setRenterId(String renterId){
        this.renterId = renterId;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public Address getRentingAddress(){
        return rentingAddress;
    }

    public void setRentingAddress(Address rentingAddress){
        this.rentingAddress = rentingAddress;
    }
}
