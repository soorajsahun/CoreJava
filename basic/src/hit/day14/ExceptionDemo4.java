package hit.day14;
public class ExceptionDemo4 {
	public static void main(String[] args) {
		ATM atmUser=new ATM();
		try {
			atmUser.insertCard("invalid");
		}catch(InvalidCardException ice) {
			System.out.println(ice);
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
*If you pass string value in object, java compiler internally invokes the toString() method on the object.
*/
