package hit.day14;
public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			int i=1/0;
		}catch(Exception e) {
			//to print the exception,we use these mehods
			e.printStackTrace();//=>1st method
			System.out.println(e);//=>2nd method
//			e.initCause(e);//set cause=>3rd method
//			System.out.println(e.getCause());//then print cause
		}
		finally {
			System.out.println("finally block called....");
		}
		System.out.println("after exception...");
	}
}