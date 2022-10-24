package Class21;

public class Animal {

    void sleep(){
        System.out.println("Animals usually sleep for 6 hours");
    }
    void eat(){
        System.out.println("Grass and meat");
    }

    public static void main(String[] args) {
Cat cat=new Cat();
cat.sleep();
    }
}
class Cat extends Animal{
    @Override
    void sleep() {
        System.out.println("I like to sleep for 18 hours");
    }

    @Override
    void eat() {
        System.out.println("I like fish");
    }
}
class Dog extends Animal{
    @Override
    void sleep() {
        System.out.println("I like to sleep for 10 hours");
    }

    @Override
    void eat() {
        System.out.println("Dogs like meat");
    }
}

