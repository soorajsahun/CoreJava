package hit.day5_Lab1;

import java.util.Scanner;

public class CountNoOfDigits {
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		int n=s.nextInt();
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}
