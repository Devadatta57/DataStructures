package circlists;

class CirLis2{
	Node tail;
	int size=0;
	 class Node{
		int data;
		Node next;
		Node(int data,Node next){
			this.data=data;
			this.next=next;
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
		 Node newNode = new Node(data,null);
	     if(tail==null) {
	    	 tail=newNode;
	    	 tail.next=newNode;
	    	 size++;
	    	 return;
	     }else {
	        newNode.next = tail.next;
	        tail.next=newNode; 
	     }
	     size++;
	 }
	 
	 void addTail(int data) {
		 Node newNode = new Node(data,null);
	     if(tail==null) {
	    	 tail=newNode;
	    	 tail.next=newNode;
	    	 size++;
	    	 return;
	     }else {
	        newNode.next = tail.next;
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
	    	 tail=temp;
	         size--;
	     }
	    
	 }
	 
	 void deletePos(int pos) {
		
	   if(pos<=0 || pos>getSize() || tail==null) {
		  System.out.println("not found");
		  return;
	   }
	   else {
		   if(pos==1) {
			   DeleteFirst();
			   return;
		   }
		   if(pos==size) {
			   DeleteLast();
			   return;
		   }
		   Node temp=tail.next;
			   int count=1;
			   while(temp.next!=tail && count<pos-1) {
				   temp=temp.next;
				   count++;
			   }
			 
			   temp.next=temp.next.next;
			   size--;
		   
	   }
	 
     }
	 
	 void delete(int data) {
		 Node temp=tail.next;
		 
		 if (tail == null) { // empty list
		        System.out.println("empty list");
		        return;
		    }
		 
		 if(temp.data==data) {
			 DeleteFirst();
			 return;
		 }
		 
		 while(temp.next!=tail && temp.next.data!=data) {
			 temp=temp.next;
		 }
		 if(temp.next!=tail && temp.next.data==data ) {
		    temp.next=temp.next.next;
		    return;
		 }
		
		 if(temp.next==tail && temp.next.data==data) {
			 DeleteLast();
			 return;
		 }
		 
			 System.out.println("not found");
		 
	 }
	 
}
public class delete {
      public static void main(String args[]) {
	    CirLis2 c = new CirLis2();
	    c.addFirst(34);
	    c.addTail(45);
	    c.addTail(67);
        c.addTail(2);
	    c.print();
	    
	    System.out.println();
	    c.delete(34);
	    c.print();
	   
      }
}
