package HeapSort;

public class HeapSortMain {

	public static void main(String[] args) {

		int[] arr = { 64, 34, 25, 12, 33, 90, 62, 11 };
		System.out.println("Original Array :");
		PrintArray.printArray(arr);

		HeapSort heapSort = new HeapSort();
		heapSort.heapSort(arr);
		System.out.println("\nSorted Array : ");
		PrintArray.printArray(arr);
	}

}
