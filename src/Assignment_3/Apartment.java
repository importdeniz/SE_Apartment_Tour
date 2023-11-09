package Assignment_3;

import java.util.*;

public class Apartment {
    Set<Room> rooms = new HashSet<>();
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
    public void addRoom(Room room){
        rooms.add(room);     // test asdfasdf
    }
}
