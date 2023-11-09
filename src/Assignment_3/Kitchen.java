package Assignment_3;

public class Kitchen {
    private boolean stove = false;  //boolean dusche

    public Kitchen(){   //konstruktor
        this.stove = stove;
    }

    public void switchStove(){
        if(stove){
            System.out.println("Du hast 2000kWh verbraucht während der Herd an war.");
        }
        this.stove = !stove;
    }
}
