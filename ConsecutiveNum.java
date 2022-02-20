package codechallenge;
public class ConsecutiveNum {

	public static void main(String[] args) {

	//	String str="232425";
	//	String str="123456";
		String str="2324256";
	//	String str="444445";
	//	String str="2324256";

		boolean flag = false;
		for(int i=1;i<=str.length()/2;i++)
		 {
			if(str.length()%i==0) 
			{
				
					for (int j=0;j<str.length()-i;j+=i)
					{
	
						if(Integer.parseInt(str.substring(j,i+j))>Integer.parseInt(str.substring(j+i,i+i+j))) 
							break;
						else if (j+i>=str.length()-i)
								flag= true;		
					}
			}
			

		 }	
		
		System.out.print(str+" Is Consecutive Number :"+flag);
	}

}
