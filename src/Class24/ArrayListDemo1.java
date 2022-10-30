package Class24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String>colors=new ArrayList<>();
        //add elemets to Array
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println(colors);
        System.out.println(colors.get(0)); //get elements Array
        System.out.println(colors.get(2));

        //how many elements are in array
        System.out.println(colors.size());

        for(int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i)); //get all the elements array
        }

        System.out.println("*************");
        //using enhanced for loop
        for(String color:colors){
            System.out.println(color);
        }

    }
}
