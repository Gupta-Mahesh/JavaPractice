package javapractice.intermediate;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the particular location of fibo series value
		
		System.out.println("Enter the value: ");
		Scanner input = new Scanner(System.in);
		
		int value =input.nextInt();
		int prev =0;
		int curr =1;
		int count =2;
		
		System.out.println(prev +"\n"+curr); // Added because two value already assigned
		while (count <=value) {
			int temp =prev + curr;
			prev =curr;
			curr = temp;
			System.out.println(curr);
			count++;
		}
		System.out.println("The value is "+curr);

		input.close();
	}

}
