package hit.day27;

import java.util.ArrayList;
import java.util.List;

public class GenericsInCollection {
	public static void main(String[] args) {
//		List list=new ArrayList();
		//so to avoid below three problems we will use GENERICS in collection also
		List<String> list=new ArrayList<>();
		
		list.add("hdbha");
		list.add(new Box());//now we have made List as GENERICS means it will accept only String type of object
		list.add(12156);//therfore this is giving compile time error
		list.add("bhkbsf");
		list.add("hukjbg");
		
//		1)problem 1-ClassCastException at runtime
		String s=(String)list.get(0); 
//		String s1=(String)list.get(1);//for this we will get ClassCastException at runtime
		Box box=(Box)list.get(1);//but if we don't know the type of object,so there will be possibility of getting ClassCastException
		
//		2)problem 2-if -else condition
		for(Object o:list) {//but we don't
			if(o instanceof String) {
				String s2=(String)o;
				System.out.println(s2);
			}
			else if(o instanceof Box) {
				Box box1=(Box)o;
				System.out.println(box1);
			}
		}
//		3)problem 3-for 0th index it will run but for next index it will show ClassCastException
		for(Object o:list) {
			String s3=(String)o;
			System.out.println(s3);
		}
		
	}
}
class Box{
	
}

