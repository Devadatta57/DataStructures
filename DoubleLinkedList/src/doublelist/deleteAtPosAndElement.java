package doublelist;

import java.util.Currency;

import doublelist.DoubleL4.Node;

class DoubleL5{
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
		  size++;
		}
		else {
			  newNode = new Node(data,null,null);
              head.prev=newNode;
              newNode.next=head;
              head=newNode;
              size++;
		}
		
	}
	void addLast(int data) {
		Node newNode;
		Node currNode=head;
		if(size==0) {
			newNode = new Node(data, null, null);
			head=newNode;
			size++;
		}
		else {
		 	newNode = new Node(data , null, null);
			while(currNode.next!=null) {
		      currNode=currNode.next;		
			}
			currNode.next=newNode;
			newNode.prev=currNode;
			size++;
	}
	    	
		}
	
	void deleteFirst() {
		if(head==null) {
			System.out.println("empty list");
			return;
		}
		head=head.next;
		
		if(head!=null) {
		head.prev=null;
		}
		size--;
	}
	
	void deleteLast() {
		if(head==null) {
			System.out.println("empty list");
			return;
		}
		if(head.next==null) {
			head=null;
			size--;
			return;
		}
		Node currNode=head;
		Node temp=null;
		while(currNode.next!=null) {
			temp=currNode;
			currNode=currNode.next;
		}
		temp.next=null;
		size--;
	}
	
	void deleteAtPos(int pos) {
		if(head==null) {
			System.out.println("empty list");
			return;
		}
		if(pos<0 || pos>=getSize()) {
			System.out.println("out of range");
			return;
		}
		if(pos!=0) {
			int count=0;
			Node currNode=head;
			Node tempNode=null;
			while(currNode.next!=null && count<pos) {
				tempNode=currNode;
				currNode=currNode.next;
				count++;
			}
			if(currNode.next!=null) {
			tempNode.next=currNode.next;
			currNode.next.prev=tempNode;
			size--;
			}else {
				deleteLast();
			}
		}else{
			deleteFirst();
			return;
		}

	}
	
	
	void delete(int data) {
		Node currNode=head;
		Node temp=null;
		if(head==null) {
			System.out.println("empty");
			return;
		}
		if(currNode.data==data) {
			head=head.next;
			return;
		}
		while(currNode!=null) {
			if(currNode.data==data && currNode.next!=null) {
				temp.next=currNode.next;
				currNode.next.prev=temp;
			}
			else {
				if (currNode.data==data && currNode.next==null) {
					deleteLast();
				}
			}
			temp=currNode;
			currNode=currNode.next;

		}
	}
		
		
		
	
	public int getSize() {
		return size;
	}
	
	
}
public class deleteAtPosAndElement {
	public static void main(String[] args) {
      DoubleL5 l=new DoubleL5();
      l.traverse();
      l.addFirst(20);
     l.addFirst(10);
     l.addLast(78);
    l.addFirst(3);
     l.addLast(45);
     l.addLast(78);
      l.traverse();
      System.out.println();
     // l.deleteFirst();
     // l.deleteAtPos(4);
      l.delete(78);
      l.traverse();
      System.out.println();
	}
}
