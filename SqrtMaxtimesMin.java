package codechallenge;

import java.util.Scanner;

public class SqrtMaxtimesMin {

	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int max=0,min=1001;
        for (int i = 0; i < N; i++) {
            int A = in.nextInt();

            if(max<A){
                max=A;
            }else if(min>A){
                min=A;
            }
        }
        System.out.println("------------------------");
        System.out.println(Math.sqrt(max));
        System.out.println(Math.sqrt(min));
        System.out.println("------------------------");
       int res=(int)(Math.sqrt(max)*Math.sqrt(min));
       
       
       
      System.out.println(res);
    }
}
