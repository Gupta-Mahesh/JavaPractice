package javapractice.intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2DInput {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		int[][] arr2=new int[3][3];
		System.out.println(arr2.length);
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j]=input.nextInt();
			}
		}
		
		// it will print the obj instead of value
		System.out.println(Arrays.toString(arr2));
		
		//it will also print the obj instead of value
		for (int[] is : arr2) {
			System.out.print(is + " ");
		}
		
		//we have to print for each row
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(Arrays.toString(arr2[i]));
			System.out.print(" ");
		}
		
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
		}
		input.close();
	}

}
