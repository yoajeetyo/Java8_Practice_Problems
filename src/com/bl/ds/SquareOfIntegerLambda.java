package com.bl.ds;
import java.util.function.*;

public class SquareOfIntegerLambda {

public static void main(String[] args) {
	Function<Integer, Integer> f = i->i*i;
	System.out.println("The square of 40 is : "+f.apply(40));
	System.out.println("The square of 50 is : "+f.apply(50));
}
}
