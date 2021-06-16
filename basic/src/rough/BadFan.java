package rough;

import java.util.Scanner;

public class BadFan {
public static void main(String[] args) {
	BadFan1 shaitan=new BadFan1();
	Scanner scan=new Scanner(System.in);
	while(true) {
		System.out.println("Enter any key to pull...");
		scan.next();
		shaitan.pull();
	}
}
}
//class BadFan1{
//	int state;
//	public void pull(){
//		if(state==0) {
//			System.out.println("switch on state....");
//			state=1;
//		}
//		else if(state==1) {
//			System.out.println("medium speed state...");
//			state=2;
//		}
//		else if(state==2) {
//			System.out.println("high speed state.....");
//			state=3;
//		}
//		else if(state==3) {
//			System.out.println("switch off state...");
//			state=0;
//		}
//	}
//}
