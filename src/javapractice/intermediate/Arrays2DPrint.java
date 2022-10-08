package javapractice.intermediate;

import java.util.Arrays;

public class Arrays2DPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3},
				{5,6},
				{4,7,8,9}
		};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(Arrays.toString(arr[i]));
			System.out.print(" ");
		}
		
		System.out.println();
		for (int[] is : arr) {
			System.out.print(Arrays.toString(is));
		}
	
		

	}

}
