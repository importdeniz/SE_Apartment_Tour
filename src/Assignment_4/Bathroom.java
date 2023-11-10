package Assignment_4;

public class Bathroom extends Room{
    private boolean shower = false;
    private boolean lighting = false;

    public Bathroom(){
        super("Badezimmer");      //konstruktor
        this.shower = shower;
    }

    public void switchShower(){
        this.shower = !shower;
    }

    public void switchLight() {
        this.lighting = !lighting;
    }

    @Override
    public boolean isLighting() {
        return lighting;
    }

    public boolean isShower() {
        return shower;
    }
}
