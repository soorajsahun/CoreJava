package hit.day20;

public class CommandPatternRevision {
	static SevaDepartment1 myGoverment=new SevaDepartment1();
	static{
		Police1 pd=new Police1();
		Health1 hd=new Health1();
		Corporation1 c=new Corporation1();
		DeathCertificate1 dc=new DeathCertificate1(pd,hd,c);
		myGoverment.setCommand(dc, 0);
	}
	public static void main(String[] args) {
		myGoverment.executeCommand(0);
	}
}
interface Command1{
	public void execute();
}
class DeathCertificate1 implements Command1{
	Police1 police;Health1 health;Corporation1 corporation;
	public DeathCertificate1(Police1 police, Health1 health, Corporation1 corporation) {
		this.police=police;
		this.health=health;
		this.corporation=corporation;
	}
	@Override
	public void execute() {	
		System.out.println("process of death certificate started by seva...");
		police.doInvestigation();
		health.doPostMortem();
		corporation.doGiveCertificate();
		System.out.println("now take the certificate..............");
	}
}
class Police1{
	public void doInvestigation() {
		System.out.println("investigation done....");
	}
}
class Health1{
	public void doPostMortem() {
		System.out.println("post mortem done....");
	}
}
class Corporation1{
	public void doGiveCertificate() {
		System.out.println("death certificate done...");
	}
}
class SevaDepartment1{
	Command1 command[]=new Command1[5];
	public SevaDepartment1() {
	for(int i=0;i<5;i++) {
		command[i]=new DummyCommand1();
	}
}
	public void executeCommand(int slot) {
		command[slot].execute();
	}
	public void setCommand(Command1 c,int slot) {
		command[slot]=c;
	}
}

class DummyCommand1 implements Command1{
	@Override
	public void execute() {
		System.out.println("I am dummy and yet to operational...");
		
	}
}
