/*
 *There are two things u have to do for exception handling
 *
 * 1.  Stop the abrupt termination of your application. - very important - Relief
 * 2.  Give a alternate flow- optional - we will talk about it later. - Rehabilitation
 *
 */
package hit.day14;
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		//Integer.parseInt - will convert a string to a number
		try {//whichever you feel is capable of throwing an exception, put 'try'
			Integer.parseInt(args[0]);
			int i=1/Integer.parseInt(args[0]);//the program gets terminated at this point....
			
		}catch(Exception e) {//(Throwable e) bhi chalega
			
		}
		System.out.println("After Exception....");
	}
}