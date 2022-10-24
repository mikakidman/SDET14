package Class06;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country= scan.nextLine();
        String favouriteFood;

        switch(country){
            case "USA":
                favouriteFood="Burgers and fries";
                break;
            case "Kazakhstan":
                favouriteFood="Beshbarmak";
                break;
            case "Turkey":
                favouriteFood="Adana Kebab";
                break;
            case "India":
                favouriteFood="Briani";
                break;
            default:
                favouriteFood="Unknown";
                break;
        }
        System.out.println("Your favourite food is "+ favouriteFood);
    }
}
