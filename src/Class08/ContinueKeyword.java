package Class08;

public class ContinueKeyword {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                continue;
            }

            System.out.println("Hello");
            System.out.println("How are you?");
            System.out.println(i);

        }
    }
}
