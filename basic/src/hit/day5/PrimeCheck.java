package hit.day5;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		System.out.println("Enter any positive integer number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i;
		for(i=2;i<n;i++) {
			if(n%i==0)
				break;
		}
		if(i==n) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	scan.close();
	}
}
