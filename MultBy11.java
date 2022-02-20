package codechallenge;
import java.util.Scanner;

public class MultBy11 {

	public static void main(String[] args) {

		String x="11";
		//String x="111111111";
		//String x="1213200020";
		//String x="1217197941";
		//String x="9473745364784876253253263723";
		char[] ch=x.toCharArray();
		char[] res=new char[ch.length+1];
		StringBuilder sb=new StringBuilder();
		int z=0;
		int a,b,r,rem;
		for (int i=0;i<ch.length-1;i++) {
			a=Character.getNumericValue(ch[i]);
			b=Character.getNumericValue(ch[i+1]);
			r=a+b;
		    if (r>9) {
				res[i]=(char)(Character.getNumericValue(res[i])+49);		
			    rem=r%10;
		
			    	res[i+1]=(char)(rem+48);

		    }else if (r<=9) {
				res[i+1]=(char)(r+48);
			}
		}	
		if(Character.getNumericValue(ch[0])+Character.getNumericValue(ch[1])>9)
			sb.append(Character.getNumericValue(ch[0])+1);
		else
			sb.append(ch[0]);
		
		res[ch.length]=ch[ch.length-1];
		for (int i=1;i<res.length;i++) {
			sb.append(res[i]);
		}
		System.out.print(sb);
		}
		
	}


