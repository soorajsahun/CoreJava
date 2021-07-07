package hit.day27;

public class GenericsGoodPaintBrush {
	public static void main(String[] args) {
		Paint1 paint=new RedPaint1();
		Powder1 powder=new RosePowder1();
		
		GoodPaintBrush1<Paint1> brush=new GoodPaintBrush1<>();
		GoodPaintBrush1<Powder1> brush1 =new GoodPaintBrush1<>();
		
		brush.setObj(paint);
		brush.getObj().doColor();
		//or
//		Paint1 myPaint=brush.getObj();
//		myPaint.doColor();
		
		brush1.setObj(powder);
		brush1.getObj().doMakeup();
		//or
//		Powder1 myPowder=brush1.getObj();
//		myPowder.doMakeup();
		
		
	}
}
class GoodPaintBrush1<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
}
abstract class Paint1{
	abstract public void doColor();
}
class RedPaint1 extends Paint1{
	@Override
	public void doColor() {
		System.out.println("redpaint applied");
	}
}
class BluePaint1 extends Paint1{
	@Override
	public void doColor() {
		System.out.println("Bluepaint applied");
	}
}
abstract class Powder1{
	abstract public void doMakeup(); 
}
class RosePowder1 extends Powder1 {
	@Override
	public void doMakeup() {
		System.out.println("Rosepowder applied");
	}
}
class WhitePowder1 extends Powder1 {
	@Override
	public void doMakeup() {
		System.out.println("Whitepowder applied");
	}
}
