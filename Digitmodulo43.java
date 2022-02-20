package codechallenge;

import java.util.Scanner;

public class Digitmodulo43 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the first Numeber :");
		int n = sc.nextInt();
		System.out.print("Enter the Second Numbet :");
		int m = sc.nextInt();
		
		
		int res =1;
		int res1=1;
		int ch=1,chs=1;
		while (n>9) {
			
			ch=n%10;
			res=res*ch;
			n=n/10;
			
		}
		System.out.println(ch);
		System.out.println(n);
		System.out.println(res*n);
		res=(res*n)%43;
		System.out.println(res);
		System.out.println("------------------------------");
		while (m>9) {
			
			chs=m%10;
			res1=res1*chs;
			m=m/10;
			
		}
		System.out.println(chs);
		System.out.println(m);
		System.out.println(res1*m);
		res1=(res1*m)%43;
		System.out.println(res1);
		
		System.out.println("------------------------------");
		if (res==res1)
			System.out.println(res1);
		else 
			System.out.println(-1);
			

	}
}

