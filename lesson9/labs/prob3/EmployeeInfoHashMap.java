package lesson9.labs.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import lesson9.labs.prob3.EmployeeInfoBetter.SortMethod;

public class EmployeeInfoHashMap {
	static enum SortMethod {BYNAME, BYSALARY};
	static Function<Employee, String> byName = e -> e.getName();
	static Function<Employee, Integer> bySalary = e -> e.getSalary();
	
	public void sort(List<Employee> emps, Pair pair, Map<SortMethod, Function> methodMap) {
		Collections.sort(emps, Comparator
				.comparing(methodMap.get(pair.getMethod1()))
				.thenComparing(methodMap.get(pair.getMethod2())));
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		
		Map<SortMethod, Function> methodMap = 
				new HashMap<SortMethod, Function>();
		
		methodMap.put(SortMethod.BYNAME, byName);
		methodMap.put(SortMethod.BYSALARY, bySalary);
		
		Pair methodPair1 = new Pair(SortMethod.BYNAME, SortMethod.BYSALARY);
		Pair methodPair2 = new Pair(SortMethod.BYSALARY, SortMethod.BYNAME);
		
		EmployeeInfoHashMap ei = new EmployeeInfoHashMap();
		ei.sort(emps, methodPair1, methodMap);
		System.out.println(emps);
		//same instance
		ei.sort(emps, methodPair2, methodMap);
		System.out.println(emps);
	}
}
