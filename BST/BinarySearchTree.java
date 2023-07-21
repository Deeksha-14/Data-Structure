package BST;

public class BinarySearchTree {
	
	private Node root;

	
	
	//root will be null in the starting because there will be no element in the tree at the starting
	public BinarySearchTree() {
		super();
		this.root = null;
	}
	
	
	public boolean insert(int data)
	{
		//creating the new node
		Node node = new Node(data);
		
		//checking if creation of new node is successful or not
		if(node == null) //it will be (node == null) because the node will have both data and left right pointer both will be null although 
		{
			return false;
		}
		
		//check if there are data in tree or not
		if(root == null)
		{
			root = node;
			return true;
		}
		
		
		Node temp = root;
		while(true)
		{
			//if the data is present at the root itself
			if(data == temp.getData())
			{
				return false;
			}
			
			//check whether to store in left sub tree or right subtree
			if(data < temp.getData())
			{
				//go to left subtree
				if(temp.getLeft() == null)
				{
					temp.setLeft(node);
					return true;
				}
				temp = temp.getLeft();
				
			}else {
				
				//go to right subtree
				if(temp.getRight() == null)
				{
					temp.setRight(node);
					return true;	
				}
					
				temp = temp.getRight();
			}
			
			
		}
		
		
	}
	
	
	
	public boolean preOrder()
	{
		
		
		
		
		
		return true;
	}
	
	
	
	

}
