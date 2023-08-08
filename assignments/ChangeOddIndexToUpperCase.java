package week3.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		   String test = "changeme";
		char[] a = test.toCharArray();
		int count =0;
		for (int i=0;i<a.length;i++) {
			count = i+1;
			if(count%2==1) {
			a[i] = Character.toUpperCase(a[i]);
			}
		}
		
		System.out.println("The character at odd index position of the string :" + test + "are converted to upper case as ");
		
		for (char ch : a) {
			System.out.println(ch);
		}
	

}
}
