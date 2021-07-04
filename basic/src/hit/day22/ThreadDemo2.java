package hit.day22;
//to implement Asynchronous execution(assigning job to other person)
import java.util.Date;

public class ThreadDemo2{
	public static void main(String[] args) throws Exception{
		Thread t=Thread.currentThread();
//		t.setName("Suraj");
		VaccinationCenter vc=new VaccinationCenter();
		System.out.println(new Date());
		System.out.println("Before coming to the class...");
//		vc.getToken();//->this is when we ourself go to getToken
		
//		creating new Thread
		Thread kala=new Thread(new JobToKala(vc),"Kala");//->this is when we assign anyone(kala) to go to getToken
		kala.start();//->to call the run method
		System.out.println("Start the class of 7-9..."+new Date());
	}
}
class JobToKala implements Runnable{
	VaccinationCenter vc;
	public JobToKala(VaccinationCenter vc) {
		this.vc=vc;
	}
	@Override
	public void run() {
		try {
		vc.getToken();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class VaccinationCenter{
	public void getToken() throws Exception{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"..Standing in qeue for 10 sec...");
		Thread.sleep(10000);
		System.out.println("Got token..."+new Date());
	}
}

