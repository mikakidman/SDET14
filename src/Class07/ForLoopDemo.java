package Class07;

public class ForLoopDemo {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println("Hello");
        }

        //print numbers from 1 to 20
        for(int i=1; i<=20; i++){
            System.out.println((i+" "));
        }
        System.out.println("_________________");
        //print numbers from 30 to 10
        for(int i=30; i>=10; i--){
            System.out.println(i+" ");
        }

        System.out.println("_________________");
        int sum=0;
        for(int i=1; i<=6; i++){
            sum+=i;
        }
        System.out.println(sum);//1
    }
}
