package Class27;

public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

    abstract void getQuote();
    abstract void cancelInsurance();

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Car extends Insurance{

    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);// calls the parent class constructor
    this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + " 3% of the car value "+ carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName + " has been canceled");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Pet extends Insurance{
String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + " charges 1500USD for " +petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled for "+ petType);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + " charges 2000USD for health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}