package codechallenge;

import java.util.Scanner;

public class Drawing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		//n=3
		int x=n*2-1;
		while(x>=0)
		{
			for (int j=0;j<x;j++) {
				System.out.print(" ");	
			} 
			
			if (x%2!=0) {
				System.out.println("|");
			}else {
				System.out.println("--");
			}
			
			x--;
		}
		
	}

}
