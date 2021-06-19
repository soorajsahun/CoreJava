package hit.day5_Lab1;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		int c;
		System.out.println("Enter x and y");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		c=x+y;
		System.out.println("The addition is ="+c);
		scan.close();
	}
}
