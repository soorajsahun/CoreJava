package rough;

public class MethodExp {
	public static void mySomeMethod() {
		System.out.println("my some method is called...");
	}
	public void myAnotherMethod() {
		System.out.println("my another logic is called...");
	}
	public static void main(String[] args) {
		Teacher teacher=MethodExp::mySomeMethod;
		teacher.doTeach();
		
		teacher=new MethodExp()::myAnotherMethod;
		teacher.doTeach();
	}
}
interface Teacher{
	public void doTeach();
}