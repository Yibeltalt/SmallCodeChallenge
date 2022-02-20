package codechallenge;

import java.util.Scanner;

public class asciisum {
	
	public static void main (String [] arg) {
	
		        Scanner in = new Scanner(System.in);
		        System.out.println("Enter a sentence");
		        String sentence = in.nextLine();
		        String[] words = sentence.split(" ");
		        int count = 0;
		        for (String word: words){
		            int sum = 0;
		            for (char c : word.toCharArray()){
		                if(Character.isLetter(c)){
		                    sum += c;
		                }
		               // System.out.print(c);
		            }
		            if (sum % 2 == 0){
		                continue;
		            }else { count ++;}
		        }

		        

		       
		        
		        
		        
//		       int sum=0; 
//		       for(int i=0;i<words.length;i++) {
//		    	   sum=0;
//		    	   for (int j=0;j<words[i].length();j++)
//		    	   {
//		    		   if(Character.isLetter(words[i].charAt(j))) {
//		    			   sum += words[i].charAt(j);
//		    		   }
//		    	   }
//		    	   if (sum % 2 != 0){
//		                count++;
//		       }
//		        
//		        
//		    	   System.out.println(count);
//		        
//		        
		        
		        
		        
		    }
		
	}

