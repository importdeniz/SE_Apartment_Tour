package Assignment_4;

import java.util.Scanner;

public class Master {

    /*
    Diese Klasse ermöglicht uns ein genaues Skript zu erstellen, womit der Input des Users verarbeitet wird,
    und Aktionen durchgeführt werden.
     */
    Apartment apartment = new Apartment();
    Room flur = new Room("Flur");
    Room wohnzimmer = new Room("Wohnzimmer");
    Room schlafzimmer = new Room("Schlafzimmer");
    Bathroom bad = new Bathroom();
    Kitchen kuche = new Kitchen();

    public Master() {
        /*
        In dem Konstruktor der Klasse werden zur Initialisierung der Instanz von 'Master' alle erstellten Räume in die
        ArrayList hinzugefügt und der Flur betreten.
         */
        apartment.enter();
        apartment.addRoom(flur);
        apartment.addRoom(wohnzimmer);
        apartment.addRoom(schlafzimmer);
        apartment.addRoom(kuche);
        apartment.addRoom(bad);
        enterHallway();
    }

    public static String greeting() {
        /*
        Diese Methode fragt den Benutzer, ob dieser das Apartment
        betreten will, oder das Programm beendet werden soll.
        */
        System.out.println("Willkommen");
        Scanner willkommen = new Scanner(System.in);
        System.out.println("Was möchten Sie tun?\n" +
                "1) Apartment betreten\n" +
                "2) Tour nicht starten");
        String input = willkommen.nextLine();
        return input;
    }

    public void enterHallway() {
        /*
        Flur wird betreten und es werden durch if-conditions weitere ausgewählte Aktionen ermöglicht.
        */
        System.out.println("Sie sind jetzt im Flur, was möchten Sie tun?\n" +
                "1) Lichtschalter betätigen\n" +
                "2) Nachbarraum betreten\n" +
                "3) Apartment verlassen");
        Scanner hallway = new Scanner(System.in);
        String input = hallway.nextLine();
        if (input.equals("1")) {
            flur.switchLight();
            System.out.println("Licht im Flur = " + flur.isLighting());
            enterHallway();
        }
        if (input.equals("2")) {
            System.out.println("Welchen Raum möchten Sie betreten?\n" +
                    "1) Wohnzimmer betreten\n" +
                    "2) Arbeitszimmer betreten\n" +
                    "3) Schlafzimmer betreten\n" +
                    "4) Küche betreten\n" +
                    "5) Badezimmer betreten");
            Scanner hallway_leave = new Scanner(System.in);
            String input_leave = hallway.nextLine();
            if (input_leave.equals("1")) {
                enterLivingRoom();
            }
            if (input_leave.equals("2")) {
                enterBathroom();
            }
            if (input_leave.equals("3")) {
                enterBedroom();
            }
            if (input_leave.equals("4")) {
                enterKitchen();
            }
            if (input_leave.equals("5")){
                enterBathroom();
            }
        }
        if (input.equals("3")) {
            leaveApartment();
        }
    }

    public void enterLivingRoom() {
        /*
        Wohnzimmer wird betreten und es werden durch if-conditions Aktionsmöglichkeiten
        zur Verfügung gestellt
        */
        System.out.println("Sie sind jetzt im Wohnzimmer, was möchten Sie tun?\n" +
                "1) Lichtschalter betätigen\n" +
                "2) Raum verlassen\n" +
                "3) Nachbarraum betreten");
        Scanner livingRoom = new Scanner(System.in);
        String input = livingRoom.nextLine();
        if (input.equals("1")) {
            wohnzimmer.switchLight();
            System.out.println("Licht im Wohnzimmer = " + wohnzimmer.isLighting());
            enterLivingRoom();
        }
        if (input.equals("2")) {
            System.out.println("Sie haben das Wohnzimmer verlassen.");
            enterHallway();
        }
        if (input.equals("3")) {
            System.out.println("Welchen Raum möchten Sie betreten?\n" +
                    "1) Flur betreten");
            Scanner livingRoom_leave = new Scanner(System.in);
            String input_leave = livingRoom_leave.nextLine();
            if (input_leave.equals("1")) {
                enterHallway();
            }
        }
    }

    public void enterBedroom() {
        /*
        Schlafzimmer wird betreten, if-conditions ermöglichen weitere Aktionen
         */
        System.out.println("Sie sind jetzt im Schlafzimmer, was möchten Sie tun?\n" +
                "1) Lichtschalter betätigen\n" +
                "2) Raum verlassen\n" +
                "3) Nachbarraum betreten");
        Scanner bedroom = new Scanner(System.in);
        String input = bedroom.nextLine();
        if (input.equals("1")) {
            schlafzimmer.switchLight();
            System.out.println("Licht im Schlafzimmer = " + schlafzimmer.isLighting());
            enterBedroom();
        }
        if (input.equals("2")) {
            System.out.println("Sie haben das Wohnzimmer verlassen.");
            enterHallway();
        }
        if (input.equals("3")) {
            System.out.println("Welchen Raum möchten Sie betreten?\n" +
                    "1) Flur betreten\n" +
                    "2) Im Schlafzimmer bleiben");
            Scanner bedroom_leave = new Scanner(System.in);
            String input_leave = bedroom_leave.nextLine();
            if (input_leave.equals("1")) {
                enterHallway();
            }
            if (input_leave.equals("2")) {
                enterBedroom();
            }
        }
    }

