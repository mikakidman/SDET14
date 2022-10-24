package Class21;

public class Person {
    String name;
    double baseSalary=40000;
    double bonus=20000;

    void calculateSalary(){
        System.out.println(baseSalary+bonus);
    }
    static class Developer extends Person{
        @Override
        void calculateSalary() {
            System.out.println(2*baseSalary+(1.5*bonus));
        }
    }
    static class Tester extends Person{
        @Override
        void calculateSalary() {
            System.out.println(baseSalary+(2*bonus));
        }
    }
    static class OfficeBoy extends Person{
        }
    }

