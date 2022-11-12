package Class27;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(new Card(10, "Credit card", 20000));
        cards.add(new Card(15, "Credit card", 25000));
        cards.add(new Card(20, "Credit card", 100000));

        for(Card card: cards){
            card.printBalance();
        }
    }
}
class Card{
    double interestRate;
    String cardType;
    double balance;

    public Card(double interestRate, String cardType, double balance) {
        this.interestRate = interestRate;
        this.cardType = cardType;
        this.balance=balance;
    }
void printBalance(){
    System.out.println(balance);
    }
    @Override
    public String toString() {
        return "Card{" +
                "interestRate=" + interestRate +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
