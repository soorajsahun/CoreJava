package hit.day5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year");
		Scanner scan=new Scanner(System.in);
		int y=scan.nextInt();
		if(y%4==0)
		{
			System.out.printf("%d is Leap year",y);
		}
		else
		{
			System.out.printf("%d is not a Leap year",y);
		}
		scan.close();
	}

}
