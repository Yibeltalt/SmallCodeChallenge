package codechallenge;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateStringcounter {

	public static void main(String[] args) {
		String Sentence ="inc dec dec double double double double double double double inc inc inc inc dec inc half print exit";
		
		String[] words = Sentence.split(" ");
		//Set<String> se =new HashSet<String>();//Not orderd 
		//Set<String> se =new LinkedHashSet<String>();//orderd by insertion
		Set<String> se =new TreeSet<String>();//sorted
		int count=0;
		for (int i=0;i<words.length;i++)
		{
			count=0;
			for (int j=0;j<words.length;j++)
			{
				if (words[i].equals(words[j])) {
					count+=1;
				}
			}
			se.add(words[i]+"->"+count);
		}
		
		se.forEach(System.out::println);
		

	}

}
