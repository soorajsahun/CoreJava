package hit.day17;
//invoking default and parametrized objects 
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionDemo4 {
	public static void main(String[] args)throws Exception {
		HolyMan holy=new HolyMan();
		holy.doService();//static binding...
		
		//dynamic call of the method... 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter method name....");
		String methodName=scan.next();
		
		Class c=holy.getClass();
		Method m=c.getMethod(methodName);//[c.getMethod()->this return object of type Method]
		m.invoke(holy);
		
		m=c.getMethod("collectMoney",int.class);
		m.invoke(holy, 30);
		
		m=c.getMethod("register",String.class,int.class);
		m.invoke(holy, "Superman",30);
	}

}
class HolyMan{
	public void doService() {
		System.out.println("I do social service.....");
	}
	
	public void doPreach() {
		System.out.println("I preach personality development...");
	}
	public void collectMoney(int money) {
		System.out.println("Money collected....:"+money);
	}
	public void register(String s,int fees) {
		System.out.println("Registered as bakra...:"+s+"....fees...:"+fees);
	}
}