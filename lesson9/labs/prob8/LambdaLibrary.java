package lesson9.labs.prob8;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibrary {

	 public static final TriFunction<List<Employee>, Character, Integer, Long> SEARCHNUM 
	  		= (list, searchCh, minSalary) 
	  		     -> list.stream()
				        .filter(e -> e.getLastName().charAt(0) > searchCh && e.getLastName().charAt(0) <= 'Z' && e.getSalary()>minSalary)
						.map(e -> e.getFirstName() + " " + e.getLastName())
						.count();

	 public static final TriFunction<List<Employee>, Character, Integer, List<String>> SEARCHEMPLYEE
	= (list, searchCh, minSalary) 
	     -> list.stream()
		        .filter(e -> e.getFirstName().charAt(0) < searchCh && e.getFirstName().charAt(0) >= 'A' && e.getSalary()>minSalary)
				.map(e -> e.getFirstName().toUpperCase() + " " + e.getLastName().toUpperCase())
				.sorted()
				.collect(Collectors.toList());
}
