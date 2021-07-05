package hit.day22;
/*Objectives of this exercise
 * How to make two threads work on a single object...
 * How to create two threads and assign two jobs
 * How to control threads
 */
//one object,two threads, two transaction
//object lock
//problem is-data inconsistency
public class ThreadDemo3{
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("Muhhamim");//counter master
		System.out.println(t.getName()+" is station master");
		
		ReservationCounter central=new ReservationCounter();
		
		Thread imran=new Thread(new JobBookingTicket(central,500),"Imran");
		Thread taqi=new Thread(new JobBookingTicket(central,1000),"Taqi");
		
		imran.start();
		taqi.start();
	}
}
class JobBookingTicket implements Runnable{
	ReservationCounter central;
	int amt;
	public JobBookingTicket(ReservationCounter central,int amt) {
		this.central=central;
		this.amt=amt;
	}
	@Override
	public void run() {
		central.bookTicket(amt);
		central.giveChange();
		
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
























//public class ThreadDemo3 {
//	public static void main(String[] args) {
//		Thread t=Thread.currentThread();
//		t.setName("muhaimeen");
//		System.out.println("Reservation counter starting working..."+t.getName());
//		
//		ReservationCounter central=new ReservationCounter();
//		
//		Thread imran=new Thread(new BookingJob(central,1000),"imran");
//		Thread taqi=new Thread(new BookingJob(central,500),"taqi");
//		
//		imran.start();
//		taqi.start();
//	}
//}
//class BookingJob implements Runnable{
//	ReservationCounter central;int amt;
//	public BookingJob(ReservationCounter central,int amt) {
//		this.central=central;
//		this.amt=amt;
//	}
//	@Override
//	public void run() {
//		central.bookTicket(amt);
//		central.giveChange();
//	}
//}
//class ReservationCounter{
//	int amt;
//	public void bookTicket(int amt) {
//		Thread t=Thread.currentThread();
//		this.amt=amt;
//		String name=t.getName();
//		System.out.println(name+" has come to book the ticket...");
//		System.out.println(name+" brought...:"+amt);
//	}
//	
//	public void giveChange() {
//		Thread t=Thread.currentThread();
//		String name=t.getName();
//		System.out.println("Change given to...:"+name);
//		System.out.println(name+" takes...:"+(amt-100));
//	}
//}