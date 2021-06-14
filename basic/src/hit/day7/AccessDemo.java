package hit.day7;

public class AccessDemo {
	public int pub;
	protected int pro;
	private int pri;
	int nomod;
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(pri);
		System.out.println(nomod);
	}
}
class AccessDemoSubClass extends AccessDemo{
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(pri);
		System.out.println(nomod);
	}
}
class AccessDemoNonSubClass{
	void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.pri);
		System.out.println(obj.nomod);
}
}