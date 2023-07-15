package Day1;

import java.util.Arrays;
import java.util.Scanner;

//search an element in an array
public class FindElem_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		//find an element
		
		System.out.println("Enter element to search : ");
		int find = sc.nextInt();
		
		
		
		
		
		
		//can improve it
		for(int i = 0 ; i < size; i++)
		{
			if(find == arr[i])
			{
				System.out.println(" Element is present at index "+i);
			}
		}
		
		
		
		
		
		
	}

}
