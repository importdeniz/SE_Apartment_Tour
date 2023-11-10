package Assignment_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(Master.greeting().equals("1")){
            Master master = new Master();
        }
        else {
            Master master = new Master();
            master.leaveApartment();
        }
    }
}