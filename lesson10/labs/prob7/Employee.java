package lesson10.labs.prob7;

import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	String firstName, lastName;
	

	int salary;
	public Employee(String f, String l, int s) {
		this.firstName = f;
		this.lastName = l;
		this.salary = s;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("first name: ");
		sb.append(firstName);
		sb.append(" last name: ");
		sb.append(lastName);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}
	
	public static String asString(List<Employee> emps){
		return emps.stream()
			    .filter(Employee::salaryGreaterThan100000)
			    .filter(Employee::lastNameAfterMEmployee)
			    .map(e -> fullName(e))
			    .sorted()
			    .collect(Collectors.joining(", "));
	}
	public static boolean salaryGreaterThan100000(Employee e){
		return e.getSalary() > 100000;
	}
	public static boolean lastNameAfterMEmployee(Employee e){
		return e.getLastName().charAt(0) > 'M';
	}
	public static void printEmps(List<Employee> emps){
		System.out.println(asString(emps));
	}
	
	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

