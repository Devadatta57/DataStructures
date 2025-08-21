package queuess;
class Circular{
	int front=-1;
	int rear=-1;
	int count=0;
	int[] Q;
	int size=5;
	Circular(){
	  Q=new int[size];
	}
	
	public void Insert(int data) {
		if(count==size) {
			System.out.println("full queue");
			return;
		}
		if(front==-1) {
			front=rear=0;
		}else {
		   rear=(rear+1)%size;
		}
		Q[rear]=data;
		count++;
	}
	public void Delete() {
		if(count==0) {
			System.out.println("empty queue");
			return;
		}
		System.out.println(Q[front]);

		if(front==rear) {
			front=rear=-1;
			count--;
		}
		else {
		front=(front+1)%size;
		count--;
		}
		
	}
	
	public void display() {
		if(count==0) {
			System.out.println("no data to display");
			return;
		}
		int i=front;
	
	    if(front<=rear) {
	    	while(i<=rear) {
	    		System.out.print(Q[i]+" ");
	    		i++;
	    	}
	    }else {
	    	while(i!=rear) {
	    		System.out.print(Q[i]+" ");
	    		i=(i+1)%size;
	    	}
	    	System.out.println(Q[i]);
	    }
	    
	}
}
public class CircularQueuess {
	public static void main(String[] args) {
		Circular c= new Circular();
		c.Insert(12);
		c.Insert(14);
		c.Insert(67);
		c.Insert(90);
		c.Insert(1212);
		
		c.Delete();
		c.Insert(78);
		c.display();
	}
}
