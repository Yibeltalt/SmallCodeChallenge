package codechallenge;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = sc.nextInt();
		int result = 0;
		
		int first=0;
		int second=1;
		
		if(n==0)
		{
			result=first;
		}else if (n==1)
		{
			result=second;
		}
		else {
			for (int i=1;i<n;i++)
			{
				result = first + second;
				System.out.println(first+"|"+second+"|"+result);
				first = second;
				second = result;
				
				
			}
		}
		
		System.out.println(result);
	}

}
