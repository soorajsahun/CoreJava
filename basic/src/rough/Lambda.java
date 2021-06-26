package rough;

public class Lambda {
	public static void main(String[] args) {
		Student student=()->{
			System.out.println("learning method logic...");
		};
		student.learn();
		
		Driver driver=(s)->{
			System.out.println("The driver logic iss....");
			System.out.println("The value supplied is...:"+s);
		};
		driver.drive("the light machine..");
		
		Pilot pilot=(name,s)->{
			System.out.println("The pilot name is...:"+name);
			System.out.println("The speed is...:"+s);
	};
	pilot.fly("Suraj", 1000);
}
}
interface Student{
	public void learn();
}
interface Driver{
	public void drive(String s);
}
interface Pilot{
	public void fly(String name,int speed);
}