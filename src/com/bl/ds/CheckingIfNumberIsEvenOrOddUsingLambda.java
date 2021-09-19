package com.bl.ds;

import java.util.function.*;

public class CheckingIfNumberIsEvenOrOddUsingLambda {
public static void main(String[] args) {
	Predicate<Integer> checkPredicate = i->i%2==0;
	System.out.println(checkPredicate.test(4));
	System.out.println(checkPredicate.test(9));
}
}
