package javapractice.basic;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi= 3.14;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius =input.nextDouble();
		
		double area= pi * radius * radius;
		
		System.out.println("The area of circle is "+ area);
		input.close();
		

	}

}
