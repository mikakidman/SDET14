package Class21;

import java.beans.JavaBean;

public class task2 {
    public static void main(String[] args) {
        new Programming("Java");
    }
}
class Programming{
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String str){
        System.out.println("I love "+str);
    }
}