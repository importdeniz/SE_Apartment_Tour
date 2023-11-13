package Assignment_4;

import java.util.*;

/*
Diese Klasse erstellt ein Apartment, welches die Attribute 'ArrayList' und 'entered' enthält.
 */

public class Apartment {

    public ArrayList<Room> rooms = new ArrayList<>();   //ArrayList enthält die Menge aller Räume innerhalb des Apartments
    public boolean entered = false;     //entered gibt an, ob Apartment betreten wurde oder verlassen

    public void enter() {
        this.entered = true;
    }

    public void leave() {
        this.entered = false;
        System.out.println("Sie haben die Tour verlassen.");
    }

    public boolean isEntered() {
        return entered;
    }

    public void addRoom(Room room) {
        /*
        Fügt ein Objekt von Typ 'Room' zur ArrayList hinzu
         */
        rooms.add(room);
    }


    public ArrayList<Room> getRooms() {
        /*
        Gibt die ArrayList mit allen Räumen des Apartments zurück.
         */
        return rooms;
    }
}

