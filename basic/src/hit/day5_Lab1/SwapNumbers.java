package hit.day5_Lab1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		System.out.println("Enter first and second number");
		Scanner scan=new Scanner(System.in);
		int first=scan.nextInt();
		int second=scan.nextInt();
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		scan.close();
	}

}
