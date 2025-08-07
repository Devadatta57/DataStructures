package doublelist;

class DoubleL7{
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
	
     void reverse() {
		if(head==null) {
			System.out.println("empty list");
		    return;
		}
		Node currNode=head;
		Node temp1=null;
		Node temp2=null;
		while(currNode!=null) {
			temp2=new Node(currNode.data,null,null);
			temp2.next=temp1;
			if (temp1 != null) {
			temp1.prev=temp2;
			}
			temp1=temp2;
			
			currNode=currNode.next;
			
		}
		head=temp1;
	}

  
}
public class Reverse {
	public static void main(String[] args) {
      DoubleL7 l=new DoubleL7();
      l.traverse();
      l.addFirst(20);
      l.addFirst(10);
      l.addFirst(3);
      l.addLast(45);
      l.addLast(78);
      l.addLast(78);
      l.traverse();
      System.out.println();
      l.reverse();
      l.traverse();
	}
}
