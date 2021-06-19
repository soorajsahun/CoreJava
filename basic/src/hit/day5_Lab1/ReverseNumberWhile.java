package hit.day5_Lab1;

import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=n,r,rev=0;
		while(x!=0)
		{
			r=x%10;
			rev=rev*10+r;
			x=x/10;
	} 
		System.out.println("After reverse="+rev);
		scan.close();
	}
}
