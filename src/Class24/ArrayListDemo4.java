package Class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Meruyert");
        names.add("Mika");
        names.add("Mia");
        names.add(0,"Batyr");//shift
        names.set(2,"Deni"); //replace
        System.out.println(names);

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1,40);
        numbers.set(0,50);
        System.out.println(numbers);
        numbers.clear(); //deletes all the elements from the list
        System.out.println(numbers);

    }
}
