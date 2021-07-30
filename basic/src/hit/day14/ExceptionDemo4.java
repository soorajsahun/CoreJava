package hit.day14;
public class ExceptionDemo4 {
	public static void main(String[] args) {
		ATM atmUser=new ATM();
		try {
			/*when you have throw throws ,it makes the caller to compulsory handle the exception,
			 * if it does not handle,it won't allow to compile
			 * This is called CheckedException
			 */
			atmUser.insertCard("invalid");
		}catch(InvalidCardException ice) {
			System.out.println(ice);//when you print reference of an object(ice),toString method is called
			System.out.println("Action or logic ....for invalid card...");
		}
		System.out.println("normal transaction....");
		
	}
}
class ATM{
	public void insertCard(String cardValidity)throws InvalidCardException {
		if(cardValidity.equals("valid")) {
			System.out.println("I will process the card....");
		}
		else {
				throw new InvalidCardException("You have inserted a invalid card....");	
			}
		}
}
//class InvalidCardException extends Exception{
//	String msg;
//	public InvalidCardException(String msg) {
//		this.msg=msg;
//	}
//	
//	@Override
//	public String toString() {
//		return "Exception is..:"+msg;
//	}
//}
/*toString is method of "Object" class
*The toString() method returns the string representation of the object.
*when you print reference of an object(ice),toString method is called*/
