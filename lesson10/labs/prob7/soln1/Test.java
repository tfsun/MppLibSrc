package lesson10.labs.prob7.soln1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lesson10.labs.prob7.Employee;

public class Test {

	@org.junit.Test
	public void test() {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
		        new Employee("John", "Sims", 110000),
		        new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000)).stream();

		String result = "Alice Richards, Joe Stevens, John Sims, Steven Walters";
		assertEquals(Employee.asString(emps.collect(Collectors.toList())), result);
		
	}

}
