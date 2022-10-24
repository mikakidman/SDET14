package Class23;

public abstract class Animal {
   abstract void eat();

    abstract void sleep();
    void walk(){
        System.out.println("Cats walk ");
    }

    public static void main(String[] args) {
        //Animal animal=new Animal();   ---> we can not creat an object with abstract
        //animal.eat();
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cats like fish");
    }
    void sleep(){
        System.out.println("Cats like to sleep 12 to 16 hours");
    }
    void showAttitude(){
        System.out.println("Hmmmmmm");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dogs like meat");
    }
    void sleep(){
        System.out.println("Dogs like to sleep 10 to 12 hours");
    }
}