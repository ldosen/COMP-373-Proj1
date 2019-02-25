package maintenance;

import java.*;
import facility.Apartment;

public class MaintenanceRequest extends FacilityMaintenance{

    private int id;
    private String description;
    private Apartment apartmentId;

    public MaintenanceRequest(){}

    public MaintenanceRequest(int id, String description, Apartment apartment){
        this.id = id;
        this.description = description;
        this.apartmentId = apartmentId;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Apartment getApartmentId(){
        return apartmentId;
    }

    public void setApartmentId(Apartment apartmentId){
        this.apartmentId = apartmentId;
    }
}