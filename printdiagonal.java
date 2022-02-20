package codechallenge;

public class printdiagonal {

	public static void main(String[] args) {
		int n=8999;
		int x=(2*n)-1;
	    
	    System.out.println(x);
	    int rest = 0;
	    for (int i=x-2;i>=1;i=i-2)
	        {
	            rest =rest+(2*i);
	            System.out.println(rest+"|"+i+"Loop");
	        }
	    
	    System.out.println(x+rest);

	}

}
