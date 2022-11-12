package Class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("IPhone 14", 1299.9);
        items.put("Eggs", 7.5);
        items.put("Apples", 12.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 7.0);

        //Set<Map.Entry<String, Double>> entrySet=items.entrySet();
        var entrySet=items.entrySet();
        System.out.println(entrySet);

        for (var item:entrySet){
            System.out.println(item.getKey()+" "+item.getValue());
        }

    }
}
