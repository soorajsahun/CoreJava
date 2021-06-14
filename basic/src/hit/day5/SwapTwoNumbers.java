package hit.day5;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Enter first and second number");
		Scanner scan=new Scanner(System.in);
		int first=scan.nextInt();
		int second=scan.nextInt();
		int temp;
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		temp=first;
		first=second;
		second=temp;
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		scan.close();
	}

}
