package misc;

import java.util.Scanner;

public class AddArrayElement {

	public static void main(String[] args) {
	
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		
		for(int i = 0 ; i< arr.length; i++)
		{
			System.out.println("Enter element at "+i+"th index in Array : ");
			arr[i]=sc.nextInt();
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of array is : "+sum);
		
		

	}

}
