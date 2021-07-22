package hit.day17;

public class WaysOfCallingMethod {
	public static void main(String[] args) {
//		1)
		WaysOfCallingMethod m=new WaysOfCallingMethod();
		m.met1();
		
//		2)
		Class c=new Class();
		c.met2();
	}
	public void met1() {
		System.out.println("met1 called");
	}
}
class Class{
	public void met2() {
//		3)
		met3();
		System.out.println("met2 called");
	}
	public void met3() {
		System.out.println("met3 called");
	}
}