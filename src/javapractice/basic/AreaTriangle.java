package javapractice.basic;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Base : ");
		double base = input.nextDouble();
		System.out.println("Enter the Height : ");
		double height =input.nextDouble();
		
		double areaOfTriangle= (height * base)/2; 
		System.out.println("The area of triangle is "+areaOfTriangle);
		
		input.close();
	}

}
