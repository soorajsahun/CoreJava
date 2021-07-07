package hit.day27;
//In this problem We have created GoodPaintBrush into Generic PaintBrush but we got stuck as if-else problem came back again
//Solution=>To solve this if-else problem ,we have a topic called GENERICS introduced in JDK 1.5
//GENERICS is available with COLLECTIONS
public class GenericsDemo {
	public static void main(String[] args) {
		Paint paint=new RedPaint();
		Powder powder=new RosePowder();
		
		GoodPaintBrush brush=new GoodPaintBrush();
		
		brush.obj=powder;
		brush.execute();
		
	}
}
abstract class Paint{
	public abstract void color();
}
class RedPaint extends Paint{
	@Override
	public void color() {
		System.out.println("red colour...");
	}
}
class BluePaint extends Paint{
	@Override
	public void color() {
		System.out.println("blue colour...");
	}
}
abstract class Powder{
	public abstract void doMakeup();
}
class WhitePowder extends Powder{
	@Override
	public void doMakeup() {
		System.out.println("applying powder....");
	}
}
class RosePowder extends Powder{
	@Override
	public void doMakeup() {
		System.out.println("rose powder applied..");
	}
}
class GoodPaintBrush{// I have made my paint brush generic
	Object obj; // by declaring a object reference u can consume any object
	public void execute() {
		if(obj instanceof Paint) {
			Paint paint=(Paint)obj;
			paint.color();
		}
		if(obj instanceof Powder) {
			Powder makeup=(Powder)obj;
			makeup.doMakeup();
		}
	}
}

class BadPaintBrush2{// this paintbrush was specific
	Paint paint; // by declaring a specific type, you can consume only an object of that type - because java is a strongly typed language...
	public void doPaint() {
		System.out.println(paint);
	}
}
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			RedPaint rp=new RedPaint();
			System.out.println("red paint...."+rp);
		}
		else if(i==2) {
			BluePaint bp=new BluePaint();
			System.out.println("blue paint...:"+bp);
		}
	}
}