package domain.service;

import dal.MaintenanceDAO;
import domain.maintenance.*;

import java.util.List;

public class MaintenanceService {

    private MaintenanceDAO maintenanceDAO = new MaintenanceDAO();

    public void addRequest(Maintenance maintenanceRequest){
        try{
            maintenanceDAO.addmaintenanceRequest(maintenanceRequest);
        } catch (Exception e){
            System.err.println("MaintenanceService: threw and exception adding a new maintenance request");
            System.err .println(e.getMessage());
        }
    }

    public void removeMaintenanceRequest(int id){
        try{
            maintenanceDAO.removeMaintenanceRequest(id);
        } catch (Exception e){
            System.err.println("MaintenanceService: error removing facility");
            System.err.println(e.getMessage());
        }
    }

    public List<Integer> MaintenanceRequests(){
        try{
            List<Integer> MaintenanceRequests = mrequestDAO.maintenanceRequests();
            return maintenanceRequests;
        } catch (Exception e){
            System.err.println("MaintenanceService: error retrieving maintenance requests list");
            System.err.println(e.getMessage());
        }
        return null;
    }
}