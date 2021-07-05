package hit.day25;

import java.util.StringJoiner;

public class GarbageDemo {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Free memory "+r.freeMemory());//->r.totalMemory()
		GrandFather daddu=new GrandFather();
		System.out.println("Free memory after daadu born "+r.freeMemory());
		
		String s="hello";
		String temp=s;
		String s2=s+"world";
		System.out.println(temp);
		
		StringBuffer sb=new StringBuffer("hello");
		StringBuffer sbtemp=sb;
		sb.append("world");
		System.out.println(sbtemp);
	}
}
class GrandFather{
//	1)String
//	String str;
//	public GrandFather() {
//		for(int i=0;i<10000;i++) {
//			str=new String("100"+i);
//		}
//	}
	
//	2)StringBuffer
//	StringBuffer str=new StringBuffer();
//	public GrandFather() {
//		for(int i=0;i<10000;i++) {
//			str.append("100"+i);
//		}
//	}
	
//	3)StringBuilder
//	StringBuilder str=new StringBuilder();
//	public GrandFather() {
//		for(int i=0;i<100000;i++) {
//			str.append("100"+i);
//		}
//	}
	
//	4)StringJoiner
	StringJoiner str=new StringJoiner(",");
	public GrandFather() {
		for(int i=0;i<100000;i++) {
			str.add("100"+i);
		}
	}

}
