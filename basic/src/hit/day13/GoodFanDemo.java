package hit.day13;
import java.util.Scanner;
/*
 * 1. Convert the condition to classes
 * 2. Group them under a hierarchy - Inheritance
 * 3. Create a Association between the using class and the hierarchy class - association
 *
 * Design Patterns - Strategy Pattern
 * A strategy to implements open close principle
 * A strategy to remove if-else-condition
 */
/*-->STRATEGY PATTERN RULES
 * 100% the parent class should be declared abstract
 * abstract class is a special class used to represent the parent class, its a classfier class
 * it provided a overview of the heirarchy which u create by extending this class..
 * You cannot create an object of this class
 * There is no compulsion to have any code inside the abstract class
 */

public class GoodFanDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//BadFan shaitan=new BadFan();
		GoodFan khaitan=new GoodFan();
		while(true) {
			System.out.println("Press a key and then Enter for pulling chain..");
			scan.next();
			khaitan.pull();
		}
	}
}
/*
 * Paint brush followed uni directional association relationship
 * Fan will follow bi-directional association relationship
 */
class GoodFan{
	State state=new SwitchOffState();//association of GoodFan to State
	public void pull() {
		state.pull(this);//this refers to current object which is 'fan'
	}
}
/*
 * 100% the parent class should be declared abstract
 * abstract class is a special class used to represent the parent class, its a classfier class
 * it provided a overview of the heirarchy which u create by extending this class..
 * You cannot create an object of this class
 * There is no compulsion to have any code inside the abstract class
 */
abstract class State{//override krne ke baad code me changes krte hai
	public abstract void pull(GoodFan fan);// {}
}
class SwitchOffState extends State{// condition class grouped under a category
	public void pull(GoodFan fan) {
		System.out.println("Switch on state....");
		fan.state=new SwitchOnState();//association of state to GoodFan
	}//here the method 'void pull' is compulsory, if it is not there then state will not on next state
	// so to ensure that this method should be there,we use abstract method	from where it is overrided
}
class SwitchOnState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("medium speed state.............");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("high speed state...........");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("swtitc off state....");
		fan.state=new SwitchOffState();
	}
}
class BadFan{
	int state;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state...");
			state=1;
		}
		else if(state==1) {
			System.out.println("Medium speed state...");
			state=2;
		}
		else if(state==2) {
			System.out.println("High speed state...");
			state=3;
		}
		else if(state==3) {
			System.out.println("switch off state...");
			state=0;
		}
		
	}
}