package hit.day26;
//StringTokenizer
import java.util.StringTokenizer;


public class linearDataStructureOne2Many {
//	public static void main(String[] args) {
//		String str="Suraj,Rahul,Manoj";
//		
//		StringTokenizer st=new StringTokenizer(str,",");
//		while(st.hasMoreTokens()){
//			
//			System.out.println(st.nextToken());
//		}
//	}
	public static void main(String[] args) {
		String st="Suraj-Rahul-Manoj";
		
		StringTokenizer str=new StringTokenizer(st,"-");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}

}
