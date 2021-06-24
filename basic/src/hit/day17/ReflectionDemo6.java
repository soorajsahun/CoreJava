package hit.day17;
//to intraspect the methods and fields(//when you want to know the method's and field's parameters,types etc;)
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo6 {
	public static void main(String[] args){
		BadPoltician bp=new BadPoltician();
		PoliceStation p1=new PoliceStation();
		p1.interrogate(bp);
	}
}
class PoliceStation{
	public void interrogate(BadPoltician bp){
		System.out.println(bp.name);
		bp.doService();
		trotureRoom(bp);//tortureRoom created for "IntraSpection"
	}
	public void trotureRoom(BadPoltician bp){
		try {
			//when u already know the method's and field's parameters,types etc;
		Class c=bp.getClass();
		Field f=c.getDeclaredField("secretName");
		f.setAccessible(true);//when u accessing private fields and private methods,you have to write [setAccessible(true)]
		System.out.println(f.get(bp));
		
		Method m=c.getDeclaredMethod("secretService");
		m.setAccessible(true);
		m.invoke(bp);
		
		//when you want to know the method's and field's parameters,types etc;
		Method mm[]=c.getDeclaredMethods();//to listout the methods we used array->mm[]
		for(Method method:mm) {
			method.setAccessible(true);
			System.out.println(method.getName());
		}
		
		Field ff[]=c.getDeclaredFields();//to listout the fields we used array->ff[]
		for(Field field:ff) {
			field.setAccessible(true);
			System.out.println(field.getName());
		}
		}catch(Exception e) { 
		System.out.println(e);
		}
	}
}
class BadPoltician{
	public String name="I am a good man";
	private String secretName="I am bla bla bla....";
	
	public void doService() {
		System.out.println("I do social service.....");
	}
	private void secretService() {
		System.out.println("I do bla bla bla......");
	}
	
}
