package javapractice.intermediate;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = input.nextInt();
		
		//Best practice ==>> For loop use when loop timing is fixed.
		
		for (int i = 0; i <=a; i++) {
			System.out.println(i);
		}
		System.out.println("Thanks Bye! For loop");
		System.out.println("\n\n");
		
		
		// Best Practice ==> While loop use when we don't know loop time or when we quite
		
		System.out.println("Can we continue.. Y/N : ");
		char b = input.next().trim().charAt(0);
		if (b =='Y' || b== 'y') {
			System.out.println("Enter the name :");
			String name = input.next();
	
			while (true) {
				System.out.println("Hello! " +name);
				System.out.println("\n\n\n\n");
				
		
				System.out.println("Hey! "+ name +" Press Q to quite or press any key: ");
				char quite = input.next().trim().charAt(0);
				if (quite=='q' || quite=='Q')
					break;
			}
		}
		System.out.println("Thanks Bye! While loop");
		input.close();

	}

}
