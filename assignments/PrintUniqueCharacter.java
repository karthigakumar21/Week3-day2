package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		String str="Karthika";
		char[] name = str.toLowerCase().toCharArray();
		System.out.println(str.toCharArray());
		
		Set<Character> uniq = new HashSet<Character>();
		Set<Character> dup = new TreeSet<Character>();
		for (int i = 0; i < name.length; i++) {
			
			if (!(uniq.add(name[i]))) {
				dup.add(name[i]);
			}
		System.out.println(dup);
		}
		uniq.removeAll(dup);
		for (Character c : dup) {
			System.out.println("the duplicate character is :" +c);
		}
	}

}
