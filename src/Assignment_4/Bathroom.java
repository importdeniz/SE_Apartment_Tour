package Assignment_4;

public class Bathroom extends Room{

    /*
    Diese Klasse beschreibt den speziellen Raum 'Badezimmer'
     */

    private boolean shower = false;     //Gibt an, ob Dusche an oder aus ist-
    private boolean lighting = false;   //Gibt an, ob Licht im Bad an oder aus ist.

    public Bathroom(){
        super("Badezimmer");      //konstruktor
        this.shower = shower;
    }

    public void switchShower(){
        this.shower = !shower;      //Dusche an bzw. ausschalten
    }

    public void switchLight() {
        this.lighting = !lighting;      //Licht an bzw. ausschalten
    }

    @Override
    public boolean isLighting() {
        return lighting;
    }

    public boolean isShower() {
        return shower;
    }
}
