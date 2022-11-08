package Class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String>makeUpItems=new ArrayList<>();
        makeUpItems.add("Blush");
        makeUpItems.add("Base");
        makeUpItems.add("Concealer");
        makeUpItems.add("Mascara");
        makeUpItems.add("EyeLiner");
        makeUpItems.add("Lipstick");

        ArrayList<String>cosmetics=new ArrayList<>();
        cosmetics.add("Soap");
        cosmetics.add("Shampoo");
        cosmetics.add("Conditioner");
        cosmetics.add("Lotion");

        ArrayList<String>beautyProducts=new ArrayList<>();
        beautyProducts.addAll(makeUpItems);     //add everything from  the list
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("Lotion");  //delete one element from the list
        System.out.println(beautyProducts);
        beautyProducts.removeAll(cosmetics); //delete everything from the list
        System.out.println(beautyProducts);
        beautyProducts.clear();   //delete everything
        System.out.println(beautyProducts);
    }
}
