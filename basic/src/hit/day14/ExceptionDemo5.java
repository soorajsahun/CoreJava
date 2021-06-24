//"OutOfMemoryError"= is a runtime error in Java which occurs when the Java Virtual Machine (JVM) is unable to allocate an object due to insufficient space in the Java heap.
//"StackOverflow error"When a program attempts to use more space than is available on the call stack (that is, when it attempts to access memory beyond the call stack's bounds, which is essentially a buffer overflow), the stack is said to overflow, typically resulting in a program crash
package hit.day14;
import java.util.Scanner;
public class ExceptionDemo5 {
	public static void main(String[] args) {
		Dog tiger=new Dog();
		Child baby=new Child();
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a item..Stick/Biscuit");
		String item=scan.next();		
		baby.playWithDog(tiger, item);
	}
}
class DogExceptions extends Exception{
	
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}
class DogHappyException extends DogExceptions{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is...:"+msg;
	}
}
//checked exception=when you have throw and throws in program then you have to compulsorily handle that exception otherwise it won't compile
class Dog{
	public void play(String item)throws DogBiteException,DogHappyException {
		if(item.equals("stick")) {
			throw new DogBiteException("You beat I bite.....");
		}
		else if(item.equals("biscuit")) {
			throw new DogHappyException("I love biscuits....");
		}
	}
}
class Child{
	public void playWithDog(Dog tiger,String item) {
		try{
			tiger.play(item);
		}catch(DogBiteException dbe) {
			System.out.println(dbe);
		}catch(DogHappyException dhe) {
			System.out.println(dhe);
		}
	}
}