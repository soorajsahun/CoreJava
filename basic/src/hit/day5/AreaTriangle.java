package hit.day5;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
	System.out.println("Enter base and height of triangle");
	Scanner scan=new Scanner(System.in);
	float x=scan.nextFloat();
	float y=scan.nextFloat();
	float z=x*y/2;
	System.out.println("The area of triangle="+z);
	scan.close();
	}
}
