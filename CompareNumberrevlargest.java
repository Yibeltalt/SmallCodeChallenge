package codechallenge;

public class CompareNumberrevlargest {

	public static void main(String[] args) {
		
		// a = the array
		//out put the absolute value of maximum number in reverse 
		
		

		String a = "18 -52 985";
		
		String [] arr = a.split(" ");
		int max = Math.abs(Integer.parseInt(arr[0]));
		for (int i=0;i<arr.length;i++) {
			
			if(max<Math.abs(Integer.parseInt(arr[i]))) {
				max = Math.abs(Integer.parseInt(arr[i]));
			}
			
		}
		//String Reverse
		StringBuffer sb = new StringBuffer();
		sb.append(max);
		sb.reverse();
		
		System.out.println(sb);
		
		//number Reverse
		
		int rem=0;int res=0;
		while(max>0) {
			rem=max%10;
			max=max/10;
			res=res*10+rem;
		}
	
		System.out.println(res);
		
		

	}

}
