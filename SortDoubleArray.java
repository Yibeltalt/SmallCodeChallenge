package codechallenge;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortDoubleArray {

	public static void main(String[] args) {
		
		int [][] rows = new int [3][3];
		int res=0;
		TreeMap <Integer,String> arr =new TreeMap<Integer,String>();
		TreeSet<Integer> see=new TreeSet<>();
		StringBuilder str =new StringBuilder();
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				Random randNum = new Random();
				rows[i][j]=randNum.nextInt(1000);
			}
		}
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(rows[i][j]+" ");
				
				res=res+rows[i][j];
				str.append(rows[i][j]+" ");
			}
			arr.put(res, String.valueOf(str));
			see.add(res);
			System.out.println("res" + res);
			res=0;
			str.delete(0,20);
			System.out.println(" ");
			
			}
		System.out.println("---------------------------------");
		
		for (String a : arr.values()) 
			System.out.println(a); 
		
		for (Integer a : arr.keySet()) 
			System.out.println(a); 
		
		System.out.println("---------------------------------");
		see.stream().forEach(i->System.out.println(i));
		

	}

	
}
