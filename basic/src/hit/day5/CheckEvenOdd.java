package hit.day5;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
		scan.close();
	}

}
