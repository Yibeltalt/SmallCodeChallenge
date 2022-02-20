package codechallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindmissingNumber {

	public static void main(String[] args) {
		//List<Integer> z = new ArrayList();
		int [] y = { 4,2,1};
		
		int count=0;
		//Arrays.sort(y);//array sort method
		Arraysort(y);// new created sort method
		for (int i=0;i<y.length;i++)	
		System.out.println(y[i]);
		System.out.println("---Array----");
		for (int j=1;j<y.length+1;j++) {
			
			if(y[j-1]!=j) {
				System.out.println(j);
				break;
			}
			else if (j==y.length)
				System.out.println(j+1);
		}
		
		System.out.println("---------");
		
		List<Integer> k = new ArrayList<Integer>();
		
		for (int i=0;i<y.length;i++)
			k.add(i,y[i]);	
		
		Collections.sort(k);
		
		k.stream().forEach(i->System.out.println(i));
		//k.stream().forEach(System.out::print);
		//k.forEach(System.out::print);
		
		System.out.println("---List----");
		
		for(int i=0;i<k.size();i++) {
			//System.out.println(k.get(i)+"|"+(i+1));
			if(k.get(i)!=(i+1)) {
				System.out.println(i+1);
				break;
			}else if(i==k.size()-1)
				System.out.println(k.get(i)+1);
			
			
		}
	}

	public static  int[] Arraysort(int [] y)
	{
		int a;
		for (int i=0;i<y.length;i++) {
			for (int j=i+1;j<y.length;j++) {
			    if(y[i]>y[j]) {
				
			    	a=y[i];
			    	y[i]=y[j];
			    	y[j]=a;	
				}
			}
		}
//		for (int i=0;i<y.length;i++) {
//			System.out.println(y[i]+"inside");
//		}
//		
		return y;
		
	}
	
	
}
;