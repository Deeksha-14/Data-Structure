package misc;

import java.util.Arrays;
import java.util.Scanner;

public class thirdLargestArr {

	public static void main(String[] args) {
		
		// You will be given an array and you need to find the third largest 

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter elements in array : ");
		for(int i = 0 ; i<size; i++ )
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered array is : "+Arrays.toString(arr));
		
		
		Arrays.sort(arr);
		
		
		System.out.println("Sorted array is : "+Arrays.toString(arr));
		
		
		System.out.println("Third largest element is : "+arr[2]);
		
		
		
		
		
		
		
	}

}
