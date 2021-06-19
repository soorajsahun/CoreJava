package hit.day5_Lab1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose operator('+','-','/','*')");
		char operator=scan.next().charAt(0);
		System.out.println("Enter a and b");
		float a=scan.nextFloat();
		float b=scan.nextFloat();
		switch(operator) {
		case '+':
			System.out.printf("Addtion of %f and %f is %f",a,b,a+b);
			break;
		case '-':
			System.out.printf("Subtraction of %f and %f is %f",a,b,a-b);
			break;
		case '/':
			System.out.printf("Division of %f and %f is %f",a,b,a/b);
			break;
		case '*':
			System.out.printf("Multiplication of %f and %f is %f",a,b,a*b);
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}
		scan.close();	}
}
