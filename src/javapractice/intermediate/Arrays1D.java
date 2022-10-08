package javapractice.intermediate;

import java.util.Scanner;

public class Arrays1D {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		int[] number =new int[5];
		System.out.println("Enter the array value: ");
		for (int i = 0; i < number.length; i++) {
			number[i]=input.nextInt();
		}
		printArray(number);
		
		String[] str= new String[5];
		System.out.println("\n Enter the string value: ");
		for (int i = 0; i < number.length; i++) {
			str[i]=input.next();
		}
		printArrayString(str);
		
		input.close();
	}
	
	static void printArray(int[] a) {
		System.out.println("The values are: ");
		for (int i : a) {
			System.out.print(i +" ");
		}
	}

	static void printArrayString(String[] a) {
		System.out.println("The string values are:");
		for (String string : a) {
			System.out.print(string + " ");
		}
	}
}
