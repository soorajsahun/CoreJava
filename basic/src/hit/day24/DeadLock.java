package hit.day24;
//DeadLock=Circular dependency created between two synchronized block creates Deadlock
public class DeadLock {
	public static void main(String[] args) {
		Frog frog=new Frog();
		Crane crane=new Crane();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				crane.eat(frog);
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				frog.escape(crane);
				
			}
		}).start();
	}

}
class Crane{
	synchronized public void eat(Frog frog) {
//		System.out.println();//->this create slight delay so that deadlock can happen
		frog.leaveCalledByCrane();
	}
	synchronized public void leaveCalledByFrog() {
		
	}
}
class Frog{
	synchronized public void escape(Crane crane) {
		crane.leaveCalledByFrog();
	}
	synchronized public void leaveCalledByCrane() {
		
	}
}
