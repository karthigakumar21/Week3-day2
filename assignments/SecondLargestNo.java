package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNo {

	public static void main(String[] args) {
		
		 
		  
		// Here is the input
			int[] data = {3,2,11,4,6,7,2,3,3,6,7};
			//       output= 7;

			/*
			// * Pseudo Code: 
			 * a) Create a empty Set Using TreeSet
			
			 * b) Declare for loop iterator from 0 to data.length and add into Set 
			 * c) converted Set into List
			 * d) Print the second last element from List
			 * 
			 * 
			 */
			Set<Integer> val = new TreeSet<Integer>();
			for (int i = 0; i < data.length; i++) {
				val.add(data[i]);
				
			}
			List<Integer> val1 = new ArrayList<Integer>();
			val1.addAll(val);
			System.out.println(val1);
			System.out.println("the second Largest value is :" +val1.get(val1.size()-2));
	
		 
			
		}
		
		
		
	
		

}
