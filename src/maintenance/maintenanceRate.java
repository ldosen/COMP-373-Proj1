package maintenance;

import java.*;
import facility.Apartment;
import maintenance.ScheduleMaintenance;

public class MaintenanceRate{
    private int rate;
    private Apartment apartmentId;
    private ScheduleMaintenance start, finish;

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

    public int calcMaintenance(int rate){
        int totalCost = rate * (finish - start);
    }
}