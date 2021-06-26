package hit.day18;
public class InterfaceDemo {
public static void main(String[] args) {
//	if we create object of AlopathyMedicalCollege by taking reference of Doctor interface then we can only access doCure method
//	and can't access duNursing method
//	Doctor doctor=new AlopathyMedicalCollege();
	
//	solution of above problem
//	1)method
	AlopathyMedicalCollege stanley=new AlopathyMedicalCollege();
	Doctor doctor=(Doctor)stanley;//By casting you get user level rights and previlages
	doctor.doCure();
	Nurse nurse=(Nurse)stanley;
	nurse.doNursing();
	
//	2)method
	AlopathyMedicalCollege stanley1=new AlopathyMedicalCollege();
	stanley1.doCure();
	stanley1.doNursing();
	
	HomeoPathyMedicalCollege homeoDoctor=new HomeoPathyMedicalCollege();
	Doctor doctor2=(Doctor)homeoDoctor;
	doctor2.doCure();
	Nurse nurse2=(Nurse)homeoDoctor;//I will get a exception at this line bcoz HomeoPathyMedicalCollege does not implement Nurse interface
	nurse2.doNursing();
	
//	we can access fields directly as it is static
	System.out.println(Doctor.i);
}
}
interface Doctor{//we can not create object of interface
	//there is no compulsion to have a method
	//Interfaces with no methods are called marker interfaces//roll eg.->a person playing role of idol man(who does nothing)
	//You can have one or more methods
	//A interface with only one method is called Functional Interface
	public void doCure();
	//interface with more than one method is a normal interface
	//What is special about functional interfaces
	//Functional interfaces alone can use - Method Expressions and Lambdas.-- introduced in jdk8
	//where as marker or normal interfaces (interface with more than one method)cannot use MethodExpressions and Lambda 
	//Interfaces can also have fields declared.
	final static int i=10;//even if you dont give it is still final and static
	//Fields are by default static and final. which means they are constants.
	//interfaces can also have methods with business logic from jdk9
	default public void met() {
		System.out.println("met called....");
	}
	//default methods can be accessed only within the interfaces
	//they are equivalent to template method of abstract classes
}
//interface can extend another interface
interface Surgeon extends Doctor{//surgeon is kind of Doctor//it can extends only one interface
	
}
interface Nurse{
	public void doNursing();
}
//implementation class of Interface...
class AlopathyMedicalCollege implements Doctor,Nurse{//we can implement multiple interfaces (people can join either to become doctor or nurse)
//the class(AlopathyMedicalCollege) which implements interfaces is called as implementation class
	@Override
public void doNursing() {
	System.out.println("Nursing method called....");
}
	@Override
	public void doCure() {
		System.out.println("do cure method called..as per alopathy.....");
	}
}
class HomeoPathyMedicalCollege implements Doctor{//how many implementation (of doctor interface) can I have?=as many as I want
	@Override
	public void doCure() {
		System.out.println("do cure method called ... as per homoeopathy...");
	}
}