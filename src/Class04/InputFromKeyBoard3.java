package Class04;

import java.util.Scanner;

public class InputFromKeyBoard3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Did you solve any Repls?");
        boolean solvedAnyRepls=scan.nextBoolean();

        if(solvedAnyRepls){
            System.out.println("How many Repls you solved?");
            int noOfReplsSolved=scan.nextInt();

            if(noOfReplsSolved>=20){
                System.out.println("You are doing great");
            }else if(noOfReplsSolved<20){
                System.out.println("You are doing ok, please complete them ASAP");
            }else{
                System.out.println("You should solve more repls");
            }
        }else{
            System.out.println("They are very impeortant to learn Java, please solve them");
        }
    }
}
