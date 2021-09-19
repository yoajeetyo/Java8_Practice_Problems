package com.bl.ds;

import java.util.*;

class MyComparator implements Comparator<Integer> {
	public int compare(Integer I1, Integer I2) {
		if (I1 > I2) {
			return 1;
		} else if (I1 < I2) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class CollectionShortUsingComparatorInterface {

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
		Collections.sort(list , new MyComparator());
		System.out.println(list);
	}
}
