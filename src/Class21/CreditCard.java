package Class21;

public class CreditCard {
    /*
    /Create a class CreditCard and define variable balance and interest. Create an instance method that will
     calculate interest based on the given balance. Create 2 subclasses: Visa and AX. In AX class override method
     calculate interest. Call the method by creating an object of each of the three classes.
     */

    double balance;
    double interest;

    void calculateInterest(double balance){
        interest=balance*0.5;
        System.out.println(interest);
    }
}
class Visa extends CreditCard{
}
class AX extends CreditCard{
    @Override
    void calculateInterest(double balance) {
        interest=balance*0.3;
        System.out.println(interest);
    }
}
