package codechallenge;

public class Numberreverser {

	public static void main(String[] args) {
	          int count=0,rev=0,rem=0,result,diff,x;
	          
	          int i=49860,j=205494,k=155635764;
	            StringBuilder sb=new StringBuilder();
	            for (int y=i;y<=j;y++)
	            {
	                x=y;
	                while(x>=9){
	                    rem=x%10;
	                    rev=(rev*10)+(rem*10);
	                    x=x/10;
	                }
	                rev=rev+x;
	               // System.out.println(rev);
	                
	                diff=y-rev;
	                diff=(diff>0)?diff:-1*diff;
	                if(diff%k==0)
	                    count++;
	                rev=0;
	                
	           }
	        
	        System.out.println(count);
	    }
	      

}