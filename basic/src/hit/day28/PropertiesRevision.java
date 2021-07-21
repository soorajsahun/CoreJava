package hit.day28;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
public class PropertiesRevision {
	public static void main(String[] args) {
		Properties prop=new Properties();
		
		prop.put("mykey1", "myvalue111111111111");
		prop.put("mykey2", "value 22222222222222222");
		prop.put("mykey3", "value 22222222222222222");
		
		//First Reading method
		System.out.println(prop.get("mykey1"));
		System.out.println("");
		//Second Reading Method
		Enumeration e=prop.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("");
		
		Set set=prop.entrySet();//Memorize syntax
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
}