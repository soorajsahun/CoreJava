package hit.day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,5,8,9,4,4,7,6));
		System.out.println(al);
		//1 method-LinkedHasSet
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>(al);
		ArrayList<Integer> al1=new ArrayList<Integer>(lhs);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		
		//2 method-Stream
		ArrayList<Integer> marks=new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,5,8,9,4,4,7,6));
		System.out.println(marks);
		List<Integer> ml=marks.stream().distinct().collect(Collectors.toList());
		System.out.println(ml);
	}
}
