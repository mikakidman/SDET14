package Class09;

public class ArraysDemo {
    public static void main(String[] args) {
        int[]nums=new int[4];
        nums[0]=10;
        System.out.println(nums[1]);//0
        //nums.length--> tells how many elements
        //how to get all elements from an array?
        for(int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
