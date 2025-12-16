package circlists;
//tail is last node,tail.next is head
class CirLis1{
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
		 System.out.println(temp.data);
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
	 
	 void addPos(int pos,int data) {
		 Node newNode = new Node(data,null);
		 Node temp=tail.next;
	   if(size==0) {
		   tail=newNode;
		   tail.next=newNode;
		   size++;
	   }
	   else {
		   if(pos==0) {
			   addFirst(data);
			   return;
		   }
		   if(pos==size) {
			   addTail(data);
			   return;
		   }
			   int count=0;
			   while(temp.next!=tail && count<pos-1) {
				   temp=temp.next;
				   count++;
			   }
			   newNode.next = temp.next;
			   temp.next=newNode;
			   size++;
		   
	   }
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
	    c.print();
	    System.out.println(c.getSize());

	    System.out.println();
	    c.addPos(4,8);
	    System.out.println(c.getSize());
	    c.addPos(5,8);
	    c.addPos(6,8);

	    c.print();
      }
}
