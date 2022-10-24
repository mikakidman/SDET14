package Class07;

public class WhileLoopDemo {
    public static void main(String[] args) {
        //print all numbers from 1 to 10
        int num=1;
        while(num<=10){
            System.out.println(num);
            num++;
        }
        System.out.println("______________");
        //print all numbers from 10 to 25
        int a=10;
        while(a<=25){
            System.out.println(a);
            a++;
        }
        System.out.println("___________________");
        //print all evem numbers from 1 to 20

        int b=2;
        while(b<=20){
            System.out.println(b+" ");
            b+=2;
        }
        System.out.println("Another way");
        int i=1;
        while(i<=20){
            if(i%2==0){
                System.out.println(i+" ");
            }
            i++;
        }
    }
}
