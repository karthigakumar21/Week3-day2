package week3.day2.assignments;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		// Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

		// get the length of the array		

		// sort the array			

		// Iterate it in the reverse order

		// print the array
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems

		
		String[] names= {"Google","Tcs","Infosis","Hcl","Cts"};
		int n = names.length;
		
		Arrays.sort(names);
		System.out.println("the Sorting of string values is:");
		for (int i = 0; i < n; i++) {
			
			System.out.println(names[i]);
		}
		

		
	}

}
