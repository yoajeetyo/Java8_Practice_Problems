package com.bl.ds;

class Employee {
	String name;
	int eno;
	
	public Employee(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	
	public String toString() {
		return eno+" : "+name;
	}
}

public class EmployeeDataPrintingGeneralWay {

	public static void main(String[] args) {
		Employee employee = new Employee("Ajeet", 101);
		System.out.println(employee);
	}
}
