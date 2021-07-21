package hit.day25;
//two object,two threads,two static methods
public class ClassLockDemo {
	public static void main(String[] args) {
		Sample obj1=new Sample();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (Sample.class) {//class name.class
					
				obj1.met1();
				}
				
			}
		}).start();
		
		Sample obj2=new Sample();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (Sample.class) { 
				obj2.met2();
				}
				
			}
		}).start();
	}

}
class Sample{
	static int money=1000;
	public static void met1() {
		money=money+100;
		try{Thread.sleep(1000);}catch(Exception e) {};
		System.out.println("met1 called by Thread1..."+money);
	}
	public static void met2() {
		money=money+300;
		try{Thread.sleep(1000);}catch(Exception e) {};
		System.out.println("met2 called by Thread2..."+money);
	}
}
