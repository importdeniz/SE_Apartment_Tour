package Assignment_4;

import java.util.*;

public class Apartment {
    public ArrayList<Room> rooms = new ArrayList<>();
    public boolean entered = false;

    public void enter() {
        this.entered = true;
    }

    public void leave() {
        this.entered = false;
    }

    public boolean isEntered() {
        return entered;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }


    public ArrayList<Room> getRooms() {
        return rooms;
    }
}

