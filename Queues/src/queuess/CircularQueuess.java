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
//package com.queue;

// class CircularQ{
// 	int size=0;
// 	int[] a;
// 	int count=0;
	
// 	public CircularQ(int size) {
// 		this.size=size;
// 		a=new int[size];
// 	}
	
// 	int rear=-1,front=-1;
	
// 	public void add(int data) {
// 		if(count==size) {
// 			System.out.println("size full");
// 			return;
// 		}
// 		if(rear==-1) {
// 			rear=front=0;
// 			a[rear]=data;
// 			count++;
// 		}
// 		else {
// 		rear=(rear+1)%size;
// 		a[rear]=data;
// 		count++;
// 		}
// 	}
	
// 	public void delete() {
// 	   if(front==-1) {
// 		   System.out.println("empty");
// 		   return;
// 	   }
// 	   if(front==rear) {
		
// 		   front=rear=-1;
// 		   count--;
// 		   return;
// 	   }

// 	   front=(front+1)%size;
// 	   count--;
	   
// 	}
	
// 	void display() {
// 		if(count==0) {
// 			 System.out.println("empty");
// 			   return;
// 		}
		
// 		for(int i=0;i<count;i++) {//count=no of elements in  array size 
// 			System.out.print(a[(front+i)%size]+" ");// displaying  (count- var that stores elements in n array size ) elements from front to rear 
// 		}
		
		
// 	}
	
// }
// public class CircularQueues {
// 	public static void main(String[] args) {
//       CircularQ c= new CircularQ(5);
//       c.add(34);
//       c.add(12);
//       c.add(89);
//       c.add(23);
//       c.add(78);
//       c.display();
//       System.out.println();
//       c.delete();
//       c.add(99);
     
     
//       c.display();
//      c.delete();
//      c.display();
//       System.out.println();
     
// 	}
// }

