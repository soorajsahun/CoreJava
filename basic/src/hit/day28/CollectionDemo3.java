package hit.day28;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
public class CollectionDemo3 {
	public static void main(String[] args) {
		//Enumeration is only present in Vector class not in List class
		Vector<String> list=new Vector<>(10,5);//(initialCapacity,capacityIncrement)capacityIncrement=means we can increment 5 more elements
												//and also increases PERFORMANCE
		list.add("hello");
		list.add("hai");
		list.add("world");
		
		System.out.println(list);
		//list.ensureCapacity();
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains("haiii"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.set(1, "newvalue");//it will replace the existing one at that place
		System.out.println(list);
		Object s[]=list.toArray();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(String ss:list) {
			System.out.println(ss);
		}
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(iter.hasNext());
		
		ListIterator<String> listiter=list.listIterator();
		//list.add("new value....");
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
	
		Enumeration<String> en=list.elements();//Enumeration is only present in Vector class
		list.add("new value.....2222..................");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	
	
		
	}
}