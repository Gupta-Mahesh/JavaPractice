package javapractice.basic;

import java.util.Scanner;

public class VolumePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length : ");
		double length = input.nextDouble();
		System.out.println("Enter the width : ");
		double width = input.nextDouble();
		System.out.println("Enter the height : ");
		double height = input.nextDouble();
		
		double volume = (length * width * height)/3;
		System.out.println("The volume of Pyramid :" +volume);
		
		input.close();
		
	}

}
