package Sorting;

public class BubbleSort {

	public static void bubbleSort(int[] arr)
	{
		if(arr == null || arr.length<=1)
		{
			return; //base case if array is empty or has only one element, it is already sorted
		}
		
		
		int n = arr.length;
		
		for(int i =0; i<n-i-1; i++)
		{
			
			boolean swap = false; //flag to check if there were any swap happend in thi pass
			
			for(int j = 0; j<n-i-1; j++)
			{
				//compare adjacent elements and swap if they are in wrong order 
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					swap = true;
				}
			}
			if(!swap)
			{//if no elements were swapped in this pass, the array is already sorted and we can break out of the loop
				break;
			}
			
		}
		
		
		
	}

}
