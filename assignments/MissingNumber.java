package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[] arr = {1,2,3,3,4,7,6,8,10};
		//a) Remove the duplicates using Set [and] b) Make sure the set is in the ascending order
		Set<Integer> arrset = new TreeSet<Integer>();		
		for(int i=0;i<arr.length;i++) {
			arrset.add(arr[i]);
		}
		System.out.print("Missing element in the array is: "+arrset);
		
		//c) Iterate from the starting number and verify the next number is + 1 [and] d) If did not match, that is the number
		int count = 0;
		for(int i : arrset) {
			if((count+1)!=i) {
				System.out.print(count + 1 + " ");
				count++;
			}
			count++;
	}
}
}

