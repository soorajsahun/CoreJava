package rough;

//import hit.day18.HomeoPathyMedicalCollege;

public class RelfectionDemmo {
	static boolean b;
	public static void main(String[] args) {
		RelfectionDemmo obj=new RelfectionDemmo();
		System.out.println(b);
		obj.met(b);
	}
	public void met(boolean valid) {
		if(valid) {
			System.out.println("the value of vaid is true....");
		}
		else {
			System.out.println("the value of valid is false....");
		}
	}
}
