package codechallenge;

public class palendrom {

	public static void main(String[] args) {
		
		
//		int a = 4;
//		System.out.println(++a);
//		
		int y = 124421;
		
		String str = Integer.toString(y);	
		
		char [] ch = str.toCharArray();
		boolean check = true;
		int n=str.length()-1;
		for (int i=0;i<n/2+1;i++)
		{
			if(ch[i]!=ch[n-i])
			{
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("It is palendrom");	
		}
		else {
			System.out.println("It is not palendrom");
		}

	}

}
