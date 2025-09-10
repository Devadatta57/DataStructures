package com.Binarytrees;

import java.util.LinkedList;
import java.util.Queue;

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

class BTT1 {
	Node1 root;
	public BTT1() {
		root=null;
	}
	
	public static boolean isEqual(Node1 root1,Node1 root2) {
		if(root1==null && root2==null) {
			return true;
		}
		else if(root1==null || root2==null) {
			return false;
		}
		else {
			return isEqual(root1.left,root2.left) && isEqual(root1.right,root2.right) && root1.data==root2.data;
		}
	}
	
}
public class CheckingTwoTreesData {
	public static void main(String[] args) {
      BTT1 t= new BTT1();
      t.root= new Node1(1);
      t.root.left=new Node1(2);
      t.root.right= new Node1(9);
      t.root.left.left=new Node1(4);
      t.root.left.right=new Node1(5);
      
      
      BTT1 t1= new BTT1();
      t1.root= new Node1(1);
      t1.root.left=new Node1(2);
      t1.root.right= new Node1(3);
      t1.root.left.left=new Node1(4);
      t1.root.left.right=new Node1(5);
      
        boolean res=BTT1.isEqual(t.root,t1.root);
        System.out.println(res);
        
	}
}
