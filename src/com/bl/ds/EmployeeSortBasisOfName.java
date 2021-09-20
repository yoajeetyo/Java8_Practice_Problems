package com.bl.ds;

import java.util.ArrayList;
import java.util.Collections;

class Employee3 {
	String name;
	int eno;

	public Employee3(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}

	public String toString() {
		return eno + " : " + name;
	}
}

public class EmployeeSortBasisOfName {

	public static void main(String[] args) {
		ArrayList<Employee1> employees = new ArrayList<Employee1>();
		employees.add(new Employee1("Ajeet", 200));
		employees.add(new Employee1("Rama", 100));
		employees.add(new Employee1("Sita", 105));
		employees.add(new Employee1("Aman", 600));
		System.out.println(employees);
		Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));
		System.out.println("After Sorting :");
		System.out.println(employees);
	}
}
