package hit.day4;//package name

import java.util.Scanner;//importing other class


//Single line comment

/*
 * multiline comment
 * multiline comment
 * 
 */
/**
 * 
 * documenation comment
 * 
 * @author admin
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to JAVA");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=input.next();
		System.out.println("Welcome to JAVA "+name);
		
		input.close();
		}
	
}
