package Assignment_4;

public class Room {

    /*
    Diese Klasse wird benutzt, um Instanzen vom Typ 'Room' zu erstellen
     */

    private String name;    //Raumbenennung (z.B. 'Wohnzimmer')
    private boolean lighting = false;
    private boolean isEntered;

    public Room(String name){
        this.name = name;
    }

    public boolean isLighting() {
        return lighting;
    }

    public void switchLight() {     //Lichtschalter
        this.lighting = !lighting;
    }

    public String getName() {
        return name;
    }

    public void enter(){
        this.isEntered = true;
    }


}
