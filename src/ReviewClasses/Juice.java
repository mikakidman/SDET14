package ReviewClasses;
class Drink{
    void drink(){
        System.out.println("drinking method");
    }
    //final methods can not be overridden
    protected final void enjoy(){
        System.out.println("We enjoy drinking water");
    }
}
public class Juice extends Drink {
/*CE: Cannot override the final method from Drink
   public void enjoy(){
        System.out.println("We enjoy drinking juice");

    }*/

}
