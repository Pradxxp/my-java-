package myfirst;
import java.util.Scanner;

public class Exp1StudDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of subjects:");
		int n=s.nextInt();
		int[] arr=new int[n];
		int sum=0;
	    int avg=0;
		int flag=0;
		System.out.println("Enter marks:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<50) {
				System.out.println("You Failed :( ");
				flag++;
				break;
				
			}
			else {
				sum+=arr[i];
				avg=sum/n;
				
			}
		
		}
	    if(flag==0) {
	    	System.out.println("your average:"+avg);
	    }
	}
}
