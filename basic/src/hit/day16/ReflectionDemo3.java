package hit.day16;
//creating object and invoking constructors  when access modifier of constructor changes
public class ReflectionDemo3 {
	public static void main(String[] args) throws Exception{
		
		//Students s=(Students)Class.forName("hit.day16.JavaStudents").getConstructor().newInstance();
		
		Students s=(Students)Class.forName("hit.day16.JavaStudents")
				.getDeclaredConstructor().newInstance();
		System.out.println(s);
		
		//here,getConstructor can invoke public,protected and nomodifier except private(private can not be accessed)
		s=(Students)Class.forName("hit.day16.JavaStudents")
				.getDeclaredConstructor(String.class).newInstance("ramu");
		System.out.println(s);
	}
}
abstract class Students{
	
}
class JavaStudents extends Students{
	protected JavaStudents() {
		System.out.println("Default cont called....");
	}
	
JavaStudents(String s) {//nomodifier
		System.out.println("Parametrized const called......."+s);
	}
}