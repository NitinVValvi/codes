package com.BSTsuccessorsearch;

class Solution 
{
	static class Node
	{
		int key;
		Node left;
		Node right;
		Node parent;
		Node(int key) 
		{
			this.key = key;
			left = null;
			right = null;
			parent = null;
		}
	}
	static class BinarySearchTree
	{
		Node root;
		Node findInOrderSuccessor(Node inputNode)
		{
			if(inputNode == null) return null;
			if(inputNode.right != null)
			{
				return getMostLeft(inputNode.right);
						
			}
			
			Node parent = inputNode.parent; //12
			Node child = inputNode ; //14
			//return 20
			while(parent.right == child)
			{
				if(parent.parent == null)
					return null;
				child = parent;
				parent = parent.parent;
			}
			return parent;
			//if node.right exists
			//i'll need to go down to the right
			//check if left exists
				//if it exists, go all the way left untill null
		
		//i'll need to go up
			// go to parent
			//check which side you came from 
			// if you came from left side return parent
			// if you came from right side, go up again
		}
	
		Node getMostLeft(Node x) 
		{
				if(x.left == null) 
				{
					return x;
				}		
					return 	getMostLeft(x.left);
		}
		//given a binary search tree and a number, insert a new node
		// with the given number in the correct place in the tree
		void insert(int key)
		{
			//1. if the tree is empty, create the root
			if(this.root == null) {
				this.root = new Node(key);
				return;
			}
		
		/*2.otherwise , create the node with the key
		 * and traverse down the tree to find where to
		 * to insert the new node*/
		Node currentNode = this.root;
		Node newNode = new Node(key);
		
		while(currentNode != null)
		{
			if(key<currentNode.key)
			{
				if(currentNode.left == null) {
					currentNode.left = newNode;
					newNode.parent =currentNode;
					break;
					
				}
				else
				{
					currentNode = currentNode.left;
				}
			}else
			{
				if(currentNode.right == null) {
					currentNode.right = newNode;
					newNode.parent = currentNode;
					break;
				}else
				{
					currentNode = currentNode.right;
				}
			}
		}
	}
	//return a reference to a node in the BST  by its key
	// use this method when you need a node to test your 
	//find inorder successormethod on 
	Node getNodeByKey(int key) {
		Node currentNode = this.root;
		while(currentNode != null)
		{
			if (key == currentNode.key)
			{
				return currentNode;
			}
			if(key < currentNode.key)
			{
				currentNode = currentNode.left;
			}
			else
			{
				currentNode = currentNode.right;
			}
		}
		return null;
	}
}
	
//driver program to test findInOrderSuccessor
	public static void main(String[] args) 
	{
		Node test = null, succ = null;
		
		// create a binary search tree
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(20);
		tree.insert(9);
		tree.insert(25);
		tree.insert(5);
		tree.insert(12);
		tree.insert(11);
		tree.insert(14);
		
		//get a reference to the node whose key is 9
		test = tree.getNodeByKey(14);
		
		//find the inordersuccessor of test
		
		succ = tree.findInOrderSuccessor(test);
		
		//print the key of the successor node
		if(succ != null)
		{
			System.out.println("InOrderSuccessor  of "+test.key+ " is " +succ.key);
		}else
		{
			System.out.println("InOrderSuccessor does not exists");
		}
	}
}

	

