package com.Binarytrees;

import java.util.LinkedList;
import java.util.Queue;

class Nodep{
	int data;
	Nodep left;
	Nodep right;
	public Nodep(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BTT {
	Nodep root;
	public BTT() {
		root=null;
	}
	
	public void LevelTraversal(Nodep root) {
	if(root==null){
		return;
	}
	Queue<Nodep> q= new LinkedList<Nodep>();
		q.add(root);
		q.add(null);
		while(q.isEmpty()!=true) {
			Nodep currNode=q.remove();
			if(currNode!=null) {
				System.out.print(currNode.data+" ");
				if(currNode.left!=null) {
				  q.add(currNode.left);
				}
				if(currNode.right!=null) {
				  q.add(currNode.right);
				}
			}
			else {
				System.out.println();
				if(!q.isEmpty())
				q.add(null);
			}
		}
		
	}
	
	public int CountNodes(Nodep root) {
		if(root==null) { 
			return 0;
		}
		int ln=CountNodes(root.left);
		int rn=CountNodes(root.right);
		return ln+rn+1;
	}
	
	public int heightofNodes(Nodep root) {
		if(root==null) {
			return 0;
		}
		int ln=CountNodes(root.left);
		int rn=CountNodes(root.right);
		return Math.max(ln,rn)+1;
	}
	
	public int sumOfNodes(Nodep root) {
		if(root==null) {
			return 0;
		}
		int ln=sumOfNodes(root.left);
		int rn=sumOfNodes(root.right);
		return ln+rn+root.data;
	}
}
public class LevelNodeTraversalCountHtSum {
	public static void main(String[] args) {
      BTT t= new BTT();
      t.root= new Nodep(1);
      t.root.left=new Nodep(2);
      t.root.right= new Nodep(3);
      t.root.left.left=new Nodep(4);
      t.root.left.right=new Nodep(5);
      //t.LevelTraversal(t.root);
//      int res1=t.CountNodes(t.root);
//      System.out.println(res1);
//      int res2=t.heightofNodes(t.root);
//      System.out.println(res2);
      int res3=t.sumOfNodes(t.root);
      System.out.println(res3);
	}
}
