package hit.day28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo2 {
	public static void main(String[] args) {
//		Set<String> set=new HashSet<>();
		Set<String> set=new TreeSet<>();
		set.add("Suraj");
		set.add("Manoj");
		set.add("Rahul");
		set.add("Suraj");
		System.out.println(set);
		
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(String s:set) {
			System.out.println(s);
		}
	}
}
