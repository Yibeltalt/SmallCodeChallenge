package codechallenge;

public class Zigzag {

	public static void main(String[] args) {
		
		//int [] x = {1,2,9,4,5};
		int [] x ={4,3,7,8,6,1};
		int [] res = new int[x.length-2];
		int j=0;
		for (int i=0;i<x.length-2;i++) {
			
			if (((x[i]>x[i+1])&&(x[i+1]>x[i+2]))||((x[i]<x[i+1])&&(x[i+1]<x[i+2])))
			//if ((x[i]<x[i+1])&&(x[i+1]<x[i+2]))
			{
				System.out.println(x[i]+"|"+x[i+1]+"|"+x[i+2]);
				res[j]=1;
				j=j+1;
			}else {
				System.out.println(x[i]+"|"+x[i+1]+"|"+x[i+2]);
				res[j]=0;
				j=j+1;
			}
		}
		for (int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
	}

}
