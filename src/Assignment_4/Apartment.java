package Assignment_4;

import java.util.*;

public class Apartment {
    public Set<Room> rooms = new HashSet<>();
    public boolean entered = false;

    public void enter(){
        this.entered = true;
    }
//    public void leave(){
//        this.entered = false;
//    }

//    public boolean isEntered(){
//        return entered;
//    }
    public void addRoom(Room room){
        rooms.add(room);
    }


//    public void getRooms() {    //print alle Räume in Apartment
//        for (Room i : rooms) {
//            System.out.println(i.getName());
//        }
//    }
}

