package week3.day2.assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 

		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";
		 *
		 *Output= We learn java basics as part of sessions in week1
		 *
		 * Psuedocode
		 *
		 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
		 * c) Create a empty Set 
		 * d) Iterate the String array
	                 d.1) add each word into Set
		 * e) Print the Set values which is having unique words
		 */
		String str = "We learn java basics as part of java sessions in java week1";
		String[] s = str.split(" ");
		System.out.println(s);
		Set<String> remove =  new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			remove.add(s[i]);
			
			
		}
		System.out.println(remove);
		}
	}


