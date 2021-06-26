package hit.day18;
/*Normally in interface,we need to provide implementation always(eg. class AlopathyMedicalCollege implements Doctor)
 * but for functional interface we can avoid implementation using Method Expression & Lambda
 * Method Expression & Lambda-are used to achieve better encapsulation
 */
public class InterfaceDemo2 {
	public static void mySomeMethod() {
		System.out.println("my some method is called...");
	}
	
	public void myAnotherMethod() {
		System.out.println("my another logic is called...");
	}
	public static void main(String[] args) {
		Teacher teacher=InterfaceDemo2::mySomeMethod;//this technique is called Method Expression
		//Method expressions work only on functional interfaces
		teacher.doTeach();
		
		//to associate(::) static method we don't need "new" keyword,we can directly associate
		//to associate(::) normal method we need "new" keyword,we need to create object
		
		teacher=new InterfaceDemo2()::myAnotherMethod;
		teacher.doTeach();
	}
}
//any interface with one method is called functional interface..
//advantage - u can use method expressions and lambda techniques
interface Teacher{
	public void doTeach();
	//public void doTalk();
}