package codechallenge;

public class Threedigitadd {

	public static void main(String[] args) {
		
		int x =1222111000;
		
		//result=000+111+222+1;
		
		int div;
		int rem;
		int res=0;
		while (x>999)
		{
			div = x/1000;
			rem = x%1000;
			x=div;
			res=res+rem;
			
		}
		res=res+x;
		System.out.println(res);	
		

	}

}
