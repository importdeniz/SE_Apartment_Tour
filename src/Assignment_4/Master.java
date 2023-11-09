package Assignment_4;

import java.util.Scanner;

public class Master {
    Apartment apartment = new Apartment();
    Room flur = new Room("Flur");
    Room wohnzimmer = new Room("Wohnzimmer");
    Room schlafzimmer = new Room("Schlafzimmer");
    Room arbeitszimmer = new Room("Arbeitszimmer");
    Bathroom bad = new Bathroom();
    Kitchen küche = new Kitchen();
    public Master(){
        apartment.enter();
        apartment.addRoom(flur);
        apartment.addRoom(wohnzimmer);
        apartment.addRoom(schlafzimmer);
        apartment.addRoom(arbeitszimmer);
        apartment.addRoom(küche);
        apartment.addRoom(bad);
        enterHallway();
    }

    public static String greeting(){
        System.out.println("Willkommen");
        Scanner willkommen = new Scanner(System.in);
        System.out.println("Was möchten Sie tun?\n1) Apartment betreten\n2) Tour nicht starten");
        String input = willkommen.nextLine();
        return input;
    }

    public void enterHallway(){
        System.out.println("Sie sind jetzt im Flur, was möchten Sie tun?\n" +
                "1) Lichtschalter betätigen\n" +
                "2) Nachbarraum betreten\n" +
                "3) Apartment verlassen");
        Scanner hallway = new Scanner(System.in);
        String input = hallway.nextLine();
        if(input.equals("1")){
            flur.switchLight();
            System.out.println("Licht im Flur = " + flur.isLighting());
            enterHallway();
        }
        if(input.equals("2")){
            System.out.println("Welchen Raum möchten Sie betreten?\n" +
                    "1) Wohnzimmer betreten\n" +
                    "2) Arbeitszimmer betreten\n" +
                    "3) Schlafzimmer betreten\n" +
                    "4) Küche betreten\n" +
                    "5) Badezimmer betreten");
        }
        if(input.equals("3")){
            leaveApartment();
        }
    }

    public void enterLivingRoom(){
        System.out.println("Sie sind jetzt im Wohnzimmer, was möchten Sie tun?\n" +
                "1) Lichtschalter betätigen\n" +
                "2) Raum verlassen\n" +
                "3) Nachbarraum betreten");
        Scanner livingRoom = new Scanner(System.in);
        String input = livingRoom.nextLine();
        if(input.equals("1")){
            wohnzimmer.switchLight();
            System.out.println("Licht im Wohnzimmer = " + wohnzimmer.isLighting());
            enterLivingRoom();
        }
//        if(input.equals("2")){
//
//        }
//        if(input.equals("3")){
//
//        }
    }

    public static void leaveApartment(){
        System.out.println("Sie haben die Tour verlassen.");
    }
}
