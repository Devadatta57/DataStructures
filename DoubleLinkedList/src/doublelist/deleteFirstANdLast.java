package doublelist;

class DoubleL4{
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
	
	void deleteFirst() {
		if(head==null) {
			System.out.println("empty list");
			return;
		}
		head=head.next;
		size--;
		if(head!=null) {
			head.prev=null;
		}
		
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
}
public class deleteFirstANdLast {
	public static void main(String[] args) {
      DoubleL4 l=new DoubleL4();
      l.traverse();
      l.addFirst(20);
//      l.addFirst(10);
//     l.addFirst(3);
//      l.addLast(45);
//      l.addLast(78);
      l.traverse();
      System.out.println();
     // l.deleteFirst();
      l.deleteLast();
      l.traverse();
      System.out.println();
	}
}
