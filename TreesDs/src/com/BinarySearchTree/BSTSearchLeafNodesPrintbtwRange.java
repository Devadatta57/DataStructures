package com.BinarySearchTree;

import java.util.ArrayList;

class Node3{
	int data;
	Node3 left;
	Node3 right;
	
	public Node3(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BST3
{
	Node3 root;
	public BST3() {
		root=null;
	}
	
  public void InOrderTraversal(Node3 node) {
	  if(node==null) {
		  return;
	  }
	 InOrderTraversal(node.left);
	 System.out.print(node.data+" ");
	 InOrderTraversal(node.right);
  }

 
  public Node3 FindInOrderSuccessor(Node3 node) {
	  while(node.left!=null) {
		  node=node.left;
	  }
	  return node;
  }
  
  public Node3 RemoveLeaf(Node3 node) {
	  if(node==null) {
		  return null;
	  }
	  if(node.left== null && node.right==null) {
		  return null;
	  }
		  node.left=RemoveLeaf(node.left);
		  node.right=RemoveLeaf(node.right);
	  return node;
  }
  
  //wrong only one node will be removed becoz in if-else only one node cond executed either for left or right subtree not all
//  public Node3 RemoveLeaf(Node3 node) {
//	    if(node == null) {
//	        return null;   // base case
//	    }
//	    else if(node.left != null) {
//	        node.left = RemoveLeaf(node.left);   // recursive call for left
//	    }
//	    else if(node.right != null) {
//	        node.right = RemoveLeaf(node.right); // recursive call for right
//	    }
//	    else if(node.left == null && node.right == null) {
//	        return null;   // leaf node found → delete it
//	    }
//	    return node;
//	}

  public void PrintInRange(Node3 node,int k1,int k2) {
	  if(node==null) {
		  return;
	  }
	  if(node.data>= k1 && node.data<=k2) {
		 PrintInRange(node.left, k1, k2);
		 System.out.print(node.data+" ");//to maintain inorder
		 PrintInRange(node.right, k1, k2);
	  }else if(node.data<k1) {
		  PrintInRange(node.right, k1, k2);
	  }else {
		  PrintInRange(node.left, k1, k2);
	  }
  }
  
  public void PrintPathFromRoottoLeaf(Node3 node,ArrayList<Integer> path) {
	  if(node==null) {
		  return;
	  }else {
		  path.add(node.data);
		  if(node.left==null && node.right==null) {
			  PrintRtoL(path);
		  }
		  PrintPathFromRoottoLeaf(node.left, path);
		  PrintPathFromRoottoLeaf(node.right, path);
	  }
	  path.remove(path.size()-1);
  }
  
  public void PrintRtoL(ArrayList<Integer> path) {
	  for(int i=0;i<path.size();i++) {
		  System.out.print(path.get(i)+" ");
	  }
	  System.out.print("null");
	  System.out.println();
  }
  
}
public class BSTSearchLeafNodesPrintbtwRange {
	public static void main(String[] args) {
       BST3 b= new BST3();
       b.root=new Node3(50);
       b.root.left=new Node3(30);
       b.root.right=new Node3(60);
       b.root.left.left=new Node3(20);
       b.root.left.right=new Node3(40);
       b.root.right.left=new Node3(55);
       b.root.right.right=new Node3(70);

     // b.InOrderTraversal(b.root);
      System.out.println();
    //  b.RemoveLeaf(b.root);
     // b.PrintInRange(b.root,60,80);
     // b.InOrderTraversal(b.root);
      ArrayList<Integer> path=new ArrayList<Integer>();
      b.PrintPathFromRoottoLeaf(b.root,path);
  
	}
}
