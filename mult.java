package pradeep;

import java.util.Scanner;
public class mult {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        int[][] c=new int[n][n];
        
        System.out.println("enter matrix 1 elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter matrix 2 elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=0;
                for(int k=0;k<n;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("resultant matrix:");
        for(int i=0;i<n;i++){
        	System.out.println();
            for(int j=0;j<n;j++){
            	System.out.print(c[i][j]+" ");
                
            }
        }
    }
}