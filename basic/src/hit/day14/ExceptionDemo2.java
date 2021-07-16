package hit.day14;
public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		//Integer.parseInt - will convert a string to a number
		int num=0;
		try {
			num=Integer.parseInt(args[0]);
			int i=1/num;//the program gets terminated at this point....
			System.out.println("immediate line after exception...");
		}		
		catch(ArithmeticException ae) {
				System.out.println("logic to handle arithmetic exception");
			//	num=1;
			}
		catch(ArrayIndexOutOfBoundsException aoe) {
			//	num=1;
			}
		catch(Exception e) {//this exception can't be at 1st place
			System.out.println("global exception handling code...common code");
			//num=1;
		}
		/* Finally
		* Finally is a block of code which gets executed at all times.
		* - Whether an exception arises or not, finally is executed
		*- whether an exception is handled or not, finally is executed..
		*-whether program gets abruptly terminated,finally is called
		*/
		finally {
			System.out.println("finally called...");
			num=1;
		}
		int i=1/num;
		System.out.println("value of i is...:"+num);
		System.out.println("After Exception....");
	}
}
