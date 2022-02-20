package codechallenge;

public class Square {

	public static void main(String[] args) {
		int n = 4;
		int c = 4;
		char [][] ch = new char [n][c];
		System.out.println("--------Square----------");
		for (int i=0;i<n;i++) {
			for (int j=0;j<c;j++) 
			{
				ch[i][j]='*';
				System.out.print(ch[i][j]);
			}
			System.out.println("");
			
		}
		
		System.out.println("------------------------");
		
		for (int i=0;i<n;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		
		
		System.out.println("------------------------");
		for (int i=0;i<n;i++) {
			for(int x=0;x<n-i;x++)
			{
				System.out.print(' ');
			}
			for(int j=n;j>=n-i;j--) {
				System.out.print('*');
			}
			System.out.println("");
		}
		
		
 }

}