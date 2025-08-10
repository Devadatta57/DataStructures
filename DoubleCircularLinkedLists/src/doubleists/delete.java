package doubleists;

import doubleists.CirLis1.Node;

class CirLis2{
	Node tail;
	int size=0;
	 class Node{
		int data;
		Node next;
		Node prev;
		Node(int data,Node next,Node prev){
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
	 }
	 
	 void print() {
		 if(tail==null) {
			 System.out.println("empty lists");
			 return;
		 }
		 Node temp=tail.next;
		 while(temp!=tail) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
		 System.out.print(temp.data);
	 }
	 

	 void addFirst(int data) {
		 Node newNode = new Node(data,null,null);
	     if(tail==null) {
	    	 tail=newNode;
	    	 tail.next=newNode;
	    	 tail.prev=tail;
	    	 size++;
	    	 return;
	     }else {
		    newNode.prev=tail;
	        newNode.next = tail.next;
	        tail.next.prev=newNode;
	        tail.next=newNode; 
	     }
	     size++;
	 }
	
	
	 void addTail(int data) {
		 Node newNode = new Node(data,null,null);
	     if(tail==null) {
	    	 tail=newNode;
	    	 tail.next=newNode;
	    	 tail.prev=tail;
	    	 size++;
	    	 return;
	     }else {
	        newNode.prev=tail;
	        newNode.next = tail.next;
	        tail.next.prev=newNode;
	        tail.next=newNode;
	        tail=newNode;
	     }
	        size++;

	 }
	 
	 int getSize() {
		 return size;
	 }
	 
	 void DeleteFirst() {
		
	     if(tail==null) {
	    	 System.out.println("empty list");
	    	 return;
	     }
	     else if(tail.next==tail){
	    	 tail=null;
	    	 size--;
	     }else {
	    	 Node temp=tail.next;
	        tail.next = temp.next;
	        temp.next.prev=tail;
	        size--;
	     }
	    
	 }
	 
	 void DeleteLast() {
			
	     if(tail==null) {
	    	 System.out.println("empty list");
	    	 return;
	     }
	     else if(tail.next==tail){
	    	 tail=null;
	    	 size--;
	     }else {
	    	 Node temp=tail.next;
	    	 while(temp.next!=tail) {
	    		 temp =temp.next;
	    	 }
	    	 temp.next=tail.next;
	    	 tail.next.prev=temp;
	    	 tail=temp;
	         size--;
	     }
	    
	 }
	
}
public class delete {
      public static void main(String args[]) {
	    CirLis2 c = new CirLis2();
	   // c.addFirst(34);
	    c.addTail(45);
	    c.addTail(67);
        c.addTail(2);
	    c.print();
	    
	    System.out.println();
	    //c.DeleteFirst();
	    c.DeleteLast();
	    c.print();
	   
      }
}
