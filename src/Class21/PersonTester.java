package Class21;

public class PersonTester {
    public static void main(String[] args) {

        Person.OfficeBoy officeBoy=new Person.OfficeBoy();
        officeBoy.calculateSalary();

        Person.Tester tester=new Person.Tester();
        tester.calculateSalary();

         Person.Developer developer=new Person.Developer();
        developer.calculateSalary();
    }
}
