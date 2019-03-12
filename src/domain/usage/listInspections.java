package domain.usage;

import inspection.Inspection;

public class listInspections extends Inspection{
    private int buildingId;
    private List<InspectionList> inspectionList = new ArrayList<InspectionList>();

    public listInspections();

    public int getBuildingId(){
        return buildingId;
    }

    public void setBuildingId(int buildingId){
        this.buildingId = buildingId;
    }

    public List<InspectionList> getRequests(){
        return inspectionList;
    }
}