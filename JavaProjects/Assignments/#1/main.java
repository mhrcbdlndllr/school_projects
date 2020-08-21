package main;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        System.out.print("What is your name? ");
        String newName = fetch.nextLine();
        System.out.print("What is your age? ");
        String newAge = fetch.nextLine();
        System.out.print("What is your main province? ");
        String newProvince = fetch.nextLine();
        info main = new info(newName, newAge, newProvince);
        main.maininfo();
        fetch.close();
    }
    
}

// By: Mharc Bedielon Duller | BSIT 1-1
