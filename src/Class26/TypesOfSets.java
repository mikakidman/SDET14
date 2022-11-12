package Class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesOfSets {
    public static void main(String[] args) {
        //There are three types of sets
        //HashSet: does NOT care about the insertion order

        HashSet<String> hashSet=new HashSet<>(); //no order, but fastest
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println(hashSet);
        System.out.println("***************");

        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>(); //insertion speed is same as HashSet,
        // but retrieval speed is the worst
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println(linkedHashSet);
        System.out.println("******************");

        TreeSet<String> treeSet=new TreeSet<>(); //When ever you need sorted data use TreeSet
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println(treeSet);

    }
}
