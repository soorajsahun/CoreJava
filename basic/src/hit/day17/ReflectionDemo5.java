package hit.day17;
//invoking fields and invoking fields when access modifier of fields change(same like objects==getDeclaredConstuctor)
import java.lang.reflect.Field;

public class ReflectionDemo5 {
	public static void main(String[] args) throws Exception{
		Employee emp=new Employee();
		Class c=emp.getClass();
		Field f=c.getField("name");//[c.getField()->this return object of type Field]
		f.set(emp, "Suraj");
		System.out.println("Name: "+f.get(emp));
		
		f=c.getField("age");
		f.set(emp, 30);
		System.out.println("Age: "+f.get(emp));
		
		f=c.getDeclaredField("name2");
		f.set(emp, "Rahul");
		System.out.println("Name: "+f.get(emp));
	}
}
class Employee{
	public String name;
	public int age;
	protected String name2;
	
}
