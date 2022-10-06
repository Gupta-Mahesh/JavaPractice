package javapractice.intermediate;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the fruit name: ");
		String fruit=input.next().trim();
		
		switch (fruit) {
		case "Apple": 
			System.out.println("My favorite fruit");
			break;
		case "Orange":
			System.out.println("Rich in vitamin C");
			break;
		default:
			System.out.println("This is out of syllabus");
			//throw new IllegalArgumentException("Unexpected value: " + fruit);
		}
		
		
		//Enhanced switch case // New way to write
		
		System.out.println("");
		String day =input.next().trim();
		
		switch (day) {
			case "Monday" -> System.out.println("First day");
			case "Tuesday" -> System.out.println("Second day");
			case "Wednessday" -> System.out.println("Third day");
			case "Thirsday" -> System.out.println("Fourth day");
			case "Friday" -> System.out.println("Fifth day");
			case "Saturday" -> System.out.println("Sixth day");
			case "Sunday" -> System.out.println("Seventh day");
			default -> System.out.println("Incorrect input");
			//throw new IllegalArgumentException("Unexpected value: " + day);
		}
		
		input.close();

	}

}
