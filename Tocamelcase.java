package codechallenge;

import java.util.Scanner;

//Input
// str = "test_case";
// str = "test_case_case"
//Output
// testCase
// testCaseCase


public class Tocamelcase {

	public static void main(String[] args) {
		System.out.println("Enter a String like (test_case) :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		char [] ch = str.toCharArray();
		int i = 0;
		do
		{
			if(ch[i] == '_')
				
			{
				System.out.println(i);
				sb.append(Character.toUpperCase(ch[i+1]));
				i++;
			}else {
				sb.append(ch[i]);
			}
			
			i++;
			
		}while(i<str.length());
		
		
		System.out.println(sb);
	}



}
