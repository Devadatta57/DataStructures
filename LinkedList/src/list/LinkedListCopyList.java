package list;

class SLlin{
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
  
     
     
     SLlin copyList() {
    	 Node headNode=null;
    	 Node tailNode=null;
    	 Node currNode=head;
    	 Node tempNode=null;
    	 
    	 if(currNode==null) {
    		 System.out.println("list empty");
    		 return null;
    	 }
    		 headNode=new Node(currNode.data,null);
    		 tailNode=headNode;
    		 currNode=currNode.next;
    		 
    	 
    	 while(currNode!=null) {
    		 tempNode=new Node(currNode.data,null);
    		 tailNode.next=tempNode;
    		 currNode=currNode.next;
    		 tailNode=tempNode;	 
    	 }
    	 SLlin s=new SLlin();
    	 s.head=headNode;
    	 return s;
    	 
     }
     
     
     boolean compareList(SLlin list1) {
    	 Node head1=head;
    	 Node head2=list1.head;
    	 
    	 while(head1!=null && head2!=null) {
    		 if(head1.data!=head2.data)
    		 {
    			 return false;
    		 }
    		 head1=head1.next;
    		 head2=head2.next;
    	 }
    	 if(head1==null && head2==null) {
    		 return true;
    	 }
    	 return false;
     }
}
public class LinkedListCopyList {
	public static void main(String[] args) {
       SLlin l=new SLlin();
//        l.addFirst(50);
//        l.addLast(10);
//        l.addLast(20);
//        l.addLast(30);
     
        
        SLlin l1=new SLlin();
//        l1.addFirst(50);
//        l1.addLast(10);
//        l1.addLast(20);
//        l1.addLast(50);
        
     //  SLlin s= l.copyList();
      // s.Print();
       
     //  System.out.println();
       
      //  SLlin s1= l1.copyList();
       // s.Print();
        
        boolean res=l.compareList(l1);
        System.out.println(res);
    
	}
}
