package lesson8.labs.prob4;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Advanced {
	@FunctionalInterface
	interface QuaFunction<T, U, V, W, R> {
	    R apply(T t, U u, V v, W w);
	}
	final QuaFunction<List<String>, Integer, String, String, Integer> listSatisfied 
	    = (list, len, letter1, letter2) -> list.stream()
				    	     .filter(name -> name.length() == len) 
				    	     .filter(name -> name.indexOf(letter1) !=-1)  
				    	     .filter(name -> name.indexOf(letter2) ==-1)
				    	     .collect(Collectors.toList())
				    	     .size(); 

	final int countWords1 = listSatisfied.apply(Folks.friends, 5, "c", "d");

	final int countWords2 = listSatisfied.apply(Folks.friends, 5, "d", "c");;

	public static void main(String[] args) {
		Advanced adv = new Advanced();

		System.out.println("countWords1: "
				+ adv.countWords1);
		System.out.println("countWords2: "
				+ adv.countWords2);
	}
}
