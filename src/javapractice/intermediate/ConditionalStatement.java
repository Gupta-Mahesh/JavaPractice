package javapractice.intermediate;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String arg[]) {
		System.out.println("IF Else IF");
		
		Scanner input =new Scanner(System.in);
		char ch =input.next().charAt(0);
		
			if(ch >='a' && ch <= 'z') {
				System.out.println("The character is Lower case");
			}else if (ch >='A' && ch <= 'Z') {
				System.out.println("The character is Upper case");
			}else {
				System.out.println("The input value is other than alphabets");
			}
			
		input.close();
	}
}
