package Class22;

public class Car {
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use the break to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("Use Push start to start me");
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("You can also use auto-brake to stop me");
    }
}
class Toyota extends Car{
    void start(){
        System.out.println("Push me to start");
    }
}
class Tesla extends Car{
    void start(){
        System.out.println("Use the APP to start me");
    }

    @Override
    void stop() {
        System.out.println("Use AI and Auto break to stop me");
    }

    @Override
    void park() {
        System.out.println("I can auto park myself");
    }
}