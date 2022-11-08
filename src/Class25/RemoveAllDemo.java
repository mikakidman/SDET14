package Class25;

import java.util.ArrayList;

public class RemoveAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItems=new ArrayList<>();
        makeUpItems.add("Blush");
        makeUpItems.add("Base");
        makeUpItems.add("Concealer");
        makeUpItems.add("Mascara");
        makeUpItems.add("EyeLiner");
        makeUpItems.add("Lipstick");

       ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Blush");
        itemsToBeRemoved.add("Base");
        itemsToBeRemoved.add("Concealer");

        makeUpItems.removeAll(itemsToBeRemoved);
        //makeUpItems.clear(); //everything will be removed
        System.out.println(makeUpItems);
    }
}
