package list;

class LinkLis{
	Node head;
	int size=0;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
			size++;
		}
	}
	
	void Print() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}


		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.print("null");
		
	}
	
	void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}

	   		newNode.next=head;
	   		head=newNode;
	}
	void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	
     int getSize() {
    	return size; 
     }
     
     void reverse() {
    	 
    	 Node prev=null;
    	 Node curr=head;
    	 Node next=null;
    	 
    	 while(curr!=null) {
    	    next=curr.next;
    	    curr.next=prev;
    	    prev=curr;
    	    curr=next;
    	    
    	 }
    	 head=prev;
     }
  
}
public class LinkedListReverse {
	public static void main(String[] args) {
        LinkLis l=new LinkLis();
       
        l.addFirst(50);
   
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.Print();
        
       
     
        System.out.println();
      l.reverse();
      
        l.Print();
       
    
	}
}
