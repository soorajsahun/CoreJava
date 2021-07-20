package hit.day24;
//problem is-inner thread communication problem-solved
public class TwoThreadsOneTask {
	public static void main(String[] args) {
		Canon bofors=new Canon();
		ShootingTask st=new ShootingTask(bofors);//one task
		
		Thread naina=new Thread(st,"Naina");
		Thread shabeer=new Thread(st,"Shabeer");
		naina.start();
		shabeer.start();
	}
	
}
class ShootingTask implements Runnable{
	Canon gun;
	public ShootingTask(Canon gun) {
		this.gun=gun;
	}
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Naina")) {
			for(int i=0;i<5;i++) {
				gun.fill();
			}
			
		}
		else if(Thread.currentThread().getName().equals("Shabeer")) {
			for(int i=0;i<5;i++) {
				gun.shoot();
			}
		}
		
	}
}
class Canon{
	boolean flag;;//default value of boolean is false
synchronized public void fill() {
	Thread t=Thread.currentThread();
	String name=t.getName();
	if(flag) {//means if(flag==true)
		try {
			wait();//when u call WAIT on a thread inside a monitor, remember another thread CAN enter the monitor
//			Thread.sleep(1);//whereas when u call SLEEP on a thread inside a monitor, remember another thread CANNOT enter the monitor.
		}catch(Exception e) {}
	}
	System.out.println(name+" fill the gun");
	notify();
	flag=true;
	}
//wait and notify can be used only inside a monitor
//monitor means, when you create a synchronized block (either pacimistic or optimistic), u call it as monitor
//when u call WAIT on a thread inside a monitor, remember another thread CAN enter the monitor
//whereas when u call SLEEP on a thread inside a monitor, remember another thread CANNOT enter the monitor.

synchronized public void shoot() {
	Thread t=Thread.currentThread();
	String name=t.getName();
	if(!flag) {
		try {
			wait();
//			Thread.sleep(1);
		}catch(Exception e) {}
	}
	System.out.println(name+" shoot the gun");
	notify();
	flag=false;
}
}
