package hit.day6;

import hit.day7.AccessDemo;

public class AccessDemoDiffPackSubClass extends AccessDemo{
	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pri);
	}
}
class AccessDemoDiffPackNonSubClass{
	void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.nomod); 
		System.out.println(obj.pri);
}
}
 