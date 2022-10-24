package Class09;

public class TwoDArray {
    public static void main(String[] args) {
        String[][] countries={
                {"USA", "Canada"},//1 array with index 0
                {"Peru", "Barzil", "Colombia"},//2 array with index 1
                {"Ethiopia", "Egypt", "Kenya"},
                {"Germany", "Turkiye", "Moldova"},
                {"Kazakhstan","Korea", "Japan"}
        };
        System.out.println(countries.length);//5-total # of arrays or row

        int elOf1arr=countries[0].length;
        System.out.println(elOf1arr);//2 - # of elements from 1 array

        int elOf2arr=countries[1].length;
        System.out.println(elOf2arr);//# of elements from 2 array

        System.out.println("_________Getting all values from 2d array_________");
        for(int r=0; r< countries.length; r++){  //loops over rows
            for(int c=0; c<countries[r].length; c++){
                System.out.println(countries[r][c]);
            }

        }
    }
}
