package Class09;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //Create an array of integers and calculate the sum

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        System.out.print("Sum of numbers is this array is:= ");
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            }
            System.out.println(sum);

        System.out.println("Enhanced loop   (another way)");

        sum=0;
        for(int number:numbers){
            sum+=number;
        }
        System.out.println(sum);
        }
    }

