package hit.day5;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i;
		int fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.printf("Factorial of %d is %d",n,fact);
		
		scan.close();
	}

}
