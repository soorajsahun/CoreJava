package hit.day14;
public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			int i=1/0;
		}catch(Exception e) {
			//to print the exception,we use these mehods
			e.initCause(e);//set cause
			System.out.println(e.getCause());//then print cause
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block called....");
		}
		System.out.println("after exception...");
	}
}