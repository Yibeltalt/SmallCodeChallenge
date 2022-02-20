package codechallenge;

public class OddEvensort {

	public static void main(String[] args) {
		int  [] x= {1,2,3,4,5,6,7,8,9,10};
		int temp=0;
		for (int i=0;i<x.length;i++)
		{
			if (x[i]%2==0)
			for(int j=i+1;j<x.length;j++)
			{
			if(x[j]%2!=0)
				{
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
				break;
				}
			}
		}	
		for (int i=0;i<x.length;i++)
			System.out.print(x[i]+ " ");
	}

}
