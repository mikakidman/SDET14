package GroupProject2;

abstract class Car {
    double carPrice;
    String color;
    Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
        abstract double calculateSalePrice();
    }
class Truck extends Car{
double weight;
    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
        if(weight>2000){
            carPrice-=carPrice*0.1;
        }else{
            carPrice-=carPrice*0.2;
        }
        return carPrice;
    }
}
class Sedan extends Car{
double length;
    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            carPrice-=carPrice*0.05;
        }else{
            carPrice-=carPrice*0.1;
        }
        return carPrice;
        }
    }
