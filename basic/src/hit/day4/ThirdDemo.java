package hit.day4;

import java.util.Scanner;

public class ThirdDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter x and y");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int c=x+y;
		System.out.println("Addition of x and y "+c);
		
		scan.close();
	}

}
