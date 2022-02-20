package codechallenge;

public class MiddelCharStr {

	public static void main(String[] args) {
		String str ="abebe yys dedb red erioadn";//eyeeo
		String [] word=str.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for (int i=0;i<word.length;i++)
		{
			if(word[i].length()%2==0)
			{
				sb.append(word[i].charAt(word[i].length()/2-1));
			}else 
				sb.append(word[i].charAt(word[i].length()/2));
		}
		
		
		System.out.println(sb);
		
	}

}
