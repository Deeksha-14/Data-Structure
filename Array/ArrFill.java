package random;

import java.util.Arrays;
//by using inbuilt functions of array class
public class arrFill {

	public static void main(String[] args) {
		int[] arr= {1,2,2,2};
		Arrays.fill(arr, 1, 3, 6);
		
		System.out.println(Arrays.toString(arr));
		
		
		int[] arr2 = {2,2,2,2,2,2};
		Arrays.fill(arr2, 5);
		
		System.out.println(Arrays.toString(arr2));
	}

}