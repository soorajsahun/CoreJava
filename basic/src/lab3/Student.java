package lab3;

public class Student {
	int age;
	String name,city;
	public void printData(){
		int o;
		System.out.print("Name:"+name+",City:"+city+",Age:"+age);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="Ram";
		s1.age=20;
		s1.city="Mumbai";
		s2.name="Shyam";
		s2.age=22;
		s2.city="Pune";
		s1.printData();
		System.out.println("");
		s2.printData();
	}
}