package com.bl.ds;

@FunctionalInterface
interface Interf {
	
	public void print();
}

public class PrintingSimpleStatementUsingLambda {
	
public static void main(String[] args) {
	Interf interf =()-> System.out.println("Welcome to functional interface !!");
	interf.print();
}
}
