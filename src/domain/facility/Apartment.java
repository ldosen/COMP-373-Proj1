package facility;

import java.util.List;
import java.util.ArrayList;
import renter.Renter;

public class Apartment extends Building {

    private int apartmentId;
    private int numberOfRooms;
    private int monthlyRent;
    private int renterId;
    private String status;
    private int capacity;
    private int buildingId;

    public Apartment(){}

    public Apartment(int apartmentId, int numberOfRooms, int monthlyRent, int renterId, String status, int capacity, int buildingId){
        this.apartmentId = apartmentId;
        this.numberOfRooms = numberOfRooms;
        this.monthlyRent = monthlyRent;
        this.renterId = renterId;
        this.status = status;
        this.capacity = capacity;
        this.buildingId = buildingId;
    }

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

    public int getMonthlyRent(){
        return monthlyRent;
    }

    public void setMonthlyRent(int monthlyRent){
        this.monthlyRent = monthlyRent;
    }

    public int getRenterId(){
        return renterId;
    }

    public void setRenterId(int renterId){
        this.renterId = renterId;
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

    public int getBuildingId(){
        return buildingId;
    }

    public void setBuildingId(int buildingId){
        this.buildingId = buildingId;
    }

    @Override
    public String toString(){
        String aptattributes = "Apartment ID:" + Integer.toString(apartmentId) + "\nNumber of Rooms:" +
                Integer.toString(numberOfRooms) + "\nMonthly Rent:" + Integer.toString(monthlyRent) + "\nCurrent Tenant:" + renterId +
                "\nStatus:" + status + "\nCapacity:" + capacity + "\nBuildingID:" + buildingId;
        return aptattributes;
    }
}