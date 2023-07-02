package SLL;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("for populating how many numbers you want to insert in linked list : ");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			System.out.println("enter element : ");
			int id=sc.nextInt();
			l1.insert(id);
		}
		
		l1.insert(10);
		l1.insert(12);
		l1.insert(100);
		l1.insert(128);
		System.out.println("size of linked list "+l1.size());
		System.out.println();
		System.out.println("the ll is using normal approach : ");
		l1.display();
		
		System.out.println(" ");
		
		System.out.println("the ll is using recursive approach : ");
		//here getHead function is needed to display using recursive approach, otherwise how will pas the reference of head as specified in the display function using recursive approach
		l1.display(l1.getHead());
		
		
		sc.close();

	}

}
