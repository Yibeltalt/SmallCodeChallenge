package codechallenge;

import java.util.Scanner;
/* Input
 * (2,2)
 * (-1,1)
 * (-3,-3)
 * Output
 * Shortest distance is 2.0
 * The positions is :(-1,-1)
 * Formula The distance to use between two points is the Euclidean distance.
		For two points A and B, the distance is
		sqrt((A.x - B.x)^2 + (A.y - B.y)^2)
*/

public class PointClosest {

	public static void main(String[] args) {
		int x ;
		int y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many point Position");
		int n = sc.nextInt();
		int [][] pos = new int [n][2];
		
		
		for (int i=0;i<n;i++)
			{
			System.out.println("Enter the x Position");
			pos[i][0]= sc.nextInt();
			System.out.println("Enter the y Position");
			pos[i][1] = sc.nextInt();
			System.out.println("("+pos[i][0]+","+pos[i][1]+")");
			}
		double dis = Math.sqrt(Math.pow(pos[0][0], 2))+(Math.pow(pos[0][1], 2));
		int check = 0;
		for (int i=1;i<n;i++)
			{
			if (dis>Math.sqrt(Math.pow(pos[i][0], 2))+(Math.pow(pos[i][1], 2))) 
				{
				dis =Math.sqrt(Math.pow(pos[i][0], 2))+(Math.pow(pos[i][1], 2));
				check = i;
				}
			}
		System.out.println("shortest distance is "+dis);
		System.out.println("The positions is :"+"("+pos[check][0]+","+pos[check][0]+")");
		
		
		

	}

}
