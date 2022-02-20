package codechallenge;

import java.util.Scanner;

public class AsciiAveragefind {

	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        System.out.println("Enter tha Size");
		        int lenS = in.nextInt();
		        System.out.println("Enter tha String");
		        if (in.hasNextLine()) {
		            in.nextLine();
		        }
		        String s = in.nextLine();
		        char [] ch=s.toCharArray();
		        int sum=0,res;
		        for(int i=0;i<ch.length;i++){
		            sum=sum+ch[i];
		        }
		        res=sum/lenS;

		        System.out.println((char)res);


		    }
	}


