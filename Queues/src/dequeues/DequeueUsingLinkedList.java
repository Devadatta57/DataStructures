package dequeues;


class DequeueLinkedList{
	
	class Node{
		int data;
		Node next;
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
	}
	
	Node front=null,rear=null;
	int size=0;
	
	public void InsertAtFront(int data) {
		Node newNode = new Node(data,null);
		if(front==null) {
			front=rear=newNode;
			size++;
			return;
		}
		
		newNode.next=front;
		front=newNode;
		size++;
	}
	
	public void InsertAtRear(int data) {
		Node newNode = new Node(data,null);
		
		if(front==null) {
			front=rear=newNode;
			size++;
			return;
		}
		
		rear.next=newNode;
		rear=newNode;
		size++;
		
	}
	
	public void deleteAtFront() {
		if(front==null) {
			System.out.println("empty queue");
			return;
		}
		System.out.println(front.data);
		if(front==rear) {
			front=rear=null;
			size--;
		}
		else {
		   front=front.next;
		   size--;
		}
		
	}
	
	public void deleteAtRear() {
		if(front==null) {
			System.out.println("empty queue");
			return;
		}
		System.out.println(rear.data);
		if(front==rear) {
			front=rear=null;
			size--;
		}
		else {
		Node temp=front;
		while(temp.next!=rear) {
			temp=temp.next;
		}
//		temp=rear;//wrong temp is local local var wont affect linkedlist so use rear var
//		temp.next=null;
		
		rear=temp;
		rear.next=null;
		size--;
		}
		
	}
	
	public void display() {
		if(front==null) {
			System.out.println("empty queue");
			return;
		}
		Node temp=front;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("size is:"+size);
	}
}
public class DequeueUsingLinkedList {
	public static void main(String[] args) {
	   DequeueLinkedList d= new DequeueLinkedList();
	   d.InsertAtFront(111);
	   d.InsertAtFront(12);
	   d.InsertAtFront(78);
	   
	   d.InsertAtRear(67);
	   d.InsertAtRear(90);
	   
	   d.deleteAtFront();
	   d.deleteAtRear();
	   d.display();

	}
}
