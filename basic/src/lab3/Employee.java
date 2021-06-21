package lab3;

public class Employee{
	
	public Employee(int id,String name) {
		
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Employee obj1=new Employee(101,"Suraj");
		Employee obj2=new Employee(102,"Rahul");
	}
}