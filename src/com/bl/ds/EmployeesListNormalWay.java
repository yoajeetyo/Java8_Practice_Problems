package com.bl.ds;

import java.util.ArrayList;

class Employee1 {
	String name;
	int eno;
	
	public Employee1(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	
	public String toString() {
		return eno+" : "+name;
	}
}

public class EmployeesListNormalWay {

	public static void main(String[] args) {
		ArrayList<Employee1> employees = new ArrayList<Employee1>();
		employees.add(new Employee1("Ajeet", 200));
		employees.add(new Employee1("Rama", 100));
		employees.add(new Employee1("Sita", 105));
		employees.add(new Employee1("Aman", 600));
		System.out.println(employees);
	}
}