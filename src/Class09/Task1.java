package Class09;

public class Task1 {
    public static void main(String[] args) {
        //From an array of int elements find the largest number

        int[]num={100,4000,50,2,7,55,-150,98};
        int largestNum=num[0];
        for(int i=1; i<num.length; i++){
            if(num[i]>largestNum){
                largestNum=num[i];
            }
        }
        System.out.println(largestNum);
    }
}
