package com.bl.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionFindEvenUsingFilter {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(25);
		list.add(5);
		list.add(0);
		list.add(15);
		list.add(30);
		System.out.println(list);
		Comparator<Integer> comparator = (I1, I2) -> (I1 > I2) ? 1 : (I1 < I2) ? -1 : 0;
		Collections.sort(list, comparator);
		list.stream().forEach(System.out::println);
		List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list1);
	}
}
