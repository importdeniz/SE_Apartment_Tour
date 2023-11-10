package Assignment_4;

public class Kitchen extends Room{

    /*
    Diese Klasse beschreibt den speziellen Raum 'Küche'
     */

    private boolean stove = false;  //boolean dusche
    private boolean lighting = false;

    public Kitchen(){
        super("Küche");   //konstruktor
        this.stove = stove;
    }

    public void switchStove(){
        /*
        Ofen an bzw. ausschalten mit der Ausgabe einer Information zum
        Stromverbrauch während der Betriebszeit des Ofens.
         */
        if(stove){
            System.out.println("Du hast 2000kWh verbraucht während der Herd an war.");
        }
        this.stove = !stove;
    }

    public void switchLight() {
        this.lighting = !lighting;      //Licht an bzw. ausschalten
    }

    public boolean isStove() {
        return stove;
    }

    @Override
    public boolean isLighting() {
        return lighting;
    }
}
