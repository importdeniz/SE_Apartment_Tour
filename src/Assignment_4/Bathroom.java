package Assignment_4;

public class Bathroom extends Room{
    private boolean shower = false;

    public Bathroom(){
        super("Badezimmer");      //konstruktor
        this.shower = shower;
    }

    public void switchShower(){
        this.shower = !shower;
    }
}
