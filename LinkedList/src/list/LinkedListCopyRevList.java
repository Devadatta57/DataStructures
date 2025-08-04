package list;

class SLl{
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
		public Node(int data, Node temp1) {
			this.data=data;
			next=temp1;
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
  
     SLl copyRevList() {
    	 
    	 Node temp1=null,temp2=null;
    	 Node currNode=head;
    	 while(currNode!=null) {
    		 temp2=new Node(currNode.data,temp1);
    		 currNode=currNode.next;
    		 temp1=temp2;
    	 }
    	 
    	 SLl s = new SLl();
    	 s.head=temp1;
    	 return s;
    	 
     }
     
     
}
public class LinkedListCopyRevList {
	public static void main(String[] args) {
       SLl l=new SLl();
       
        l.addFirst(50);
   
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.Print();
        System.out.println();
        
       // l.reverse();
       // l.Print();
        System.out.println();
        
       SLl s= l.copyRevList();

        s.Print();
       
    
	}
}
