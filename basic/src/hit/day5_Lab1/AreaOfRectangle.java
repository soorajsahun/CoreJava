package hit.day5_Lab1;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		System.out.println("Enter length and breadth of rectangle");
		Scanner scan=new Scanner(System.in);
		float x=scan.nextFloat();
		float y=scan.nextFloat();
		float z=x*y;
		System.out.println("The area of rectangle="+z);
		scan.close();
	}
}
