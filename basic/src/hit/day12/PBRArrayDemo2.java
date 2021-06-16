package hit.day12;
//arrays are object type and the belive in Pass by reference.
public class PBRArrayDemo2 {
	public static void main(String[] args) {
		int arr[]=new int[5];//here int is like class name
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		AcceptArray obj=new AcceptArray();
		obj.modifyArray(arr);//"arr" is reference means we passing reference
		System.out.println("After Modification...");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		System.out.println();	
	}
}
class AcceptArray{
	public void modifyArray(int a[]) {//here int is like class name
		a[2]=300;
	}
}