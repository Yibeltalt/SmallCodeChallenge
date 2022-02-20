package codechallenge;

import java.util.Scanner;

public class rgbtoHexadecimal {

	public static void main(String[] args) {
		StringBuilder str = new  StringBuilder();      
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int g = in.nextInt();
        int b = in.nextInt();
        str.append("#FF0");
        str.append(String.format("%2s", Integer.toHexString(r)).toUpperCase().replace(' ', '0'));
        str.append(String.format("%2s", Integer.toHexString(g)).toUpperCase().replace(' ', '0'));
        str.append(String.format("%2s", Integer.toHexString(b)).toUpperCase().replace(' ', '0'));
        System.out.println(str);
        
	}

}
