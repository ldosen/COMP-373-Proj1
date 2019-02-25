package maintenance;

import java.*;
import facility.Apartment;
import maintenance.FacilityMaintenance;

public class maintenanceRate{
    private int rate;
    private Apartment apartmentId;
    private FacilityMaintenance maintenanceType;

    public maintenanceRate(){}

    public int getRate(){
        return rate;
    }

    public void setRate(int rate){
        this.rate = rate;
    }

    public Apartment getApartmentId(){
        return apartmentId;
    }

    public void setApartmentId(Apartment apartmentId){
        this.apartmentId = apartmentId;
    }
}