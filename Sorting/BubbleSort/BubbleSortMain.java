package Sorting;

import java.util.Arrays;


public class BubbleSortMain {

	public static void main(String[] args) {
		int[] arr= {64, 34, 56, 12, 33, 90, 11};
		
		System.out.println("original array :"+Arrays.toString(arr));
		BubbleSort.bubbleSort(arr);
		System.out.println("Sorted Array : "+Arrays.toString(arr));
	}

}
