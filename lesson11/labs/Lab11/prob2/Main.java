package labs.Lab11.prob2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajkumar on 7/14/2015.
 */
public class Main {
    public static void main(String[] args) {
        List<String > strList = new ArrayList<String>(){
            {
                add("yogen");
                add("Qin");
                add("Sun");
                add("Michael");
            }
        };
        System.out.println(strList.toString());
        Capture.reverse(strList);
    }
}
