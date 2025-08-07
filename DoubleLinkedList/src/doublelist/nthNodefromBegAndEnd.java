package doublelist;

import java.util.Currency;
import java.util.spi.CurrencyNameProvider;

class DoubleL6{
	Node head;
	int size=0;
	class Node{
		int data;
		Node prev=null;
		Node next=null;
		Node(int data, Node prev,Node next){
			this.data=data;
			this.prev=prev;
			this.next=next;
			size++;
		}	
	}
	
	void traverse() {
		if(head==null) {
			System.out.println("empty list");
			return;
		}
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.print("null");
	}
	
	void addFirst(int data) {
		Node newNode;
		if(size==0){
		  newNode = new Node(data,null,null);
		  head=newNode;
		}
		else {
			  newNode = new Node(data,null,null);
              head.prev=newNode;
              newNode.next=head;
              head=newNode;
		}
		
	}
	void addLast(int data) {
		Node newNode;
		Node currNode=head;
		if(size==0) {
			newNode = new Node(data, null, null);
			head=newNode;
		}
		else {
		 	newNode = new Node(data , null, null);
			while(currNode.next!=null) {
		      currNode=currNode.next;		
			}
			currNode.next=newNode;
			newNode.prev=currNode;
	}
	    	
		}
	
	int nthNodefromBeg(int n) {
		if(n<0 || n>size) {
			System.out.println("out of range");
		}
		int count=1;
		Node currNode=head;
		Node tempNode=null;
		
		while(currNode!=null && count<n) {
			if(currNode.next!=null) {
			currNode=currNode.next;
			}
			count++;
		}
		
		return currNode.data;
	}

	int nthNodefromEnd(int n) {
		n=size-n+1;
	  return nthNodefromBeg(n);
   }
} 
public class nthNodefromBegAndEnd {
	public static void main(String[] args) {
      DoubleL6 l=new DoubleL6();
      l.traverse();
      l.addFirst(20);
      l.addFirst(10);
      l.addFirst(3);
      l.addLast(45);
      l.addLast(78);
      l.traverse();
      System.out.println();
     // int data=l.nthNodefromBeg(6);
      int data=l.nthNodefromEnd(7) ;
      System.out.println(data);
	}
}
