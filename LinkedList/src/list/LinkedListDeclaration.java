package list;

class Ll{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	void addFirst(int data) {
	
		Node NewNode=new Node(data);
		if(head==null) {
			head=NewNode;
			return;
		}
		NewNode.next=head;
		head=NewNode;
	}
	void addLast(int data) {
		
		Node NewNode=new Node(data);
		if(head==null) {
			head=NewNode;
			return;
		}
	  Node temp=head;
	  while(temp.next!=null) {
		  temp=temp.next;
	  }
		temp.next=NewNode;
	}

	void printList() {
		if(head==null) {
			System.out.println("empty list");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" => "+" ");
			temp=temp.next;
		}
		System.out.print("Null");
	}
	void deleteFirst() {
		if(head==null) {
			System.out.println("list empty");
		     return;
		}
		head=head.next;
	}
	void deleteLast() {
		Node temp1,temp2; 
		temp1=head;
		temp2=head.next;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		while(temp2.next!=null) {
			temp2=temp2.next;
			temp1=temp1.next;
		}
		temp1.next=null;
		
		
	}
	
	}
public class LinkedListDeclaration {
	public static void main(String[] args) {
          Ll l=new Ll();
          l.addFirst(333);
          l.addFirst(222);
          l.addLast(555);
         l.addFirst(111);
         // l.deleteFirst();
         l.deleteLast();
          l.printList();
}
}
