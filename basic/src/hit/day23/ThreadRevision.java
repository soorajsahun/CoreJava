package hit.day23;

public class ThreadRevision {
	public ThreadRevision() {
		Thread t=new Thread(new JobToThread());
		t.start();
	}
	public static void main(String[] args)throws Exception {
		new ThreadRevision();
		Thread t=Thread.currentThread();
		System.out.println(t);//->this causes interruption to child thread to execute
		for(int i=0;i<5;i++) {
			t.sleep(1000);//->this causes interruption to child thread to execute
			System.out.println(i); //->this causes interruption to child thread to execute
		}
	}
}
class JobToThread implements Runnable{
	@Override
	public void run() {
		System.out.println("Child thread is called");
		
	}
}
