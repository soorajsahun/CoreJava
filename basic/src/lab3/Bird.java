package lab3;

public class Bird {
public Bird() {
	System.out.println("This is Parrot");
}
public Bird(String s1) {
	System.out.println("This is "+s1);
}
public Bird(int age,String s2) {
	System.out.println("This is "+age+" years old "+s2);
}
public static void main(String[] args) {
	Bird b1=new Bird();
	Bird b2=new Bird("Crow");
	Bird b3=new Bird(10,"Eagle");
}
}
