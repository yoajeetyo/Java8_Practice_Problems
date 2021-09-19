package com.bl.ds;

@FunctionalInterface
interface AddInt{
	public int add(int number1 , int number2);
}

public class Add {

	public static void main(String[] args) {
		AddInt interf = (number1 , number2)->number1+number2;
		System.out.println("The sum of given number is : "+interf.add(10, 20));
	}
}
