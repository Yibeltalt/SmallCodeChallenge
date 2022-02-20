package codechallenge;

public class Sentenceprint {

	public static void main(String[] args) {
		
		String str ="Ethiopia is found in east africa";
		int n = 5;
		
		String str1=str.replace(" ", "");
		System.out.print(str1);
		System.out.println(" ");
		for(int i=0;i<str1.length();i+=n) {
			
			System.out.println(" ");
			if (n+i<str1.length())
				System.out.print(str1.substring(i,n+i));
			else {
				int div=str1.length()/n;
				System.out.print(str1.substring(div*n));
			}
				

		}
		
				
	}

}
