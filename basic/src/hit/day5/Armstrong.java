//package hit.day5;
//
//public class Armstrong {
//
//	public static void main(String[] args)
//	{
//		System.out.println("Armstrong numbers are ");
//		int n,x,r,s;
//		for(n=1;n<1000;n++)
//		{
//			s=0;
//			x=n;
//			while(x!=0)
//			{
//				r=x%10;
//				s=s+r*r*r;
//				x=x/10;
//			}
//			if(s==n)
//			{
//				System.out.printf("%d\n",n);
//			}
//		}
//	}
//}
package hit.day5;

public class Armstrong {

	public static void main(String[] args)
	{
		int n=371,x,r,s;
		
		{
			s=0;
			x=n;
			while(x!=0)
			{
				r=x%10;
				s=s+r*r*r;
				x=x/10;
			}
			if(s==n)
			{
				System.out.printf("%d is Armstrong number\n",n);
			}
		}
	}
}
