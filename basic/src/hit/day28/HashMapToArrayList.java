package hit.day28;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToArrayList {
	public static void main(String[] args) {
		HashMap<Integer, String> map1=new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		//convert hashmap keys into arraylist
		ArrayList<Integer> list=new ArrayList<Integer>(map1.keySet());
		for(int i:list) {
			System.out.println(i);
		}
		//convert hashmap values into arraylist
		ArrayList<String> list1=new ArrayList<>(map1.values());
		for(String i:list1) {
			System.out.println(i);
		}
	}
}
