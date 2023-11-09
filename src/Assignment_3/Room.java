package Assignment_3;

public class Room {
    private String name;
    private boolean lighting;
    private boolean isEntered;

    public Room(String name, boolean lighting){
        this.name = name;
        this.lighting = lighting;

    }

    public boolean isLighting() {
        return lighting;
    }

    public void switchLight(boolean lighting) {
        this.lighting = !lighting;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void enter(){
        this.isEntered = true;
    }


}
