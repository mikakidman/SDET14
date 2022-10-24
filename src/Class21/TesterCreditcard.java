package Class21;

public class TesterCreditcard {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculateInterest(150000);

        Visa visa=new Visa();
        visa.calculateInterest(150000);

        AX ax=new AX();
        ax.calculateInterest(150000);
    }
}
