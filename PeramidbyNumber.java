package codechallenge;

public class PeramidbyNumber {

	public static void main(String[] args) {
		int n=20;
		
		
		for(int i=n;i>0;i--) {
			for (int j=0;j<i;j++) {
				System.out.print(n);
			}
			System.out.println("");
		}
		for(int i=0;i<n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print(n);
			}
			System.out.println("");
		}

	}

}
