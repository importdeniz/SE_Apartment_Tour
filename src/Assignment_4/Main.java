package Assignment_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(Master.greeting().equals("1")){  //Betrete die Wohnung, wenn der aller erste Input 1 ist
            Master master = new Master();
        }
        else {
            Master master = new Master();
            master.leaveApartment();        //Verlasse die Wohnung und terminiere, wenn der allererste Input nicht 1 ist
        }
    }
}