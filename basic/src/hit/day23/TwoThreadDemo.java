package hit.day23;
//one object,two threads, two transaction
//problem of data inconsistency solved
public class TwoThreadDemo {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("Muhammim");
		System.out.println(t.getName()+" is counter master");
		
		ReservationCounter central=new ReservationCounter();
		Thread taqi=new Thread(new JobToThread1(central,500),"taqi");
		Thread imran=new Thread(new JobToThread1(central,1000),"imran");
		
		taqi.start();
		imran.start();
	}
}
class JobToThread1 implements Runnable{
	ReservationCounter central;int amt;
	public JobToThread1(ReservationCounter central,int amt) {
		this.central=central;
		this.amt=amt;
	}
	@Override
	public void run() {
		synchronized (central) {//here we synchronized the ReservationCounter(object),if one thread work gets completed then only 2nd thread will enter
		central.bookTicket(amt);
		try {Thread.sleep(1000);}catch(Exception e) {}//->disturbance
		central.giveChange();
		}
		
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" came to book ticket");
		System.out.println(name+" brought "+amt);
	}
public void giveChange() {
	Thread t=Thread.currentThread();
	String name=t.getName();
	System.out.println(name+" takes "+(amt-100));
	}
	
}
