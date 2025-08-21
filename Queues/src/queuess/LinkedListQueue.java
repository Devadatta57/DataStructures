package queuess;

class LinkedQueue{
	
	class Node{
		int data;
		Node next;
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
	}
	Node front=null;
	Node rear=null;
	int size=0;
	
	public void Insert(int data) {
		Node newNode = new Node(data,null);
		if((front==null) && (rear==null)) {
			front=rear=newNode;
		}
		else {
			rear.next=newNode;
			rear=newNode;
		}
		size++;
	}
	
	public void Delete() {
		if(size==0) {
			System.out.println("empty queue");
			return;
		}
		System.out.println(front.data);
		front=front.next;
		size--;
	}
	
	public void display(){
      if(size==0) {
    	  System.out.println("nothing to display");
    	  return;
      }
      Node temp=front;
      while(temp!=null) {
    	  System.out.print(temp.data+" "+"queue data");
    	  temp=temp.next;
      }
	}
	
}
public class LinkedListQueue {

	public static void main(String[] args) {
	LinkedQueue l = new LinkedQueue();
	l.Insert(12);
	l.Insert(67);
	l.Insert(45);
	l.Delete();
	l.Delete();
	l.Delete();
	l.display();

	}

}
