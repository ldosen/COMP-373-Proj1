package maintenance;

import java.*;
import maintenance.maintenanceRequest;

public class FacilityMaintenance {
    private Apartment status;
    private List<MaintenanceRequest> maintenanceRequests = new ArrayList<MaintenanceRequest>();
    private String maintenanceType;

    public Apartment getStatus(){
        return status;
    }

    public void setStatus(Apartment status){
        this.status = status;
    }

    public List<MaintenanceRequest> getRequests(){
        return maintenanceRequests;
    }

    public void addRequest(Maintenance maintenanceRequest){
        maintenanceRequests.add(maintenanceRequest);
    }

    public String getMaintenanceType(){
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType){
        this.maintenanceType = maintenanceType;
    }
}