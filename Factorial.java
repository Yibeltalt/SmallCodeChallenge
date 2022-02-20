package codechallenge;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter n :");
		int n = sc.nextInt();
		int res =1;
		for (int i=n;i>0;i--)
		{
			res=res*i;
		}
		System.out.println("Factorial :"+res);
		
	}

}
