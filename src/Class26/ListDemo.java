package Class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer > numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);

        HashSet<Integer>setNumbers=new HashSet<>();
        setNumbers.add(10);
        setNumbers.add(20);
        setNumbers.add(10);
        System.out.println(setNumbers); //SET does NOT allow Duplicate Numbers




    }
}


