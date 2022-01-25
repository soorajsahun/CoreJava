package hit.day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		//1 method
		List<String> list=Collections.synchronizedList(new ArrayList<>());
		list.add("Suraj");
		list.add("Rahul");
		list.add("Manoj");
		
		//add,remove-we dont need explicit synchronization
		//to fetch/traverse the values from list-we have to use explicit synchronization
		
		synchronized (list) {
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}
		//2 method
		CopyOnWriteArrayList<String> list1=new CopyOnWriteArrayList<>();
		list1.add("Suraj");
		list1.add("Rahul");
		list1.add("Manoj");
		//we dont need explicit synchronization on any operation-add,remove,fetch
		Iterator<String> it1=list1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}
}
