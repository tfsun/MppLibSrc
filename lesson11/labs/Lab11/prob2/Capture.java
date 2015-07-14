package labs.Lab11.prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Capture {
	public static void reverse(List<?> items){
		System.out.println(reverseHelper(items));
	}
	//helper method
	private static <T> List<T> reverseHelper(List<T> items){

		for(int i=0;i< items.size()/2;i++){
			T temp = items.get(i);
			items.set(i,items.get(items.size()-i-1));
			items.set(items.size()-i-1,temp);
		}
		return items;
	}
}
