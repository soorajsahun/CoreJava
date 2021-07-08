package hit.day28;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo4 {
	public static void main(String[] args) {
//		Set<String> set=new HashSet<>();
		Set<String> set=new TreeSet<>(new MyComparator());
		set.add("Apple");
		set.add("Ball");
		set.add("Cat");
		set.add("Dog");
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
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}