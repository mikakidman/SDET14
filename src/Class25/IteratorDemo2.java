package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Concealer");
        beautyProducts.add("Mascara");
        beautyProducts.add("EyeLiner");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");

        Iterator<String>iterator=beautyProducts.iterator();

        while (iterator.hasNext()){
            String item=iterator.next();
            if(item.endsWith("r")){
              iterator.remove();
            }
        }
        System.out.println(beautyProducts);

    }

}
