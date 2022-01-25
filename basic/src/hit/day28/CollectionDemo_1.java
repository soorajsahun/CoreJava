package hit.day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo_1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Suraj");
		list.add("Rahul");
		list.add("Manoj");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Nimesh");
		list2.add("Rohit");
		 
//		list.addAll(list2);
//		System.out.println(list);
//		
//		list.addAll(2, list2);
//		System.out.println(list); 
//		
//		list.clear();
//		System.out.println(list);
		
		ArrayList<String> clonelist=(ArrayList<String>)list.clone();
		System.out.println(clonelist);
		
		System.out.println(list.contains("Suraj"));
		System.out.println(list.indexOf("Suraj"));
		System.out.println(list.lastIndexOf("Suraj"));
		
		list.remove(1);
		list.remove("Suraj");
		System.out.println(list);
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
//		numbers.removeIf(num -> num%2==0);
//		System.out.println(numbers);
//		
//		ArrayList<String> list3=new ArrayList<>(Arrays.asList("Naveen","Tom","Sanjeev","Tom"));
//		list3.retainAll(Collections.singleton("Tom"));//want to check how many times element is repeated
//		System.out.println(list3);
		
//		ArrayList<Integer> subList=new ArrayList<Integer>(numbers.subList(1,2));
//		System.out.println(subList);
		
		Object arr[]=numbers.toArray();
		System.out.println(Arrays.toString(arr));
		
	}
}
