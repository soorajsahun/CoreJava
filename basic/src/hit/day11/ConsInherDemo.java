package hit.day11;
public class ConsInherDemo {
	public static void main(String[] args) {
		Shoe shoe=new LeatherShoe(100);
		//there is no concept of over riding in constructor even if we pass value like 100  tabhi bhi default cons call hoga
		//always the parent and child class both default constructors are called...
	}
}
class Shoe{
	int i;
	public Shoe() {
		System.out.println("cons of shoe called....");
	}
	public Shoe(int i) {
		System.out.println("parametric constructor of shoe called....");
	}
	public void met() {
		System.out.println("parent shoe class method called...");
	}
}
class LeatherShoe extends Shoe{
	//there is no concept of over riding in constructor
	//always the parent  and child class default constructor is called...
	public LeatherShoe(int i) {
//		To call parametric constructor ,we use "super" keyword.
//		"super"=as we can't create parent class object ,so to call parent class cons,method,variable we use super keyword
		super(343);//super class constructor - should be the first line in the constructor
		super.i=100;//super can refer to super class variable
		super.met();//super can refer to super class method
		System.out.println("cons of leather shoe called....");
	}
}