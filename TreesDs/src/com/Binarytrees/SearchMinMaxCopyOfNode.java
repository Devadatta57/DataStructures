package com.Binarytrees;

import java.util.LinkedList;
import java.util.Queue;

class Nodet{
	int data;
	Nodet left;
	Nodet right;
	public Nodet(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BTTt {
	Nodet root;
	public BTTt() {
		root=null;
	}
	
	public boolean Search(Nodet root,int data) {
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}
		else if(Search(root.left, data)) {
			return true;
		}
		else if(Search(root.right, data)) {
			return true;
		}
		return false;
	}
	
	public int Max(Nodet root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int left=Max(root.left);
		int right=Max(root.right);
		return Math.max(root.data,Math.max(left, right));
		
	}
	
	public int Min(Nodet root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int left=Min(root.left);
		int right=Min(root.right);
		return Math.min(root.data,Math.min(left, right));
		
	}
	
	public void LevelTraversal(Nodet root) {
		if(root==null){
			return;
		}
		Queue<Nodet> q= new LinkedList<Nodet>();
			q.add(root);
			q.add(null);
			while(q.isEmpty()!=true) {
				Nodet currNode=q.remove();
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
	
	public Nodet Copy(Nodet root) {
		if(root!=null) {
			Nodet temp=new Nodet(root.data);
			temp.left=Copy(root.left);
			temp.right=Copy(root.right);
			return temp;
		    }
		else 
		   return null;
	}
	
	
}
public class SearchMinMaxCopyOfNode {
	public static void main(String[] args) {
      BTTt t= new BTTt();
      t.root= new Nodet(1);
      t.root.left=new Nodet(2);
      t.root.right= new Nodet(3);
      t.root.left.left=new Nodet(4);
      t.root.left.right=new Nodet(7);
      
      t.LevelTraversal(t.root);
     
      
      Nodet r= t.Copy(t.root);
      t.LevelTraversal(r);
      
//      boolean res1=t.Search(t.root,7);
//      System.out.println(res1);
//      
//      int res3=t.Min(t.root);
//      System.out.println(res3);

	}
}
