package inspection;

import facility.Building;
import java.util.List;
import java.util.ArrayList;

public class Inspection{

    private int buildingId;
    private String typeOfInspection;
    private String inspectionDetail;
    private List<InspectionList> inspectionList = new ArrayList<InspectionList>();

    public Inspection(){}

    public int getBuildingId(){
        return buildingId;
    }

    public void setBuildingId(int buildingId){
        this.buildingId = buildingId;
    }

    public String getTypeOfInspection(){
        return typeOfInspection;
    }

    public void setTypeOfInspection(String typeOfInspection){
        this.typeOfInspection = typeOfInspection;
    }

    public String getInspectionDetail(){
        return inspectionDetail;
    }

    public void setInspectionDetail(String inspectionDetail){
        this.inspectionDetail = inspectionDetail;
    }

    public List<InspectionList> getRequests(){
        return inspectionList;
    }

    public void addRequest(Inspection inspectionDetail){
        inspectionList.add(inspectionDetail);
    }
}