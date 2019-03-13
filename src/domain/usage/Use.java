package domain.usage;

public class Use {

    private int useId;
    private String useDescription;
    private float useCost;

    public Use() {}

    public int getUseId() {
        return useId;
    }

    public void setUseId(int useId) {
        this.useId = useId;
    }

    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    public float getUseCost() {
        return useCost;
    }

    public void setUseCost(float useCost) {
        this.useCost = useCost;
    }
}
