package Class28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("IPhone 14", 1299.9);
        items.put("Eggs", 7.5);
        items.put("Apples", 12.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 7.0);

        Set<String> keys=items.keySet(); //keySet method returns a Set that contains all the key of a map
        //Collection<String> keys2=items.keySet();
        for (String key: keys){
            System.out.println(key);
        }
        //write code to print all values from a map using a loop

        var values=items.values();
        for (Double value:values){
            System.out.println(value);
        }
    }
}
