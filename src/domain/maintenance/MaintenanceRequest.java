package domain.maintenance;

import java.*;
import domain.facility.Apartment;

public class MaintenanceRequest extends FacilityMaintenance{

    private int requestId;
    private String maintenanceDescription;
    private Apartment apartment;

    public MaintenanceRequest(){}

    public MaintenanceRequest(int id, String maintenanceDescription, Apartment apartment){
        this.requestId = id;
        this.maintenanceDescription = maintenanceDescription;
        this.apartment = apartment;
    }

    public int getRequestd(){
        return requestId;
    }

    public void setRequestId(int id){
        this.requestId = id;
    }

    public String getMaintenanceDescription(){
        return maintenanceDescription;
    }

    public void setDescription(String maintenanceDescription){
        this.maintenanceDescription = maintenanceDescription;
    }

    public Apartment getApartment(){
        return apartment;
    }

    public void setApartment(Apartment apartment){
        this.apartment = apartment;
    }
}