package cll;

public class CircularLinkedList {

	
	
	
	private Node head;
	
	
	public void insertAtBeginning(int data)
	{
		Node nn = new Node(data);
		if(head == null)
		{
			head = nn;
			head.setNext(head);
		}
		else {
			Node temp = head;
			while(temp.getNext()!= head)
			{
				temp = temp.getNext();
			}
			
			nn.setNext(head);
			head=nn;
			temp.setNext(head);
		}
		
		
	}
}
