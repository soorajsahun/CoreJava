package rough;

//import hit.day18.HomeoPathyMedicalCollege;

public class RelfectionDemmo {
	public static void main(String[] args) {
		Pepsi pepsico=new Pepsi();
		pepsico.sellCola();
		
		Kali kalimark=new Kali();
		kalimark.sellCola();
	}
}
interface Cola{
	public void makeCola();
}

class Pepsi{
	public void sellCola() {
//	like Doctor doctor 'or' HomeoPathyMedicalCollege homeoDoctor -both we can use,simolarly here we can use both Cola cc 'or' CampaCola cc
//	Cola cc=new Kali().thief();//new Kali().thief(); will return 'new CampaCola();' object
//	cc.makeCola();
//	System.out.println("Pepsi fills up pepsi bottle and sell it...");
	}
	
}
class Kali{
	private void makeKaliCola() {
		System.out.println("Cola is made by campacola...");
	}
	public void sellCola() {
//		class CampaCola implements Cola{
//			@Override
//			public void makeCola() {
//				System.out.println("Cola is made by campacola...");
//				
//			}
////		}
//		CampaCola cc=new CampaCola();
//		new Cola() {
//			
//			@Override
//			public void makeCola() {
//				System.out.println("Cola is made by campacola...");
//				
//			}
//		}.makeCola();
//		Cola cola=new Kali()::makeKaliCola;
//		cola.makeCola();
//		
		Cola cola=()->{
			System.out.println("Cola is made by campacola...");
		};
		cola.makeCola();
		System.out.println("Kali fills up bovonto bottle and sell it...");
		}
//	public Cola thief() {
//		return new CampaCola();
//	}
	
	
}