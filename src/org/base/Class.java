package org.base;

import java.util.ArrayList;
import java.util.List;

public class Class {

	public static void main(String[] args) {
		// Create a list of strings
		List<String> stringList = new ArrayList<>();
		System.out.println("hii");
		// Add elements to the list
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Cherry");
		stringList.add("Durian");

		// Print the list
		System.out.println("The list contains: " + stringList);

		// Remove an element from the list
		stringList.remove("Banana");

		// Print the updated list
		System.out.println("The updated list contains: " + stringList);

		// Get an element at a specific index
		System.out.println("The element at index 1 is: " + stringList.get(1));

		// Check if an element is in the list
		System.out.println("Does the list contain Durian? " + stringList.contains("Durian"));

		// Get the size of the list
		System.out.println("The size of the list is: " + stringList.size());
	}
}
