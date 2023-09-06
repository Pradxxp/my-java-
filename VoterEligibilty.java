package package1;
import java.util.Scanner;

public class VoterEligibilty {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter your age:");
	    int age = s.nextInt();
	    try {
	    	checkAge(age);
	    }
	    catch(Exception e) {
	    	System.out.println("Error:"+e);
	    }
	}
	static void checkAge(int age)throws AgeException{
		if(age>=18) {
			System.out.println("You are eligible!!");
		}
		else {
			throw new AgeException("You are not eligible!");
		}
	}

}
