package hit.day28;
//initially to create constants, interface were used but later on jdk5 introduced enum to create constants
public class EnumDemo {
	public static void main(String[] args) {
		//interface
		System.out.println(MyContants.pi);
		
		switch((int)MyContants.pi) {
		case 3:{
			System.out.println("Pi value is 3.14");
			break;
		}
		}
		
		//enum
		MyContantsEnum v=MyContantsEnum.apple;
		System.out.println(v);
		
		for(MyContantsEnum mc:MyContantsEnum.values()) {
			System.out.println(mc);
		}
		met(v);
		
		//enum2
		MyContantsEnum2 v2=MyContantsEnum2.pi;
		System.out.println(v2+" and value is "+v2.getValue());
		
	}
	public static void met(MyContantsEnum mce) {
		switch(mce) {
		case apple:{
			System.out.println("The enum is apple.....");
			break;
		}
		case orange:{
			System.out.println("The enum is orange.....");
			break;
		}
		case mango:{
			System.out.println("The enum is mango.....");
			break;
		}
		}
	}
}
interface MyContants{
	public static final float pi=3.14f;
	public static final float tan30=1.2f;
	public static final String e="mc^2";
}
enum MyContantsEnum{
	apple,orange,mango;
}
enum MyContantsEnum2{
	pi(3.14f),tan30(1.2f);
	float value;
	private MyContantsEnum2(float value) {
		this.value=value;
	}
	public float getValue() {
		return this.value;
	}
}