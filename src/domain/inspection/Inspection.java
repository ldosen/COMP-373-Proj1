package domain.inspection;

import domain.facility.Building;
import java.util.List;
import java.util.ArrayList;

public class Inspection{

    private String typeOfInspection;
    private String inspectionDetail;
    private String inspectionDate;

    public Inspection(){}

    public String getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
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