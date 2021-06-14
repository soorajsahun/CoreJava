package hit.day8;

import java.util.Scanner;

public class SimpleDemo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=scan.nextInt();
		System.out.println("Enter 2nd number to stop loop");
		int num2=scan.nextInt();
		
		for(int i=0;i<num1;i++) {
			if(i%2==0) {
				System.out.println("the even number in the series..."+i);
			}
			else if(i==num2) {
				System.out.println("Job Over");
				break;
			}
		}

	}

}
