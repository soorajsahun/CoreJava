package hit.day5;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
	System.out.println("Enter radius of circle");
	Scanner scan=new Scanner(System.in);
	float r=scan.nextFloat();
	double a=Math.PI*r*r;
	System.out.println("The area of circle="+a);
	scan.close();
	}
}
