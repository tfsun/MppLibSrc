package lesson8.labs.prob4;

import java.lang.reflect.AnnotatedArrayType;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Even more functional approach -- count number of elements 
//using a pure expression -- no auxiliary function calls
//All assignments are atomic.
public class Better {
	final Function<Integer, Predicate<String>> equalLength
    	= len -> name -> name.length() == len;
    
    final Function<String, Predicate<String>> containLetter
    	= letter -> name -> name.indexOf(letter) != -1;
    
    final Function<String, Predicate<String>> notContainLetter
    	= letter -> name -> name.indexOf(letter) == -1;
    	
    	

	final int countWords1 = Folks.friends.stream()
			.filter(equalLength.apply(5))
			.filter(containLetter.apply("c"))
			.filter(notContainLetter.apply("d"))
			.collect(Collectors.toList())
			.size();
	
	final int countWords2 = Folks.friends.stream()
			.filter(equalLength.apply(5))
			.filter(containLetter.apply("d"))
			.filter(notContainLetter.apply("c"))
			.collect(Collectors.toList())
			.size();
	
	public static void main(String[] args) {
		Better b = new Better();

		System.out.println("countWords1: " + b.countWords1);
		System.out.println("countWords2: " + b.countWords2);
	}
}
