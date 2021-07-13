package hit.day4;
public class CastingDemo {
	public static void main(String[] args) {
		
		byte b=100;//8 bit
		short s=b;//16 bit
		int i=s;//32 bit
		long l=i;//64 bit
		
		//casting will reduce the higher type to lower type
		//But remember when you do this, you may loose data precision
		long ll=257;//64 bit
		System.out.println("Long Data..:"+ll);
		int ii=(int)ll;//u cannot store 64 bit in 32 bit
		System.out.println("int data..:"+ii);
		short ss=(short)ii;//u cannot store 32 bit in 16 bit
		System.out.println("short data...:"+ss);
		byte bb=(byte)ss;//u cannot store 16 bit in 8 bit
		System.out.println("byte data..:"+bb);
		
		//Auto type promotion
		
		byte mybyte1=10;
		byte mybyte2=2;
		byte result=(byte)(mybyte1*mybyte2);//when I multiply or do arithmetic operations on byte, the reuslt will be int
		System.out.println(result);
		
		//Floating Numbers
		double d=12.34;//64 bit
		System.out.println("Double value..:"+d);
		float f=(float)d;//32 bit
		System.out.println("Float value..:"+f);
		
		int myint=(int)f;
		System.out.println("myint of float value..:"+myint);
	}
}