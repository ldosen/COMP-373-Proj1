package facility;

import javafx.beans.binding.ObjectExpression;

public interface Facility {
    public Object listFacilities();
    public Object getFacilityInformation();
    public Object requestAvailableCapacity();
    public Object addNewFacility();
    public void addFacilityDetail();
    public Object removeFacility();
}
