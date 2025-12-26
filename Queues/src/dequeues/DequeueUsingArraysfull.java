package dequeues;
//case:1 when front=0 and rear=size-1
//case:2 when front=1 and rear=0
//why cant we use same logic for insertatfront as insertatrear ?
//becoz in insertionAtRear rear means works clockwise we add  data nxt to rear
//insertionatRear means anticlockwise we cant add data nxt ,we should data back to it so we add at index 0 then jump to size-1 and add then move step back until it reaches to index 0 position 
//deletionAtRear means rear at index 0 and front at index 1 so delete at index 0 first then jump to size-1 index and move forward
//display logic diff for both cases 


class DequeueArray{
	int front,rear,size=5;
	int[] a;
	
	public DequeueArray() {
		front=-1;
		rear=-1;
		a=new int[size];
	}
	
	public void InsertAtFront(int data) {
		if(front==(rear+1)%size) {
			System.out.println("queue is full");
			return;
		}
		if(front==-1) {
			front=rear=0;
		}
		else if(front==0) {
			front=size-1;
		}
		else {
			front=front-1;
		}
		a[front]=data;
	}
	
	public void InsertAtRear(int data) {
		if((front==(rear+1)%size)) {
			System.out.println("queue is full");
			return;
		}
		if(front==-1) {
			front=rear=0;
		}
		else {
			rear=(rear+1)%size;
		}
		a[rear]=data;
	}
	
	public void DeleteAtFront() {
		if(front==-1) {
			System.out.println("empty queue");
			return;
		}
		System.out.println(a[front]);
		if(front==rear) {
			front=rear=-1;
		}
		else {
			front=(front+1)%size;
		}
	}
	
	public void DeleteAtRear() {
		if(front==-1) {
			System.out.println("empty queue");
			return;
		}
		System.out.println(a[rear]);
		if(front==rear) {
			front=rear=-1;
		}
		else {
			if(rear==0) {
				rear=size-1;
			}else {
				rear=(rear-1)%size;
			}
		}
	}
	
	public void display() {
		if(front==-1) {
			System.out.println("nothing to display");
			return;
		}
		
		int left=front;
		int right=rear;
		
		if(left<=right) {
			while(left<=right) {
				System.out.print(a[left++]+" ");
			}
		}
		else {
			while(left<=size-1) {
				System.out.print(a[left++]+" ");
			}
			left=0;
			while(left<=right) {
				System.out.print(a[left++]+" ");
			}
		}
	}
}
public class DequeueUsingArraysfull {

	public static void main(String[] args) {
	 DequeueArray d = new DequeueArray();
	 d.InsertAtFront(67);
	 d.InsertAtFront(12);
	 d.InsertAtFront(89);
	 d.InsertAtRear(79);
	 d.InsertAtRear(66);
	 d.display();
	 
	 System.out.println();
	 
//	 d.DeleteAtFront();
//	 d.DeleteAtFront();
//	 d.DeleteAtFront();
//	 d.DeleteAtFront();
//     d.DeleteAtFront();
	 //d.DeleteAtFront();

	 d.DeleteAtRear();
	 d.DeleteAtRear();
	 d.DeleteAtRear();
	 d.DeleteAtRear();
	 d.DeleteAtRear();
	 d.DeleteAtRear();


	// d.DeleteAtRear();
	// d.display();

	}

}
