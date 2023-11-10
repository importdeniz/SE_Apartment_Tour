package Assignment_4;

public class Room {
    private String name;
    private boolean lighting = false;
    private boolean isEntered;

    public Room(String name){
        this.name = name;
    }

    public boolean isLighting() {    //Beleuchtung checken
        return lighting;
    }

    public void switchLight() {
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
