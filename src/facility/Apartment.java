package facility;

import java.util.List;
import java.util.ArrayList;
import renter.Renter;

public class Apartment extends Building {

    private int apartmentId;
    private int numberOfRooms;
    private double monthlyRent;
    private List<Renter> tenants = new ArrayList<Renter>();
    private String status;
    private int capacity;
    private int buildingId;

    public Apartment(){}

    public int getApartmentId(){
        return apartmentId;
    }

    public void setApartmentId(int apartmentId){
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

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setTenants(int capacity){
        this.capacity = capacity;
    }

    public int getBuildingId(){
        return buildingId;
    }

    public void setBuildingId(int buildingId){
        this.buildingId = buildingId;
    }

    @Override
    public String toString(){
        String aptattributes = "Apartment ID:" + Integer.toString(apartmentId) + "\nNumber of Rooms:" +
                Integer.toString(numberOfRooms) + "\nMonthly Rent:" + Double.toString(monthlyRent) + "\nCurrent Tenants:" + tenants.toString() +
                "\nStatus:" + status + "\nCapacity:" + capacity + "\nBuildingID:" + buildingId;
        return aptattributes;
    }
}
