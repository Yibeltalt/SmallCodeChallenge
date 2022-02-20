package codechallenge;

import java.util.ArrayList;
import java.util.List;

public class Streamsample {

	public static void main(String[] args) {
		
		
		
		List <Integer> yy= new ArrayList<>();
		for (int i=0;i<10;i++)
		{
			yy.add(i,100+i);
		}
		yy.forEach(i->System.out.println(i));
		yy.stream().forEach(System.out::println);
		yy.stream().filter(i->{System.out.println(i);return true;}).findFirst();
		
		
	}

}
