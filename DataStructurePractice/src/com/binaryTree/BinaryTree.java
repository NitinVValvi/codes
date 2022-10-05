package com.binaryTree;

public class BinaryTree {
	Node root;
	public void  addNode(int key, String name)
	{
		Node newNode = new Node(key, name);
		if(root == null)
		{
			root = newNode;
		}
		else
		{
			Node focusNode = root;
			
			Node parent;
			
			while(true)
			{
				parent = focusNode;
				if(key <focusNode.key)
				{
					focusNode = focusNode.leftChild;
					if(focusNode == null)
					{
						parent.leftChild = newNode;
						return;
					}
				}else
				{
					focusNode = focusNode.rightChild;
					if(focusNode==null)
					{
						parent.rightChild = newNode;
						return;
					}
				}
				
			}
			
			
		}
	}
	
	public void preOrderTraverseTree(Node focusNode)
	{
		if(focusNode!= null)
		{
			System.out.println(focusNode);
			
			preOrderTraverseTree(focusNode.leftChild);
			
			preOrderTraverseTree(focusNode.rightChild);
			
		
			
		}
	}
	
	public void inOrderTraverseTree(Node focusNode)
	{
		if(focusNode!= null)
		{
			inOrderTraverseTree(focusNode.leftChild);
			
			System.out.println(focusNode);
			
			inOrderTraverseTree(focusNode.rightChild);
			
		
			
		}
	}
	
	public void postOrderTraverseTree(Node focusNode)
	{
		if(focusNode!= null)
		{
			postOrderTraverseTree(focusNode.leftChild);
			
			postOrderTraverseTree(focusNode.rightChild);
			
			System.out.println(focusNode);
			
		}
	}
	public Node findNode(int key)
	{
		Node focusNode = root;
		while(focusNode.key!= key)
		{
			if(key < focusNode.key)
			{
				focusNode = focusNode.leftChild;
			}
			else
			{
				focusNode = focusNode.rightChild;
			}
			if(focusNode==null)
				return null;
		}
		return focusNode;
	}
	
	/*
	 * Node findinOrderSuccessor(Node focusNode) { if(focusNode == null) return
	 * null; if(focusNode.rightChild != null) { return
	 * getMostLeft(focusNode.rightChild);
	 * 
	 * }
	 * 
	 * Node parent = focusNode.parent; Node child = focusNode ;
	 * 
	 * while(parent.rightChild == child) { if(parent.parent == null) return null;
	 * child = parent; parent = parent.parent; } return parent; } Node
	 * getMostLeft(Node x) { if(x.leftChild == null) { return x; } return
	 * getMostLeft(x.leftChild); }
	 */
	public static void main(String[] args) {
		//Node test = null, succ = null;
		BinaryTree theTree = new BinaryTree();
		
		theTree.addNode(50, "Boss");
		theTree.addNode( 25, "vice pre");
		theTree.addNode(15, "office manager");
		theTree.addNode(30, "secretary");
		theTree.addNode(75, "sales manager");
		theTree.addNode(85, "salesman1");
		theTree.addNode(10, "emp");
		theTree.addNode(8, "emp1");
		System.out.println("inOrder Traverse :");
		// as you will see increasing numbers
		theTree.inOrderTraverseTree(theTree.root);
		
		// as you will see decreasing numbers
		System.out.println("\npreOrder Traverse: ");
		theTree.preOrderTraverseTree(theTree.root);
		
		// post order 
		System.out.println("\npost order traverse:");
		theTree.postOrderTraverseTree(theTree.root);
		
		//find node
		System.out.println("\nFIND NODE:");
		System.out.println(theTree.findNode(30));
	
		/*
		 * //findInorder successor System.out.println("\n inorder successor"); test =
		 * theTree.findNode(15);
		 * 
		 * succ = theTree.findinOrderSuccessor(test); if(succ != null) {
		 * System.out.println("InOrderSuccessor  of "+test.key+ " is " +succ.key); }else
		 * { System.out.println("InOrderSuccessor does not exists"); }
		 */
		
		
	}
}


class Node
{
	public Node parent;
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key , String name)
	{
		this.key = key;
		this.name = name;
	}
	public String toString()
	{
		return name+ " has a key " +key ; 
	}
}
