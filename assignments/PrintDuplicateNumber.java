package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {4,3,6,8,29,1,2,4,7,8};
		//Arrays.sort(data);
		Set<Integer> uniqno = new TreeSet<Integer>();
		Set<Integer> dupno1 = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
		boolean add =	uniqno.add(data[i]);
		
		if(!add) {
			System.out.println(dupno1.add(data[i]));
		}
		
	}
		System.out.println("the unique values are:" +uniqno);
		System.out.println("the duplicate values are:" +dupno1);
	}
}


