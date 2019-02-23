package facility;

public class Room {

    private float width;
    private float height;
    private String type;
    private float depth;

    public Room(float width, float height, float depth, String type){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.type = type;
    }

    public float getDepth() {
        return depth;
    }

    public String getType() {
        return type;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setDepth(float depth){
        this.depth = depth;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public void  setHeight(float height){
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }
}

