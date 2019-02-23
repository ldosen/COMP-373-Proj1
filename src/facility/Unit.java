package facility;

import java.util.List;
import java.util.ArrayList;
import renter.Renter;

public class Unit {
    private String uintId;
    private float monthlyRent;
    private List<Room> rooms = new ArrayList<Room>();
    private List<Renter> tenants = new ArrayList<Renter>();

    public Unit(String unitId){
        this.uintId = unitId;
    }

    public String getUintId(){
        return uintId;
    }

    public void setUintId(String uintId){
        this.uintId = uintId;
    }

    public float getMonthlyRent(){
        return monthlyRent;
    }

    public void setMonthlyRent(float monthlyRent){
        this.monthlyRent = monthlyRent;
    }

    public List<Room> getRooms(){
        return rooms;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
    public List<Renter> getTenants(){
        return tenants;
    }

    public void addTenant(Renter renter){
        tenants.add(renter);
    }
}
