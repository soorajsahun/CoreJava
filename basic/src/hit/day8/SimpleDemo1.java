package hit.day8;

import java.util.Scanner;

public class SimpleDemo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=scan.nextInt();
		System.out.println("Enter 2nd number");
		int num2=scan.nextInt();
		
		System.out.println("Enter your choice");
		System.out.println("1 for addition");
		System.out.println("2 for multiplication");
		int choice=scan.nextInt();
		
		int result=(choice==1)?(num1+num2):(num1*num2);
		System.out.println("the result is "+result);
	}

}
