package com.BinarySearchTree;

class Node1{
	int data;
	Node1 left;
	Node1 right;
	
	public Node1(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BST1{
	Node1 root;
	public  BST1() {
		root=null;
	}
	
	void InsertNode(int data) {
		root=InsertNode(root,data);
	}
	
	Node1 InsertNode(Node1 node,int data) {
		if(node==null) {
			node=new Node1(data);
		}else {
			if(data<node.data) {
				node.left=InsertNode(node.left,data);
			}
			else{
				node.right=InsertNode(node.right, data);
			}
		}
		return node;
	}
	
	public void InOrder(Node1 node) {
		if(node==null) {
			return;
		}
		
		InOrder(node.left);
		System.out.print(node.data+" ");
		InOrder(node.right);
		
	}
}
public class InsertNodeInBst {
	public static void main(String[] args) {
       BST1 b = new BST1();

       b.InsertNode(50);
       b.InsertNode(30);
       b.InsertNode(70);
       b.InsertNode(20);
       b.InsertNode(40);
       b.InsertNode(60);
       b.InsertNode(80);

       b.InOrder(b.root);
       
	}
}
