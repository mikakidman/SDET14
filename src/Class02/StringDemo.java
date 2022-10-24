package Class02;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Meruyert";
        String lastName = "Kitmanova";
        char grade = 'A';
        String city = "Trenton";
        String state = "NJ";
        String phoneNumber = "917-294-9480";

        System.out.println("My name is " + name+" and my last name is " + lastName);
        //changes
        city="New York";
        state="NY";
        System.out.println("I moved to "+ city + ", " + state);

    }
}
