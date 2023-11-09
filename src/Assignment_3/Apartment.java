package Assignment_3;

public class Apartment {
    private boolean entered;
    public Apartment(){
        this.entered = entered;
        enter();
    }

    public void enter(){
        this.entered = true;
    }

    public void leave(){
        this.entered = false;
    }

    public boolean isEntered(){
        return entered;
    }
}
