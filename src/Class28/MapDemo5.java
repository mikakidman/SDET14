package Class28;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("IPhone 14", 1299.9);
        items.put("Eggs", 7.5);
        items.put("Apples", 12.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 7.0);

        /*var iterator=items.entrySet().iterator();
        while (iterator.hasNext()){
            var item=iterator.next();
            var key=item.getKey();
            var value=item.getValue();
            if(key.contains("e")&&value>10){
                iterator.remove();
            }
        }
         */
        items.entrySet().removeIf(entry->entry.getKey().contains("e")&& entry.getValue()>10);
        System.out.println(items);
    }
}
