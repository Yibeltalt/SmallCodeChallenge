package codechallenge;

import java.util.Scanner;

public class Binnaryonecount {

	public static void main(String[] args) {
		
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter the size :");
	        int n = in.nextInt();
	        int count=0;
	        for (int i = 0; i < n; i++) 
	        	{
	        		System.out.println("-------------"+(i+1)+ "Number-------------");
	        		count=0;
	        		System.out.print("Enter the Number :");
	        		long x = in.nextInt();
	            	String ben=Long.toBinaryString(x);
	            	System.out.println("The number in binary format :"+ben);
	            	char [] ch = ben.toCharArray();
	            	for(int j=0;j<ch.length;j++)
	            		{
	            			if(ch[j]=='1')
	            					count++;
	            		}	            
	            	System.out.println("Total number of ones :"+count);
	        	}
	        System.out.println("==========================");
	        System.out.println("The soultion is compeleted");
	        System.out.println("==========================");
	}

}
