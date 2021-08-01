package hit.day17;

public class Singleton {
	public static void main(String[] args) {
		//Single single1=Single.createSingleObject();
		//Single single2=Single.createSingleObject();
		new Thread(()->{Single.createSingleObject();}).start();
		new Thread(()->{Single.createSingleObject();}).start();
	}
}
class Single{	
	private Single() {
		System.out.println("object of single is created....");
	}
	//factory method
	private static Single single;
	synchronized public static Single createSingleObject() {
		if(single==null) {
			try {Thread.sleep(1000);}catch(Exception e) {}
			single=new Single();
		}
		return single;
	}
}
