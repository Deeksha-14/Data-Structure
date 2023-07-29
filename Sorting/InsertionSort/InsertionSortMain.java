package InsertionSort;

public class InsertionSortMain {

	public static void main(String[] args) {
		int[] arr = {62, 34, 33, 76, 25, 44, 90, 11};
		
		
		System.out.println("Original Array : ");
		PrintArray.printArray(arr);
		
		InsertionSort.insertionSort(arr);
		
		System.out.println("Sorted Array : ");
		PrintArray.printArray(arr);

	}

}
