package domain.maintenance;

import java.*;
import domain.facility.Apartment;

public class MaintenanceRate{
    private int rate;
    private int apartmentId;
    private scheduleMaintenance start, finish;

    public maintenanceRate(){}

    public int getRate(){
        return rate;
    }

    public void setRate(int rate){
        this.rate = rate;
    }

    public int getApartmentId(){
        return apartmentId;
    }

    public void setApartmentId(int apartmentId){
        this.apartmentId = apartmentId;
    }

    public int calcMaintenance(int rate){
        int totalCost = rate * (finish - start);
    }
}