package codechallenge;

import java.util.Scanner;

public class FibonacciNew {

	public static void main(String[] args) {
		
		int n,fi=0,sec=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size :");
		n=sc.nextInt();
		int []res=new int [n];
		for(int i=0;i<n;i++) {
			
			if(i==0) {
				res[i]=0;
				fi=0;
			}else if(i==1) {
				res[i]=1;
				sec=1;
			}else {
				res[i]=fi+sec;
				fi=sec;
				sec=res[i];
			}
			
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(res[i]+" ");
		}
		
		
		
		
		
		
		
		
		

	}

}
