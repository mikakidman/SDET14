package Class21;

public class Employee {
    void calculateSalary(){
        System.out.println("1");
    }
}
class Developer extends Employee{
    void calculateSalary(){
        System.out.println("2");// first run this
    }
    void test(){
        super.calculateSalary();
        calculateSalary();
    }
}
class Test{
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.calculateSalary();
        developer.test();
    }
}