package hit.day28;

import java.util.Vector;

//Create a Vector object.
//Add elements to vector using add() method of Vector class.
//Use hashMoreElements() and nextElement() Methods of Enumeration to iterate through the Vector.

public class Enumeration {
	public static void main(String[] args) {
		Vector<String> list=new Vector<String>();
		list.add("Rahul");
		list.add("Manoj");
		list.add("Suraj");
		
		java.util.Enumeration<String> en=list.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
