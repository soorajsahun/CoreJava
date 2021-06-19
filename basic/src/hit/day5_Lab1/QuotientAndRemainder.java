package hit.day5_Lab1;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n1 and n2");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int quotient=n1/n2;
		int remainder=n1%n2;
		System.out.println("Quotient is:"+quotient);
		System.out.println("Remainder is:"+remainder);
		scan.close();
	}

}
