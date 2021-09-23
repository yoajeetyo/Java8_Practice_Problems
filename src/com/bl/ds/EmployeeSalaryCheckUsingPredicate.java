package com.bl.ds;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employees {
	String name;
	int salary;

	public Employees(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

public class EmployeeSalaryCheckUsingPredicate {

	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
		list.add(new Employees("x", 3000));
		list.add(new Employees("Ajeet", 5000));
		list.add(new Employees("Raman", 8000));
		list.add(new Employees("Chanda", 6000));
		list.add(new Employees("Monu", 4000));
		Predicate<Employees> predicate = p -> p.salary > 4000;
		for (Employees employee : list) {
			if (predicate.test(employee)) {
				System.out.println(employee.name + " : " + employee.salary);
			}
		}
	}
}
