package pradeep;
import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args) {
    	try {
    		int[] a=new int[2];
    		System.out.println("element three: "+a[3]);
    	}
    	catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("Exception thrown: "+e);
    		
    	}
    }
}
