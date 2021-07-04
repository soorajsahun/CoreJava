package hit.day22;//basic concepts
//Critical path - The maximum limit or time within which u need to complete the task
//Asynchronous work/ execution - you use threads (A layer of indirection)
public class ThreadDemo1 {
	public static void main(String[] args) throws Exception{
//		by default java runs a main thread
//		already by default there is one Thread called main Thread is present is Java
		
		Thread t=Thread.currentThread();//Thread.currentThread()->this returns object of class Thread
		t.setName("this is my main thread...");
		t.setPriority(10);
		System.out.println(t);
		System.out.println("Now thread will sleep for 5 seconds...");
		Thread.sleep(5000);//or->t.sleep(5000);
		met();
		System.out.println("start the class");	
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	static void met()throws Exception {//even though void method does not returns anything but in thread it sends signal
		System.out.println("method called...");
		Thread.sleep(5000);
	}
}
