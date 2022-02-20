package codechallenge;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FilterArraypositivenum {

	public static void main(String[] args) {
		
//		filterArray([1, 2, "a", "b"]) ➞ [1, 2]
//		filterArray([1, "a", "b", 0, 15]) ➞ [1, 0, 15]
//		filterArray([1, 2, "aasf", "1", "123", 123]) ➞ [1, 2, 123]

		System.out.println("----------------Input------------------");
		List<Object> filterArray=new ArrayList<Object>();	
		filterArray.add(10);
		filterArray.add(2);
		filterArray.add(0);
		filterArray.add("a");
		filterArray.add("bt");
		filterArray.add(2);	
		filterArray.forEach(i->System.out.println(i));
		System.out.println("----------------outout------------------");
		
		Set<Integer> se=new LinkedHashSet<>();
		Integer x;
		for (Object o : filterArray) {
		    if (o instanceof Integer) {
		    	x=((Integer) o).intValue();
		    	se.add(x);}
		}	
		se.forEach(System.out::println);
		

	}

	

}
