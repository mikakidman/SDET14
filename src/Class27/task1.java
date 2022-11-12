package Class27;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {

        ArrayList<Insurance>insurances=new ArrayList<>();
        insurances.add(new Car("State Farm", "Toyota Highlander Platinum"));
        insurances.add(new Health("Geico"));
        insurances.add(new Health("State Life"));

        System.out.println(insurances);

        for(Insurance i:insurances){
            i.getQuote();
            i.cancelInsurance();
        }

    }
}
