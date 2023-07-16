package Day1;

import java.util.Scanner;
//two arrays are strictly similar
public class TwoArrSame_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of first array : ");
		int size1 = sc.nextInt();

		int[] arr1 = new int[size1];
		
		System.out.println("Enter first array : ");
		for(int i = 0; i< arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
			
		
		

		System.out.println("Enter size of Second array : ");
		int size2 = sc.nextInt();

		int[] arr2 = new int[size2];
		
		System.out.println("Enter Second array : ");
		for(int i = 0; i< arr2.length; i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		//can do it with arrays.sort too
		if(arr1.length == arr2.length)
		{
			for(int i= 0; i<arr1.length; i++)
			{
				if(arr1[i]!= arr2[i])
				{
					System.out.println("Arrays are not similar");
				}else {
					System.out.println("similar arrays");
				}
			}
			
		}else
		{
			System.out.println("arrays size is not similar!!");
		}
		
		

	}

}
