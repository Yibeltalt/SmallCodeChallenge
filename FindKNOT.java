package codechallenge;


public class FindKNOT {

	public static void main(String[] args) {

				
//		        Scanner in = new Scanner(System.in);
//		        String KNOTS = in.next();
				String KNOTS ="YIBKNOTDETONKEKNOT";
		        StringBuilder sb=new StringBuilder();
		        char [] ch=KNOTS.toCharArray();

		        int count=0;
		        int c=0;
		        for(int i=0;i<ch.length;i++)
		        {
		            if (KNOTS.charAt(i)=='K')
		            {
		              // System.out.println("Number of K found :"+(++c));
		               if(i+2<ch.length-1&&KNOTS.substring(i,i+4).equals("KNOT")) {
		                    count++;
		                   // System.out.println("Front in the postion :"+i);
		               } 
		               if(i-3>=0){
		                    for (int j=i;j>i-4;j--)
		                            sb.append(ch[j]);
		                   // System.out.println(sb);
		                    if((String.valueOf(sb)).equals("KNOT"))
		                    {
		                        count++;
		                    	//System.out.println("Back in postion :"+i);
		                	}
		                    sb.delete(0,4);
		               }
		            }
		        }
		       System.out.println("The word 'KNOT' found "+count+" times.");
		    }
		}
			


