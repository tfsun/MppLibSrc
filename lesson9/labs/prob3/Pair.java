package lesson9.labs.prob3;

import java.util.List;

public class Pair {
	private EmployeeInfoHashMap.SortMethod method1;
	private EmployeeInfoHashMap.SortMethod method2;

	public Pair(EmployeeInfoHashMap.SortMethod m1, EmployeeInfoHashMap.SortMethod m2) {
		this.method1 = m1;
		this.method2 = m2;
	}
	
	public EmployeeInfoHashMap.SortMethod getMethod1() {
		return method1;
	}


	public void setMethod1(EmployeeInfoHashMap.SortMethod method1) {
		this.method1 = method1;
	}


	public EmployeeInfoHashMap.SortMethod getMethod2() {
		return method2;
	}


	public void setMethod2(EmployeeInfoHashMap.SortMethod method2) {
		this.method2 = method2;
	}

	public String toString() {
		return "(" + method1 + ", " + method2 + ")";
	}
}
