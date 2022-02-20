package codechallenge;

public class NumberReduced9 {

	public static void main(String[] args) {
		String str ="859647";
		char [] ch = str.toCharArray();
		StringBuilder sb=new StringBuilder();
		int temp=0,newtemp=0;
		for (int i=0;i<ch.length;i++) {
			newtemp=0;
			temp= Integer.parseInt(Character.toString(ch[i]));
			newtemp=9-temp;
			if(newtemp>temp) {
				sb.append(temp);
			}else
				sb.append(newtemp);
		}

		
		System.out.println(sb);
		
	}



}
