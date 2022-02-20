package codechallenge;

public class Revtwostr {

	public static void main(String[] args) {
		//input : yibeltal
		//output :iyebtlla
		
		
	// using character to do it	
	//	=============================
//		String st = "yibeltal";
//		char [] ch = st.toCharArray();
//		char sw;
//		StringBuilder sb = new StringBuilder();
//		for (int i=0;i<ch.length;i+=2) {			
//			sb.append(ch[i+1]);
//			sb.append(ch[i]);
//		}
//		
//		
//		System.out.println("Two character rreverse :"+sb);
		
		// using string to do it	
		//	=============================
		
		String st = "yibeltal";
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		//string to StringBuffer
//		sb.append(st);
//		
//		System.out.println(sb.reverse());
//		
//		//StringBuffer to string
//		
//		String str = sb.toString();
//		
//		System.out.println(str);
		
		//--------------------------------------------------------
		
		for (int i=0;i<st.length();i+=2) {	
			sb.delete(0, 20);
			sb.append(st.substring(i, i+2));
			sb1.append(sb.reverse());
			//System.out.println(sb1);
		}
		
		System.out.println(sb1);
		
		
		
		
		
		

	}

}
