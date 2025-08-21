package queuess;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

class QueueAddDelDis{
	int rear=-1,front=-1,size=5;
	int[] Q;
	public QueueAddDelDis() {
		Q =new int[size];
	}
	
	public void InsertAtRear(int data) {
	   	if(rear==size) {
	   		System.out.println("full queue");
	   		return;
	   	}
	   	if(rear==front) { 
	   		rear=front=0;
	   	}
	   	Q[rear++]=data;
	}
	
	public void Delete() {
		if(front==-1 || front>=Q.length) {
			System.out.println("nothing to delete");
			return;
		}
		 if(front==rear) {
				front=rear=-1;
				return;
		}
		System.out.println(Q[front]);
		front++;
	   
		
	}
	
	public void Display() {
		if(rear==front) {
			System.out.println("nothing to display");
		}
	  for(int i=front;i<rear;i++) {
		  System.out.print(Q[i]+" ");
	  }
	}
	
}

public class NormalQueue {
	public static void main(String[] args) {
		QueueAddDelDis q= new QueueAddDelDis();

		q.InsertAtRear(12);
		q.InsertAtRear(72);
		q.InsertAtRear(90);
		q.InsertAtRear(78);
		q.InsertAtRear(77);
		
	
	
	q.Display();

	}
}
