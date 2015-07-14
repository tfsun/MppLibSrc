package labs.Lab11.prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by rajkumar on 7/14/2015.
 */
public class Sum {
    public static double sum(Collection<? extends Number> nums){
        double sum=0.0;
        for (Number num:nums) sum+=num.doubleValue();
        return sum;
    }

    public static void main(String[] args) {

        //Prob 4 (a)
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Integer> nums = ints;
        double s = sum(nums);
        System.out.println(s);
//        nums.add(3.14); //error occurs here

        //Prob 4 (b)
        List<Object> objects= new ArrayList<>();
        objects.add(1);
        objects.add("two");
        List<? super Integer> ints1= objects;
        ints1.add(3);
//        double dbl= sum(ints1); // error occurs here, because <? super Integer> can't
                                //be passed to <? extends Integer>
    }
}
