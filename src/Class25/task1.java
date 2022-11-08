package Class25;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(5);
        names.add("Mika");
        names.add("Miko");
        names.add("Meru");
        names.add("Monti");
        names.add("Mikosh");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mika"));
        System.out.println(names.contains("Diko"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
