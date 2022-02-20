package codechallenge;

public class Cupdrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int strew=1;
		char drink='c';
		
		if (strew==1)
		{
			System.out.println("----l----");
		}
		else if (strew==0)
		{
			System.out.println("---------");
		}
		
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++) {
				
				if (i==j&&i<3)
					System.out.print("\\");
				else if ((i==0 && j==8)||(i==1 && j==7)||(i==2 && j==6))
					System.out.print("/");
				else if ((i==3 && j==3)||(i==3 && j==4)||(i==3 && j==5))
					System.out.print("-");
				else if ((i==1 && j==4))
					System.out.print(drink);	
				else 
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
	}

}
