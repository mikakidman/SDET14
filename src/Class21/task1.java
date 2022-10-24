package Class21;
public class task1 {
    public static void main(String[] args) {
        areaManager areaManager=new areaManager();
        areaManager.calculateArea(10);
        areaManager.calculateArea(10,12);
        areaManager.calculateVolume(10,12,14);
    }

}
class areaManager{
    void calculateArea(double len, double wid){
        System.out.println(len*wid);
    }
    void calculateArea(double len){
        System.out.println(len*len);
    }
    void calculateVolume(double len, double height, double wid){
        System.out.println(len*height*wid);
    }
}