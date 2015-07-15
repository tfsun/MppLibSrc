package lesson10.labs.prob7.soln2;

import static org.junit.Assert.*;

import lesson10.labs.prob7.Employee;

public class Test {

	@org.junit.Test
	public void test() {
        Employee e1 = new Employee("John", "Sims", 110000);
        Employee e2 = new Employee("Joe", "Stevens", 200000);
        Employee e3 = new Employee("Andrew", "Reardon", 80000);
        Employee e4 = new Employee("Joe", "Cummings", 760000);
        
        // Test the auxiliary method salaryGreaterThan100000
        assertTrue(Employee.salaryGreaterThan100000(e1));
        assertTrue(Employee.salaryGreaterThan100000(e2));
        assertFalse(Employee.salaryGreaterThan100000(e3));
        assertTrue(Employee.salaryGreaterThan100000(e4));
        
        // Test the auxiliary method lastNameAfterMEmployee
        assertTrue(Employee.lastNameAfterMEmployee(e1));
        assertTrue(Employee.lastNameAfterMEmployee(e2));
        assertTrue(Employee.lastNameAfterMEmployee(e3));
        assertFalse(Employee.lastNameAfterMEmployee(e4));
        
        // Test fullname
        assertEquals(Employee.fullName(e1), "John Sims");
        assertEquals(Employee.fullName(e2), "Joe Stevens");
        assertEquals(Employee.fullName(e3), "Andrew Reardon");
        assertEquals(Employee.fullName(e4), "Joe Cummings");
	}
}
