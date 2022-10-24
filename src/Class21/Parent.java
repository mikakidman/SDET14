package Class21;

public class Parent {

    void getMarry(){
        System.out.println("I love my wife");
    }
}
class Son extends Parent{
    void getMarry(){
        System.out.println("I want to marry Asma");
    }
}
class TestParent {
    public static void main(String[] args) {
        Son son = new Son();
           son.getMarry();
        }
    }


