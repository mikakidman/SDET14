package Class25;

import java.util.ArrayList;

public class IteratorDemo3 {
    public static void main(String[] args) {
       //delete all the products which start with the letter B or ends with the letter A
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Soap");

       /*var number=10;
       var decimalNumber=21.5;*/

        /*var iterator=beautyProducts.iterator();
        while (iterator.hasNext()){
            var item=iterator.next();
            if(item.startsWith("B")|| item.endsWith("a")){
                iterator.remove();
            }
        }*/   //another way with while loop


        beautyProducts.removeIf(item -> item.startsWith("B") || item.endsWith("a")); //removeif
        System.out.println(beautyProducts);


    }
}
