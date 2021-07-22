package hit.day14;
public class InvalidCardException extends Exception{
	String msg;
	public InvalidCardException(String msg) {
		this.msg=msg;
	}
	
	@Override
	public String toString() {
		return "Exception is..:"+msg;
	}
}
/*toString is method of "Object" class
 * The toString() method returns the string representation of the object.
*If you pass string value in object(Constructor), java compiler internally invokes the toString() method on the object.
*/
