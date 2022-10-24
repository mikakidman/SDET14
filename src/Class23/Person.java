package Class23;

public interface Person {
    void eat();
}
interface Employee{
    void work();
}
interface SyntaxEmployee extends Employee, Person{   //in interface we can do multiple inheritance
void createRepl();

}
class Meruyert implements SyntaxEmployee {

    @Override
    public void eat() {
        System.out.println("Like to eat grilled Fish");
    }

    @Override
    public void work() {
        System.out.println("QA engineer");
    }
@Override
    public void createRepl() {
    System.out.println("Create easy Repls");
    }
    }

