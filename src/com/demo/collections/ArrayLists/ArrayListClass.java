package com.demo.collections.ArrayLists;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {


		ArrayList<Integer> elements = new ArrayList<Integer>();

		elements.add(10);
		elements.add(15);
		elements.add(20);

		// Get size and display.
		int count = elements.size();
		System.out.println("Count: " + count);

		// Loop through elements.
		for (int i = 0; i < elements.size(); i++) {
			int value = elements.get(i);
			System.out.println("Element: " + value);
		}
	}
}

