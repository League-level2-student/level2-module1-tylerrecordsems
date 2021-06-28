package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> name = new ArrayList<String>();
		//2. Add five Strings to your list
		name.add("Tim");
		name.add("James");
		name.add("Jamie");
		name.add("Jack");
		name.add("Ian");
		//3. Print all the Strings using a standard for-loop
//		for (int i = 0; i < 5; i++) {
//			String s = name.get(i);
//			System.out.println(i+" "+s);
//		}
		//4. Print all the Strings using a for-each loop
//		for (String yes : name) {
//			System.out.println(yes);
//		}
		//5. Print only the even numbered elements in the list.
//	for (int i = 0; i < name.size(); i+=2) {
//		System.out.println(name.get(i));
//	}
		//6. Print all the Strings in reverse order.
//	for (int i = name.size()-1; i >= 0; i--) {
//		System.out.println(name.get(i));
//	}
		//7. Print only the Strings that have the letter 'e' in them.
	for (int i = 0; i < name.size(); i++) {
		
		if(!name.get(i).contains("e")) {
			System.out.println(name.get(i));
		}
		if (name.get(i).contains("e")) {
		System.out.println(name.get(i)+" Contains a E");
	}
	}
	}
}
