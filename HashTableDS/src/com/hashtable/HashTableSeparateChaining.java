package com.hashtable;

class Chaining{
	
	class Node{
		int value;
		Node next;
    	public Node(int value,Node next) {
		this.value=value;
		this.next=next;
     	}
	}
	
	Node a[];
	int size=10;
	public Chaining() {
		a=new Node[size];
	}
	
	public void addValues(int value) {
		int hcode=value%size;
		a[hcode]=new Node(value,a[hcode]);
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(i+" ");
			Node head=a[i];
			while(head!=null) {
				System.out.print(head.value+" ");
				head=head.next;
			}
			System.out.print("null");
			System.out.println();
		}
	}
	
  public boolean delete(int value) {
	 int hcode=value%size;
	 Node head=a[hcode];
	  if(head==null) {
		  return false;
	  }
	    if(head.value==value){
		  a[hcode]=head.next;
		  return true;
	    }
	   
	    Node currNode=head.next;
	    while(currNode!=null) {
	    	if(currNode.value==value) {
	    		head.next=currNode.next;
	    		return true;
	    	}
	    	head=currNode;
	    	currNode=currNode.next;
	    }
	 
	    return false;
	 }
	
  public boolean search(int value) {
		 int hcode=value%size;
		 Node head=a[hcode];
		  if(head==null) {
			  return false;
		  }
		    if(head.value==value){
			  return true;
		    }
		   
		    head=head.next;
		    while(head!=null) {
		    	if(head.value==value) {
		    		return true;
		    	}
		    	head=head.next;
		    }
		 
		    return false;
		 }
		

}
public class HashTableSeparateChaining {
	public static void main(String[] args) {
        Chaining c= new Chaining();
        c.addValues(111);
        c.addValues(112);
        c.addValues(114);
        c.addValues(115);
        c.addValues(111);
        c.addValues(116);
        c.addValues(23);
        c.addValues(33);
        c.addValues(43);
        c.addValues(53);
        c.addValues(63);
        c.addValues(117);
       // c.addValues(78);
        c.addValues(99);
        c.display();
        System.out.println();
        boolean res=c.delete(53);
        System.out.println(res);
        boolean res1=c.search(122);
        System.out.println(res1);


	}
}
