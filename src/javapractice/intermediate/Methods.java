package javapractice.intermediate;

import java.util.Scanner;

public class Methods {

	// Basic method for printing multiple time message
	// Here void means this method will not return any value
	// Static means we can call this method without creating object.
	static void message() {
		System.out.println("Hello World!");
	}
	
	// here return type is integer so this method should return some int value. 
	//this method will return a+b value.
	static int messageInteger() {
		int a=12;
		int b=10;
		return a+b;
	}
	
	// Using String return type.
	// Greeting will return
	static String messagePrint() {
		return "Good morning Guys!";
	}
	
	// Parameterized method with integer return call
	static int sum(int a, int b) {
		return a+b;
	}
	
	// Parameterized method with String Call.
	
	static String greeting(String wish) {
		return wish;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If we want to use same operations multiple time we use methods.
		message();
		message();
		
		//Integer method value will return
		messageInteger();
		
		//String return type
		messagePrint();
		
		//Enter the value of a and b in method.
		System.out.println(sum(25, 60));
		
		//Take value from user by using Scanner class
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value for sum : ");
		System.out.println(sum(input.nextInt(),input.nextInt()));
		
		// Taking greeting from user
		System.out.println("Enter the greeting message : \n");
		input.nextLine(); // called this method because system.in was unable to read value for String
		System.out.println("Hello Guys and "+ greeting(input.nextLine()));
		System.out.println("Bye");
		input.close();
	}
	

}
