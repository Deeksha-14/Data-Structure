package selection;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		
		
		for(int i = 0; i<a.length; i++)
		{
			
			a[i] = sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
		System.out.println("Sorted list : ");
		
		
		for(int i = 0; i<size-1; i++)
		{
			for(int j=i+1; j<size; j++ )
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
//					a[i]=temp;
//					a[i] = a[j];
//					a[j]=temp;
				}
				
			}
		}
		
		System.out.println("Sorted list is : "+Arrays.toString(a));
		
	}

}
