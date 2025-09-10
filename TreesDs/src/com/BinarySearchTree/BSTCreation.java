package com.BinarySearchTree;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BST{
	Node root;
	public BST() {
		root=null;
	}
	
	public  Node BSTCreation(int[] nodes,int start,int end) {
		Node node=null;
		if(start>end) {
			return null;
		}
		else {
			int mid=(start+end)/2;
			node= new Node(nodes[mid]);
		    node.left=BSTCreation(nodes, start,mid-1);
			node.right=BSTCreation(nodes, mid+1,end);
			return node;
		}
	}

	
}
public class BSTCreation {
	public static void main(String[] args) {
       BST b= new BST();
       int[] nodes= {1,2,3,4,5,6,7,8,9,10};
       Node root=b.BSTCreation(nodes,0,nodes.length-1);
       System.out.println(root.right.left.right.data);
	}
}
