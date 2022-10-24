package Class04;

import java.util.Scanner;

public class InputFromKeyBoard {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scan.next();

        System.out.println("Hello " +name);

    }
}
