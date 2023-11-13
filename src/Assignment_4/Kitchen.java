package Assignment_4;

public class Kitchen extends Room{

    /*
    Diese Klasse beschreibt den speziellen Raum 'Küche'
    */
    private long start;     //start timer für den herd
    private boolean stove = false;  //boolean herd
    private boolean lighting = false;

    public Kitchen(){
        super("Küche"); //konstruktor
        this.stove = stove;
    }

 public void switchStove(){
        if(!this.stove) {
            System.out.println("Herd eingeschaltet.");
            start = System.currentTimeMillis();
        }
        else {
            System.out.println("Herd ausgeschaltet.");
            System.out.println((((System.currentTimeMillis() - start) / (long)60000)*(long)33.3) + "kWh were used.");
        }
        this.stove = !this.stove;
    }

    public void switchLight() {
        this.lighting = !lighting;      //Licht an bzw. ausschalten
    }

    public boolean isStove() {
        return this.stove;
    }

    @Override
    public boolean isLighting() {
        return lighting;
    }
}
