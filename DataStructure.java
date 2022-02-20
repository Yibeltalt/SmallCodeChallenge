package codechallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class DataStructure {

	public static void main(String[] args) {
		
		System.out.println("---List---------Arraylist-------------");
		
		List<Integer> lis =new ArrayList();//insertion order
		
		lis.add(0,100);  
		lis.add(1,65);
		lis.add(2,958);
		lis.add(3,235);
		lis.add(4,214);
		lis.add(5,879);
		lis.add(6,25);
		lis.set(4,1000);
		lis.forEach(i->System.out.println(i));
		Collections.sort(lis);
		lis.forEach(System.out::println);
		
		//lis.stream().forEach(System.out::println);
		
		System.out.println("---List---------Vector-------------");
		List<Integer> vec =new Vector<Integer>();//insertion order
		
		vec.add(0,100);
		vec.add(1,65);
		vec.add(2,958);
		vec.add(3,235);
		vec.add(4,214);
		vec.add(5,879);
		vec.add(6,25);
		
		vec.forEach(System.out::println);
		
		
		System.out.println("---List---------Stack-------------");
		List<Integer> st =new Stack<Integer>();//insertion order
		
		st.add(0,100);
		st.add(1,65);
		st.add(2,958);
		st.add(3,235);
		st.add(4,214);
		st.add(5,879);
		st.add(6,25);
		
		vec.forEach(System.out::println);
		
		
		
		
		
		System.out.println("-----Set-----------HashSet---------");
		Set<Integer> se =new HashSet();//unorderd list & no duplicate	
		
		se.add(100);
		se.add(65);
		se.add(958);
		se.add(235);
		se.add(214);
		se.add(879);
		se.add(25);
		se.add(25);
		se.forEach(System.out::println);
		
		System.out.println("-----Queue-------------LinkedList-------");
		Queue<Integer> qe =new LinkedList();//First in First out
		
		qe.add(100);
		qe.add(65);
		qe.add(958);
		qe.add(235);
		qe.add(214);
		qe.add(879);
		qe.add(25);
		qe.add(25);
		
		qe.forEach(System.out::println);
	}

}
