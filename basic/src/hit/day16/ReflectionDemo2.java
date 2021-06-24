package hit.day16;
//Crating object with passing something(Arguments) and invoking parametrized constructor
import java.util.Scanner;

public class ReflectionDemo2 {
	public static void main(String[] args)throws Exception {
		//static way.....
	Politician p=new AbcPolitician("Ramu","Shamu");
	System.out.println("Static ramu"+p);
	
	//dynamic way....old one
	//here in getConstructor,you are passing it as a Class array
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the qualified class name...:");
	String pPolitician=scan.next();
	p=(Politician)Class.forName(pPolitician).getConstructor(new Class[] {String.class,String.class}).newInstance("DynamicRamu","Shamu");
	System.out.println("dynamic ramu...:"+p);
	
	/*
	 * dynamic way....new one(they have achieved this through VARARGS)
	 * In VARARGS,it is possible to you to pass multiple parameters
	 * here in getConstructor,you are passing it as a multiple parameter
	 */
	p=(Politician)Class.forName(pPolitician).getConstructor(String.class,String.class).newInstance("new DynamicRamu","Shamu");
	System.out.println("new dynamic ramu...:"+p);
	}
	
}
abstract class Politician{
	
}
class AbcPolitician extends Politician{
	String msg;
	String msg1;
	public AbcPolitician(String msg,String msg1) {
		this.msg=msg;
		this.msg1=msg1;
	}
	@Override
	public String toString() {
		return this.msg+" "+this.msg1;
	}
}
class XyzPolitician extends Politician{
	String msg,msg1;
	public XyzPolitician(String msg,String msg1) {
		this.msg=msg;this.msg1=msg1;
		
	}
	@Override
	public String toString() {
		return this.msg+" "+this.msg1;
	}
}
