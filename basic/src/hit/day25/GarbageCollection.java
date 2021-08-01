package hit.day25;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
public class GarbageCollection {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Before Tatha was born..:"+r.freeMemory());
		GrandFather1 tatha=new GrandFather1();
		System.out.println("After Tatha is born...:"+r.freeMemory());
		
		System.out.println(tatha);
		System.out.println(tatha.getGold());
		
		//WeakReference<GrandFather> weak=new WeakReference<GrandFather>(tatha);
		SoftReference<GrandFather1> soft=new SoftReference<GrandFather1>(tatha);
		tatha=null;
		
		//System.out.println(tatha.getGold());
		System.out.println("After tathas death...:"+r.freeMemory());
		
		System.gc();
		
		System.out.println("After burrying/kriyakaram the body...:"+r.freeMemory());
		
		tatha=soft.get();
		System.out.println(tatha.getGold());
	}
}
class GrandFather1{
	String age;
	private String gold;
	protected String getGold() {
		return "the gold is under the tree....";
	}
	public GrandFather1() {
		for(int i=0;i<5000;i++) {
			age=new String("life...:"+i);
		}
	}
	@Override
	public String toString() {
		return "Hai son how are you...";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called...");
		System.out.println("Gold....:"+getGold());
	}
}