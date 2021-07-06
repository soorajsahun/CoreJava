package hit.day25;

import java.util.StringTokenizer;


public class StringTokenizer1 {
	public static void main(String[] args) {
		String str="Suraj,Rahul,Manoj";
		
		StringTokenizer st=new StringTokenizer(str,",");
		while(st.hasMoreTokens()){
			
			System.out.println(st.nextToken());
		}
	}

}

