package codechallenge;

import java.util.ArrayList;
import java.util.List;

public class Threadcheck {

	public static void main(String[] args) {
		
		List<Integer> x=new ArrayList<>();
		Thread t1= new mythread();
		Thread t2= new mythread();
		
		t1.start();
		t2.start();
	}

}
class mythread extends Thread{
	
	//int values = {1,2,3,4,5,6,7,8,9,10};
	int value;
	public void run() {
		//for (int i=0;i<values.length;i++) {
		for (int i=0;i<1000000;i++) {
			value=i*5;
			System.out.println(value);
		}
		try {
			mythread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
