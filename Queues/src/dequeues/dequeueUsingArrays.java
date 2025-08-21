package dequeues;


class DequeArray{
	int size=0;
	int[] DQ;
	
	class Node{
		int data;
		Node next;
	   Node(int data,Node next){
		this.data=data;
		this.next=next;
	   }
	}
	
	public DequeArray() {
		DQ = new int[size];
	}
	
	int front=-1;
	int rear=-1;
	
	public void InserAtFront(int data) {
		if((front==(rear+1)%size)) {
			System.out.println("queue is full");
			return;
		}
		else if(front==-1){
			front=rear=0;
		}
		else if(front==0) {
			front=size-1;
		}else {
			front=front-1;
		}
		DQ[front]=data;
		
	}
	
	public void InsertAtRear(int data) {
		if(front==(rear+1)%size) {
			System.out.println("queue is full");
			return;
		}
		if(front==-1) {
			front=rear=0;
		}
		else {
			rear=(rear+1)%size;
		}
		DQ[rear]=data;
		
	}
	
	public void deleteAtFront() {
		if(front==-1) {
			System.out.println("queue is empty");
			return;
		}
		
		else if(front==rear) {
			System.out.println(DQ[front]);
			front=rear=-1;
			
		}else {
			
			System.out.println(DQ[front]);
			front=(front+1)%size;
		
			}
		}
	
	
	public void deletefromRear() {
		
	}
	public void display() {
		
	}
}
public class dequeueUsingArrays {
	public static void main(String[] args) {

	}
}
