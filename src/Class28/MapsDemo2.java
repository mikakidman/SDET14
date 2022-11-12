package Class28;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("IPhone 14", 1299.9);
        items.put("Eggs", 7.5);
        items.put("Apples", 12.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 7.0);

        items.keySet().removeIf(name->name.contains("e"));
        System.out.println(items);
    }
}
