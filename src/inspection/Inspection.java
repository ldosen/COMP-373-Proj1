package inspection;

import facility.Building;

public class Inspection{

    private Building buildingId;
    private String typeOfInspection;
    private String inspectionDetail;

    public Inspection(){}

    public String getBuildingId(){
        return buildingId;
    }

    public void setBuildingId(Building buildingId){
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
}