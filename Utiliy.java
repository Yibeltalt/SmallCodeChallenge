package codechallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Utiliy {

	public static void main(String[] args) {
		
//		List<Integer> num=new ArrayList<>();
//		num.add(1);
//		num.add(3);
//		num.add(2);
//		//num.stream().forEach(x->System.out.println(x));
//		Collections.sort(num);
//		//num.stream().forEach(x->System.out.print(x));
//		
//		String str ="aj4dlj5alk";
//		StringBuilder sb=new StringBuilder();
//		sb.append(str);
//		System.out.print(sb.reverse());
//		
//		System.out.println("-------------------------");
//		char [] ch=str.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			if (Character.isDigit(ch[i]))
//				System.out.print(ch[i]);
//		}
//		System.out.println("-------------------------");
//		int [] x= {4,2,9,6,8,3,7,5,2,9};
//		int temp;
//		for (int i=0;i<x.length;i++) {
//			for (int j=0;j<x.length;j++){
//				if(x[i]>x[j]){
//						temp=x[i];
//						x[i]=x[j];
//						x[j]=temp;
//						}
//			}
//		}
//		
//		for (int z:x)
//		{
//			System.out.print(z);
//		}
		
	        Scanner in = new Scanner(System.in);
	        String S = in.nextLine();
	      
	        int count=0,i=S.length()-1;
	        char [] ch = S.toCharArray();
	        while(ch[i]!='/')
	            {
	            count++;
	            i--;
	            }
	        System.out.println(count);
	    }

	}


