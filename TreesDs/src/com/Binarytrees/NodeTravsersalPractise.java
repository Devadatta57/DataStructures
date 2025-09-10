package com.Binarytrees;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
class BinaryTreee{
	Node root;
	public BinaryTreee() {
	  root= null;
	}
	
	public void Inorder(Node node) {
		if(node==null)
			return;
		Inorder(node.left);
		System.out.print(node.data+" ");
		Inorder(node.right);
	}
	
	public void preOrder(Node node) {
		if(node==null)
			return;
		System.out.print(node.data+" ");
		Inorder(node.left);
		Inorder(node.right);
	}
	public void PostOrder(Node node) {
		if(node==null)
			return;
		Inorder(node.left);
		Inorder(node.right);
		System.out.print(node.data+" ");
	}
}
public class NodeTravsersalPractise {
	public static void main(String[] args) {
       BinaryTreee t= new BinaryTreee();
       t.root=new Node(1);
       t.root.left=new Node(2);
       t.root.right= new Node(3);
       t.Inorder(t.root);
       System.out.println();
       t.preOrder(t.root);
	   System.out.println();
	   t.PostOrder(t.root);


       
	}
}
