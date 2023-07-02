package SLL;

public class LinkedList {

	private Node head;

	public boolean insert(int data) { // creating the node
	
		Node n1 = new Node(data);
		System.out.println(n1);
		// checking if the node is created or not
		if (n1 == null) {
			return false;
		}

		// if linked list is empty or not
		if (head == null) 
		{
			head = n1;
			return true;
		}

		// linked list is not empty so locate the last node
		Node last = head; // not a new node. when it representing the same memory location as head. it
							// basically becomes the first node and so on. hence when it becomes the last
							// node setting its next to n1 will make n1 a part of it.
		if (last.getNext() != null) {
			last = last.getNext();

		}

		// copy last
		last.setNext(n1);

		return true;
	}
	
	//not working as expected
	//method to print the size of linked List
	public int size()
	{
		Node temp = head;
		int length=1; //0
		if(temp==null)
		{
			return 0;
		}
		while(temp.getNext() != null)
		{
			length++;
			temp = temp.getNext();
		}
		return length;
		
	}

	// normal method to display the values of linked list
	public  void display() {
		Node temp = head;
		while (temp != null) 
		{
			//while
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		System.out.println();

	}
	
	
	//recursive function to display the values of linked list
	public void display(Node head)
	{
		//base condition
		if(head == null)
		{
			return;
		}
		
		
		System.out.println(head.getData()+" ");
		head = head.getNext();
	}

	//write getter for head as we need it in the tester for using this function
	public Node getHead() {
		return head;
	}
	
	
	
	
	
	
	
	
	
	
	//display the reverse
	//reverse the linked list

}