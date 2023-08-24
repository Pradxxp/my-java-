package pradeep;
import java.util.Scanner;

public class primeornot {
	public static void main(String[] args) {
		System.out.println("enter number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		for(int i=2;i<n;i++) {
			if((n%i)==0) {
				flag++;
				break;
				
			}
		}
		if(flag==0) {
			System.out.println("Number is prime");
			
		}
		else {
			System.out.println("Number not prime");
		}
	}

}
