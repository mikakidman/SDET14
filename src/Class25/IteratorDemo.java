package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
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

        Iterator<String> iterator=beautyProducts.iterator(); //get the iterator from the list
       /* System.out.println(iterator.hasNext()); //we have one method
        System.out.println(iterator.next()); //it gives us the item and also removes the items from iterator
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.next();
        System.out.println(iterator.next()); */ //Mascara

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
