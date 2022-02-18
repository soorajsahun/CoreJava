package hit.day28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
	public static void main(String[] args) {
		HashMap<Integer, String> map1=new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2=new HashMap<>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3=new HashMap<>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		HashMap<Integer, String> map4=new HashMap<>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		//1.on the basis of key-value: using equals method
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		//2.compare hashmaps for same keys:using keySet()
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		
		//3.combine keys:using hashSet()
		HashSet<Integer> combineKeys=new HashSet<>(map1.keySet());
		//add keySet from map4
		combineKeys.addAll(map4.keySet());	
		System.out.println(combineKeys);
		//extra key
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);
		
		//4.compare maps by values
		HashMap<Integer, String> map5=new HashMap<>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		HashMap<Integer, String> map6=new HashMap<>();
		map6.put(3, "C");
		map6.put(1, "A");
		map6.put(2, "B");
		
		HashMap<Integer, String> map7=new HashMap<>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");
		
		//Duplicates not allowed:using Arraylist
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		
		//Duplicates allowed:using HashSet
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));
		
	}
}
