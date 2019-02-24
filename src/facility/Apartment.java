package facility;

import java.util.List;
import java.util.ArrayList;
import renter.Renter;

public class Apartment extends Building {

    private String apartmentId;
    private int numberOfRooms;
    private double monthlyRent;
    private List<Renter> tenants = new ArrayList<Renter>();
    private String status;
    private int capacity;

    public Apartment(){}

    public String getApartmentId(){
        return apartmentId;
    }

    public void setApartmentId(String apartmentId){
        this.apartmentId = apartmentId;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

    public double getMonthlyRent(){
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent){
        this.monthlyRent = monthlyRent;
    }

    public List<Renter> getTenants(){
        return tenants;
    }

    public void addTenant(Renter tenant){
        tenants.add(tenant);
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setTenants(int capacity){
        this.capacity = capacity;
    }
}
