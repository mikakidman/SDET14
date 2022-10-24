package GroupProject2;

public class carTester {
    public static void main(String[] args) {
        Car truck1=new Truck(25000.0,"grey", 3500.0);
        System.out.println("Truck's color is grey and the  price is " + truck1.calculateSalePrice());

        Car sedan1=new Sedan(25000.0,"white", 25.5);
        System.out.println("Sedan's color is white and the price is "+ sedan1.calculateSalePrice());
    }
}
