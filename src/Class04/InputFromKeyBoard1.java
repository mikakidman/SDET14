package Class04;

import java.util.Scanner;

public class InputFromKeyBoard1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter any sentence");
        String sentence= scan.nextLine();
        System.out.println(sentence);
    }
}
