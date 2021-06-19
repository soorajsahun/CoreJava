package hit.day5_Lab1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		System.out.println("Enter base x and exponent y");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(); 
		int y=scan.nextInt();
		int i,p=1;
		for(i=1;i<=y;i++)
		{
			p=p*x;
		}
		System.out.printf("The power is %d",p);
		scan.close();
	}

}
