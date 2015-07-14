package labs.Lab11.prob5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajkumar on 7/14/2015.
 */
public class SecondSmallest {
    public static void   secondSmallest(List<? extends Number> numbers){
        double smallest1 = numbers.get(0).doubleValue();
        double smallest2 = numbers.get(0).doubleValue();

        int size = numbers.size();
        for (int index = 1; index < size - 1; index++) {
            double current =numbers.get(index).doubleValue();

            if(smallest1 > current){
                smallest2 = smallest1;
                smallest1 = current;
            }
            else if( current != smallest1 && smallest2>current){
                smallest2 = current;
            }
        }
        System.out.println(smallest2);
//        return smallest2;
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>(){
            {
                add(-1);
                add(1);
                add(8);
                add(-5);
                add(-1);
                add(-5);
                add(4);
            }
        };

        List<Double> doubles = new ArrayList<Double>(){
            {
                add(-1.1);
                add(1.1);
                add(8.0);
                add(-5.0);
                add(-1.1);
                add(-5.0);
                add(4.2);
            }
        };

        secondSmallest(integers);
        secondSmallest(doubles);

    }
}
