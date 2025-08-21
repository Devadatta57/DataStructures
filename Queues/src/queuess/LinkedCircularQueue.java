package queuess;

class LinkedCir{
	
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
		if(front==null) {
		   front=newNode;
	    }
		else {
	      rear.next=newNode;      	 
	    }
		rear=newNode;
		rear.next=front;
		size++;
		
	}
	
	
	public void delete() {
	  if(size==0){
		  System.out.println("empty list");
          return;
	  }
	  else if(front==rear) {
		  System.out.println(front.data);
		  front=rear=null;
		  size--;
		  return;
	  }else {
		  System.out.println(front.data);
          front=front.next;
          size--;
	  }
	  
	}
		
	public void display() {
		if(size==0) {
			System.out.println("empty list");
			return;
		}
		Node temp=front;
		while(temp.next!=front) {
			System.out.print(temp.data+" ");
		       temp=temp.next;
		}
		System.out.print(temp.data);
	}
}
public class LinkedCircularQueue {

	public static void main(String[] args) {
		LinkedCir l = new LinkedCir();
		l.Insert(23);
		l.Insert(11);
		l.Insert(33);
		l.Insert(88);
		
		l.display();
         System.out.println();
		
		l.delete();
		l.delete();
		l.delete();
		l.delete();
		l.delete();

	}

}
