package pradeep;
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String rev="";
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string:");
		String input = s.next();
		boolean ans = false;
		for(int i=input.length()-1 ; i>=0 ; i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println("reversed string is "+rev);
		if(input.equals(rev)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
		
	}

}
