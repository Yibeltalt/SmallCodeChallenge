package codechallenge;

public class Noddnumber {

	public static void main(String[] args) {
		
		int n=4;
		int i=0,sum=0,count=0;
		while(count<n) {
			
			
			if(i%2!=0) {
				System.out.print(i+" ");
				sum=sum+i;
				count++;
				i++;
				
			}
			i++;
			
		}

		System.out.println(" ");
		System.out.println("The sum of N odd numbers :"+ sum);
		
	}

}
//other way to do it



//import java.util.*;
//import java.io.*;
//import java.math.*;
//
///**
// * Find the sum of the first n odd integers!
// * (e.g. n=4: 1+3+5+7=16)
// **/
//class Solution {
//
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(); // the number of odd integers
//        long sum = 0;
//        // Write an answer using System.out.println()
//        // To debug: System.err.println("Debug messages...");
//        for (int i = 1; i < n*2; i+=2){
//            sum += i;
//        }
//        System.out.println(sum);
//    }
//}