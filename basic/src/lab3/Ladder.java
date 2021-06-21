package lab3;

import java.util.Scanner;

public class Ladder{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int rows=scan.nextInt();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}
}