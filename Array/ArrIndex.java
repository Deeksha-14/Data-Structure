package misc;

import java.util.Scanner;

public class ArrIndex {

	public static void main(String[] args) {
		System.out.println("Enter array size of array  : ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("enter array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("your array is : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("Enter the number to find index : ");
		int m = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == m) {
				System.out.println("element is present at : " + i);
			}
		}
		sc.close();
	}

}
