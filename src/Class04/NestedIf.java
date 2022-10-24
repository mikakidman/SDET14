package Class04;

public class NestedIf {
    public static void main(String[] args) {
        int time = 7;
        String day = "Sunday";
        if (day.equals("Sunday")) { //outer
            if (time >= 7) { //inner
                System.out.println("It's time to learn Java");
            }
            if (time < 6) {
                System.out.println("Let's sleep more");
            }
        }
    else{
            System.out.println("564");
        }

    }
}
