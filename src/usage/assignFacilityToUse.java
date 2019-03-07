package usage;

import facility.Apartment;

public class assignFacilityToUse(){
    private int apartmentId;
    private int buildingId;
    
    public assignFacilityToUse();

    public int getApartmentId(){
        return apartmentId;
    }

    public void setApartmentId(int apartmentId){
        this.apartmentId = apartmentId;
    }

    public int getBuildingId(){
        return buildingId;
    }

    public void setBuildingId(int buildingId){
        this.buildingId = buildingId;
    }

    @Override
    public String toString(){
        String assignFacility = "Apartment ID:" + Integer.toString(apartmentId) +
                "\nBuilding ID:" + Integer.toString(buildingId);
        return assignFacility;
    }
}