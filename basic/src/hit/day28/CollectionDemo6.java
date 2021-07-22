package hit.day28;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionDemo6 {
	public static void main(String[] args) {
		
		Properties prop=new Properties();
		prop.put("1", "Suraj");
		prop.put("2", "Rahul");
		prop.put("3", "Manoj");
		prop.put("4", "Rohit");
		
		//first reading method//we provide key it retirns value
		System.out.println(prop.get("2"));
		
		//Second reading method//this returns value
		Enumeration e=prop.elements();
		while(e.hasMoreElements()) {
//			String value=(String)e.nextElement();
//			System.out.println(value);
//			or
			System.out.println(e.nextElement());
		}
		
		//Third reading method//this returns key,value pair
		Set set=prop.entrySet();//Memorize syntax
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}
