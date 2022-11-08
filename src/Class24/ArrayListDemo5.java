package Class24;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String>colors=new ArrayList<>();
        //Use add method to insert elements in an arrayList

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);
      //  colors.remove("Blue");
        colors.remove(2); //removing by index
        System.out.println(colors);
    }
}
