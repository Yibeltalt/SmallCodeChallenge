package codechallenge;

import java.util.Scanner;

public class Soultion {

	public static void main(String[] args) {
		
		
		//Scanner in = new Scanner(System.in);
		//System.out.println("number of Primes");
		//int n = in.nextInt();
		int n =2;
//		System.out.println("number of lists to be checked");
//		int m = in.nextInt();
		int m =10;
		//int [] p = new int[n];
		//int [] x = new int[m];
		StringBuilder str=new StringBuilder();
		//FFTFFTTFFF
		//FFTFFTTFFF
		int [] p = {3,7};
		//		for (int i = 0; i < n; i++) {
//			System.out.println("Insert Prime Number :");
//			 p[i] = in.nextInt();
//		}
//		for (int i = 0; i < m; i++)
//			{
//			System.out.println("Insert Numbers :");
//			x[i] = in.nextInt();
//			}
		int check;
		int [] x= {998,575,987,459,54,21,63,758,132,395};
		int flag;
		for (int i = 0; i < m; i++) {
		    flag = 0;
		    check = 0;
			for (int j = 0; j < n; j++) {
				if(x[i]%p[j]!=0)
				{
				  System.out.println(x[i]+"|"+i+"|"+flag);
				  flag = 1;
				  check = 1;
				  System.out.println(x[i]+"|"+i+"|"+flag);
				  break;
				}
			}
			System.out.println(flag);
			if (flag == 1)
			{
			    str.append('F');
			}else if (check==0){
				str.append('T');
			}
		}
		 System.out.println(str);

	}
		

	}
	
