package hit.day17;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class HomeWorkOnReflection {
	public static void main(String[] args)throws Exception {
		Employeee emp=new Employeee();
		
		Class c=emp.getClass();
		Method mm[]=c.getDeclaredMethods();
		for(Method method:mm) {
			method.setAccessible(true);
			System.out.println("Method: "+method.getName());	
		}
		
		System.out.println("");
		
		Field ff[]=c.getDeclaredFields();
		for(Field filed:ff) {
			filed.setAccessible(true);
			System.out.println("Filed: "+filed.getName());
		}
	}

}
class Employeee{
	//fields
	public int i;
	protected String s;
	float f;
	private double d;
	
	//methods
	public void empId() {
		
	}
	protected void empName() {
		
	}
	void empSalary() {
		
	}
	private void empDetails() {
		
	}
}