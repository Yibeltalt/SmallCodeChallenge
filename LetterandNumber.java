package codechallenge;

public class LetterandNumber {

	public static void main(String[] args) {
		
		String st ="sfh78955sjdkBj3h";
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		char c;
		for(int i=0;i<st.length();i++)
		{
			c =st.charAt(i);
			if(c>='0'&&c<'9')
			{
				sb.append(c);
			}else if ((c >='a'&& c<='z') || (c >='A'&& c<='Z')){
				sb1.append(c);
			}
		}
		
		System.out.println("Number :"+sb);
		System.out.println("Letter :"+sb1);

	}

}
