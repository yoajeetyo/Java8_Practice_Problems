package com.bl.ds;

import java.util.function.Predicate;

public class CheckingLengthOfStringPrintingArrayElement {

	public static void main(String[] args) {
		String[] s = {"Ajeet","Raman","Chandan","Muskan"};
		Predicate<String> predicate = s1->s1.length()>5;
		for (String s2 : s) {
			if (predicate.test(s2)) {
				System.out.println(s2);
			}
		}
	}
}
