package codechallenge;

public class sample {

	public static void main(String[] args) {
		
//		Integer x =new Integer(0);
//		Integer y =new Integer(0);
//		if(x==0) System.out.println("=====");
//		if(0==y) System.out.println("=");
//		if(x!=0) System.out.println("!");
//		if(x>0) System.out.println(">");
//		if(x<0) System.out.println("<");
		
		
		
		int i=0;
		while (i<5) {
			if (i==0) System.out.println(0);
			System.out.println(i+"before");
			i++;
			System.out.println(i+"after");
			System.out.println(i>2?1:2);
		}
	}

}
