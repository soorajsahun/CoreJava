package hit.day5_Lab1;

import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		System.out.println("Enter side of square");
		Scanner scan=new Scanner(System.in);
		float x=scan.nextFloat();
		float z=x*x;
		System.out.println("The area of square="+z);
		scan.close();
	}

}
