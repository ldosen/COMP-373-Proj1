package domain.usage;

public class Inspection {

    private int inspectionID;
    private String inspectionDescription;

    public Inspection(){}

    public int getInspectionID() {
        return inspectionID;
    }

    public void setInspectionID(int inspectionID) {
        this.inspectionID = inspectionID;
    }

    public String getInspectionDescription() {
        return inspectionDescription;
    }

    public void setInpsectionDescription(String inspectionDescription) {
        this.inspectionDescription = inspectionDescription;
    }
}
