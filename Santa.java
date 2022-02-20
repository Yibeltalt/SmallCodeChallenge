package codechallenge;

import java.util.Scanner;

public class Santa {

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("enter the hight");
	        int h = in.nextInt();
	        int total=0;
	        for (int i = 0; i < h; i++) {
	            int w = in.nextInt();
	            int t = in.nextInt();
	            String f = in.next();
	            String d = in.next();
	            //f="chocolate_chip_cookies";
	           // d="hot_milk";

	        if(w>80){
	            total=total+1+t+1;

	        }else if(w<80){
	            total=total+1+t;
	        }
	        
	        if(f.equals("chocolate_chip_cookies")&&d.equals("hot_milk")){
	            total++;}
	       

	        System.out.println(total);
	    }

	}

}
