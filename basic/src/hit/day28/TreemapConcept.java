package hit.day28;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class TreemapConcept {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<>();
		tm.put(100, "Suraj");
		tm.put(200, "Rahul");
		tm.put(300, "Manoj");
		tm.put(400, "Rahul");
		tm.put(500, "Manoj");
		System.out.println(tm);
		
		System.out.println(tm.firstKey());
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastKey());
		System.out.println(tm.lastEntry());
		Set<Integer> keyLessThan300=tm.headMap(300).keySet();
		System.out.println(keyLessThan300);
		Set<Integer> keyGreaterThan300=tm.tailMap(300).keySet();
		System.out.println(keyGreaterThan300);
		
		
	}
}
