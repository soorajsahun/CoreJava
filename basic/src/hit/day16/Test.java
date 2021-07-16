package hit.day16;

public class Test {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.met("Hi","By","Hello");
		obj.met(new String[] {"Hi","By","Hello"});
		
		obj.met2("Hi","By","Hello");
		obj.met2(new String[] {"Hi","By","Hello"});//only this type accepts new string array
	}
	void met(String...s) {//three dots is for to accept multiple strings
		//this method accepts varargs as well as new string array[]
	}
	void met2(String s[]) {//here,string array is used to accept multiple strings
		//this method accepts only new string array[]
	}
}
//public class Test {
//	public static void main(String[] args) {
//		Test obj=new Test();
//		new Test("Hi","By","Hello");
//		new Test(new int [] {1,2,3});
//	}
//	public Test(String...s) {//three dots is for to accept multiple strings
//		
//	}
//	public Test(int i[]) {
//		
//	}
//}

