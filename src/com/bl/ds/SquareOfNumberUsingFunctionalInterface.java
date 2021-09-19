package com.bl.ds;

@FunctionalInterface
interface SquareIt {
	
	public int squareIt(int number);
}

public class SquareOfNumberUsingFunctionalInterface {
	
	public static void main(String[] args) {
		SquareIt sq =number->number*number ;
		System.out.println("The square of 3 is : "+sq.squareIt(3));
		
	}
}
