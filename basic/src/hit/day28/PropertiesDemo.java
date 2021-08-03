package hit.day28;
//ctrl+shift+o to import libraries
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args)throws Exception {
		Properties prop=new Properties();
		//same work HashMap can also do
		//so difference between Properties and HasMap is -> Properties have an added advantage of associating files with properties
		//HashMap prop=new HashMap();
		
//		prop.put("a1", "hello world");
//		prop.put("a2", "hai world");

		prop.load(new FileInputStream("config.properties"));
		
		System.out.println(prop.get("a1"));
		
		Set set=prop.entrySet();
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey()+":"+me.getValue());			
		}
	}
}
