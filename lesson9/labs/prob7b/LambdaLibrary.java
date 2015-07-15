package lesson9.labs.prob7b;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibrary {

	 public static final TriFunction<List<Employee>, Character, Integer, List<String>> SEARCHEMPLYEE 
	  		= (list, searchCh, minSalary) 
	  		     -> list.stream()
				        .filter(e -> e.getLastName().charAt(0) > searchCh && e.getFirstName().indexOf(0) <= 'Z' && e.getSalary()>minSalary)
						.map(e -> e.getFirstName() + " " + e.getLastName())
						.sorted()
						.collect(Collectors.toList());
	 
}
