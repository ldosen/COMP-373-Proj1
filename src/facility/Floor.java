package facility;

import java.util.List;
import java.util.ArrayList;

public class Floor {
    private String floorId;
    private List<Unit> units = new ArrayList<Unit>();

    public Floor (String floorId){
        this.floorId = floorId;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit){
        units.add(unit);
    }
}