    public void enterBathroom() {
        /*
        Badezimmer wird betreten, hier werden die standardmäßigen Optionen angeboten und
        zusätzlich kann man eine Dusche betätigen
         */
        System.out.println("Sie sind jetzt im Badezimmer, was möchten Sie tun?\n" +
                "1) Lichtschalter betätigen\n" +
                "2) Dusche betätigen\n" +
                "3) Nachbarraum betreten\n" +
                "4) Raum verlassen");
        Scanner bathroom = new Scanner(System.in);
        String input = bathroom.nextLine();
        if (input.equals("1")) {
            bad.switchLight();
            System.out.println("Licht im Badezimmer = " + bad.isLighting());
            enterBathroom();
        }
        if (input.equals("2")) {
            bad.switchShower();
            System.out.println("Dusche = " + bad.isShower());
            enterBathroom();
        }
        if (input.equals("3")) {
            System.out.println("Welchen Raum möchten Sie betreten?\n" +
                    "1) Flur betreten\n" +
                    "2) Im Badezimmer bleiben");
            Scanner bathroom_leave = new Scanner(System.in);
            String input_leave = bathroom_leave.nextLine();
            if (input_leave.equals("1")) {
                enterHallway();
            }
            if (input_leave.equals("2")) {
                enterBathroom();
            }
        }
        if (input.equals("4")) {
            enterHallway();
        }
    }

    public void enterKitchen() {
        /*
        Küche wird betreten und zusätzlich kann man einen Herd betätigen.
         */
        System.out.println("Sie sind jetzt in der Küche, was möchten Sie tun?\n" +
                "1) Lichtschalter betätigen\n" +
                "2) Herd betätigen\n" +
                "3) Nachbarraum betreten\n" +
                "4) Raum verlassen");
        Scanner kitchen = new Scanner(System.in);
        String input = kitchen.nextLine();
        if (input.equals("1")) {
            kuche.switchLight();
            System.out.println("Licht in Küche = " + kuche.isLighting());
            enterKitchen();
        }
        if (input.equals("2")) {
            kuche.switchStove();
            enterKitchen();
        }
        if (input.equals("3")) {
            System.out.println("Welchen Raum möchten Sie betreten?\n" +
                    "1) Flur betreten\n" +
                    "2) In Küche bleiben");
            Scanner kitchen_leave = new Scanner(System.in);
            String input_leave = kitchen_leave.nextLine();
            if (input_leave.equals("1")) {
                enterHallway();
            }
            if (input_leave.equals("2")) {
                enterKitchen();
            }
        }
        if (input.equals("4")) {
            enterHallway();
        }
    }

    public void leaveApartment() {
        /*
        Apartment wird verlassen, es wird über jeden Raum iteriert und geschaut ob das Licht, die Dusche
        oder der Herd an ist und eine entsprechende Warnung wird herausgegeben.
         */
        for (Room i : apartment.rooms) {
            if (i.isLighting()) {
                System.out.println("Warnung! Das Licht ist an: " + i.getName() + "\n"
                        + "Wollen Sie fortfahren?\n" +
                        "1) Ja\n" +
                        "2) Nein, zurückkehren");
                Scanner leave = new Scanner(System.in);
                String input1 = leave.nextLine();
                if (input1.equals("2")) {
                    enterHallway();
                }
            }
        }

        if (kuche.isStove()) { //prüft, ob der Herd an ist
            System.out.println("Warnung! Der Herd in der Küche ist an.\n" +
                    "Wohnung wirklich verlassen?\n" +
                    "1) Ja\n" +
                    "2) Nein");
            Scanner leave3 = new Scanner(System.in);
            String input3 = leave3.nextLine();
            if (input3.equals("2")) {
                enterHallway();
            }
            apartment.leave();
        }

        if (bad.isShower()) { //prüft, ob die Dusche an ist
            System.out.println("Warnung! Die Dusche im Badezimmer ist an\n" +
                    "Wohnung wirklich verlassen?\n" +
                    "1) Ja\n" +
                    "2) Nein");
            Scanner leave2 = new Scanner(System.in);
            String input2 = leave2.nextLine();
            if (input2.equals("2")) {
                enterHallway();
            }
        }
    }
}