package circlists;

class CirLis3{
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
	 
	 boolean search(int data) {
		 Node temp=tail;
		 for(int i=1;i<=getSize();i++) {
			 if(temp.data==data) {
				 return true;
			 }
			 temp=temp.next;
		 }
		 return false;
	 }
	 
	 int getSize() {
		 return size;
	 }
}
public class Search {
      public static void main(String args[]) {
	    CirLis3 c = new CirLis3();
	    c.addFirst(34);
	    c.addFirst(45);
	    c.addFirst(67);
	    c.addTail(2);
	    c.print();
	   

	    System.out.println(c.search(88));
	   
	    c.print();
      }
}
