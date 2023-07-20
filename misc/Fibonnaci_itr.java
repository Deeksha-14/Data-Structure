package random;

import java.util.Arrays;
import java.util.Scanner;
//fibonacci series using iterative method
public class Fibonnaci_itr {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till which fibonacci series has to be generated : ");
		int n = sc.nextInt();
		int[] f=new int[n];
		
		f[0]=0;
		f[1] = 1;
		
		
		for(int i = 2; i<n; i++)
		{
			f[i] = f[i-1] + f[i-2];
			
		}
		
		Arrays.stream(f).forEach(System.out::println);
	}
}
