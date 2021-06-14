package hit.day5;

import java.util.Scanner;

public class FindLCM {
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int lcm;
		for(lcm=x>y?x:y;lcm<=(x*y);lcm=lcm+(x>y?x:y))
		{
			if(lcm%x==0 && lcm%y==0)
			break;
		}
		System.out.printf("Lcm of %d and %d is %d",x,y,lcm);
		scan.close();
}
}

		
