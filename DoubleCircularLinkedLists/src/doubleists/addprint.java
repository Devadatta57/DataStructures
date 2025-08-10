package doubleists;

class CirLis1{
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
		 System.out.println(temp.data);
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
}
public class addprint {
      public static void main(String args[]) {
	    CirLis1 c = new CirLis1();
	    c.addFirst(34);
	    c.addFirst(45);
	    c.addFirst(67);
	    c.addTail(2);
	    c.addTail(7);
	    c.print();
	    System.out.println(c.getSize());	   
	    c.print();
      }
}
