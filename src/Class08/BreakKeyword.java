package Class08;

public class BreakKeyword {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 15; i++) {
            System.out.println("Hello");
            if (i == 3) {
                break;
            }
        }
        System.out.println("End");
    }

}
