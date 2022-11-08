package Class25;

import java.util.ArrayList;

public class IteratorDemo1 {
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

        for(int i=0; i<beautyProducts.size(); i++){
            if(beautyProducts.get(i).endsWith("r")){
                beautyProducts.remove(i);
            }
        }
       /* for(String item: beautyProducts){     //AVOID USING LOOP WITH ARRAY LIST
            if(item.endsWith("r")){
                beautyProducts.remove(item);
            }
        }*/
        System.out.println(beautyProducts);
    }
}
