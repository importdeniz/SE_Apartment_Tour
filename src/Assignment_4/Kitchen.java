package Assignment_4;

public class Kitchen extends Room{
    private boolean stove = false;  //boolean dusche
    private boolean lighting = false;

    public Kitchen(){
        super("Küche");   //konstruktor
        this.stove = stove;
    }

    public void switchStove(){
        if(stove){
            System.out.println("Du hast 2000kWh verbraucht während der Herd an war.");
        }
        this.stove = !stove;
    }

    public void switchLight() {
        this.lighting = !lighting;
    }

    public boolean isStove() {
        return stove;
    }

    @Override
    public boolean isLighting() {
        return lighting;
    }
}
