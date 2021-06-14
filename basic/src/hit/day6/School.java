package hit.day6;

public class School {
//	Two things:
//		1)properties-variables
//		2)behaviours-methods
	void admission() {//a void method without parameter
		System.out.println("admission done...");
	}
	int feesPayment(int money) {//a returnable method with parameter
		System.out.println("accept money from you as fees...");
		System.out.println("returns the change...");
		if(money>500) {
			return money-200;
		}
		else if(money<500) {
			return money-100;
		}
		return money;
	}
	int askDonation() {//a returnable method without parameter
		return 100;
	}
	public static void main(String[] args) {
		School obj=new School();
		int money=obj.feesPayment(1000);
		System.out.println(money);
		
		Human shoiab=new Human();//shoiab is 'reference name' to object of 'new Human'=> eg.child born 'new Human' with name 'shoiab'
		shoiab.smile();
		
		School narayana;//only 'reference name' is created => eg. without taking born child name is given
		Human taqi=null;//null is used to remove compilation error but run time error will be there
		//taqi.smile();//without creating object 'new School' this will show error => eg.taqi is name of child which is not born nd we want him to smile
		
		new Human();//nameless object or anonymous object
		new Human().smile();//eg child born but name not given and he will smile
	}
}
class Human {
	public void smile() {
		System.out.println("smiling is a noble act");
	}
}
class Doctor{
	
	}

