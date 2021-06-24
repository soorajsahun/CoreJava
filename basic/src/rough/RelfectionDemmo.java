package rough;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RelfectionDemmo {
	public static void main(String[] args) {
		BadPolitician bp=new BadPolitician();
		PolicMan p1=new PolicMan();
		p1.interrogate(bp);
	}

}
class PolicMan{
	public void interrogate(BadPolitician bp) {
		System.out.println(bp.name);
		bp.doService();
		tortureRoom(bp);
	}
	public void tortureRoom(BadPolitician bp) {
		try {
		Class c=bp.getClass();
		Method m=c.getDeclaredMethod("secretService");
		m.setAccessible(true);
		m.invoke(bp);
		
		Field f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(bp));
		
		Method mm[]=c.getDeclaredMethods();
		for(Method method:mm) {
			method.setAccessible(true);
			System.out.println(method.getName());
			
		Field ff[]=c.getDeclaredFields();
		for(Field field:ff) {
			field.setAccessible(true);
			System.out.println(field.getName());
		}
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class BadPolitician{
	public String name="I am a good man";
	private String secretName="I am bla bla......";
	
	public void doService() {
		System.out.println("I do social service");
	}
	private void secretService() {
		System.out.println("I do bla bla....");
	}
}