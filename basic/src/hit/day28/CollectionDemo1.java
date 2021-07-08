package hit.day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo1 {
	public static void main(String[] args) {
//		ArrayList<String> list=new ArrayList<String>();
//		or
		List<String> list=new ArrayList<>(10);//10 is (int iniatialCapacity) means that much data can store and also increases PERFORMANCE
		list.add("Suraj");
//		list.add(248);//only String type of object can be passed
		list.add("Rahul");
		list.add("Manoj");
		list.add("Manoj");//means we can have duplicates in List Collections

		
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.size());
		System.out.println(list.contains("Rahul"));//this method will return Boolean Value
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.set(0, "Manoj");//it will replace the existing one at that place
		System.out.println(list);
		Object o[]=list.toArray();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(String s:list) {
			System.out.println(s);
		}
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
//		System.out.println(iter.next());//we can't reuse it
		
		ListIterator<String> listIter=list.listIterator();
		while(listIter.hasNext()) {
			System.out.println(listIter.next());
		}
		
		while(listIter.hasPrevious()) {
			System.out.println(listIter.previous());
		}
		
	}
}
