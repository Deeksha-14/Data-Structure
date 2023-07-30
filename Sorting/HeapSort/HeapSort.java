package HeapSort;

public class HeapSort {
	
	public void heapSort(int[] arr) {
		
		int n = arr.length;
		
		
		//building a max heap
		for(int i = n/2-1; i>=0; i--)
		{
			heapify(arr, n, i);
			
		}
		
		
		//extracting elements from the heap one by one and placing them in their correct positions
		for(int i = n-1; i>0; i--)
		{
			//swapping root with last element
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			
			//max heapifying the reduced heap
			heapify(arr, i, 0);
		}
		
	}
	
	
	public void heapify(int[] arr, int n, int i) {
		int largest = i; // assuming largest element is root
		int left = 2 * i + 1; // left child
		int right = 2 * i + 2; // right child
		
		//checking if left child is larger than root
		if(left < n && arr[left]>arr[largest])
		{
			largest = left;
		}
		
		//checking if the right child is larger than the root
		if(right < n && arr[right] > arr[largest])
		{
			largest = right;
		}
		
		//if the largest element is not root, then swapping and recursively heapify the affected tree

		if(largest != i)
		{
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
	}

}
