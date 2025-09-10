package com.BinarySearchTree;

class Node2{
	int data;
	Node2 left;
	Node2 right;
	
	public Node2(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BST2{
	Node2 root;
	public BST2() {
		root=null;
	}
	
  public void InOrderTraversal(Node2 node) {
	  if(node==null) {
		  return;
	  }
	 InOrderTraversal(node.left);
	 System.out.print(node.data+" ");
	 InOrderTraversal(node.right);
  }

  public boolean Search(Node2 node,int value) {
	  Node2 currNode=node;
	  while(currNode!=null) {
		  if(currNode.data==value) {
			  return true;
		  }
		  else if(value<currNode.data) {
			  currNode=currNode.left;
		  }
		  else {
			  currNode=currNode.right;
		  }
	  }
	  return false;
  }
  
  public int findMax(Node2 node) {
	  Node2 currNode=node;
	  while(currNode.right!=null) {
		  currNode=currNode.right;
	  }
	  return currNode.data;
  }
  
  public int findMin(Node2 node) {
	  Node2 currNode=node;
	  while(currNode.left!=null) {
		  currNode=currNode.left;
	  }
	  return currNode.data;
  }
	
  public boolean isBinarySearchTree(Node2 node) {
	  if(node==null) {
		  return true;
	  }
	  if((node.left!=null) && (findMax(node.left)>node.data))
		  return false;
	  else if((node.right!=null) &&(findMin(node.right)<node.data))
		  return false;
	  return isBinarySearchTree(node.left) && isBinarySearchTree(node.right);
  }
  
  
  public Node2 deleteNode(Node2 node,int value) {
	  if(value>node.data) {
		  node.right=deleteNode(node.right,value);
	  }
	  else if(value<node.data) {
		  node.left=deleteNode(node.left,value);
	  }
	  else {
		  //no child to deletion node
		  if(node.left==null && node.right==null) {
			  return null;
		  }
		  //only one right child to deletion node
		  else if(node.left==null) {
			  return node.right;
		  }
		  //only one left child to deletion node
		  else if(node.right==null) {
			  return node.left;
		  }
		  //two childs to deletion node
		  else {
			  Node2 is=FindInOrderSuccessor(node.right);
			  node.data=is.data;//copying rightdata to rootnode(overriding data in rootnode to be deleted havaing two children)
			  //now deleting right node
			  node.right=deleteNode(node.right,is.data);
			  
		  }
	  }
	  return node;
  }
  
  
  public Node2 FindInOrderSuccessor(Node2 node) {
	  while(node.left!=null) {
		  node=node.left;
	  }
	  return node;
  }
  
}
public class BSTSearchDeleteMinMax {
	public static void main(String[] args) {
       BST2 b= new BST2();
       b.root=new Node2(50);
       b.root.left=new Node2(30);
       b.root.right=new Node2(70);
       b.root.left.left=new Node2(20);
       b.root.left.right=new Node2(40);
       b.root.right.left=new Node2(60);
      // b.root.right.right=new Node2(90);

      b.InOrderTraversal(b.root);
//
//      boolean res= b.Search(b.root,90);
//      System.out.println(res);
//      int min=b.findMin(b.root);
//      System.out.println(min+" min");
//      
//      int max=b.findMax(b.root);
//      System.out.println(max+" max");
      
       boolean s= b.isBinarySearchTree(b.root);
       System.out.println(s);
       b.deleteNode(b.root,50);
       b.InOrderTraversal(b.root);

  
	}
}
