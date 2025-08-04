package list;

class SlB{
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
  
     
   
     int nthNodeFromBegin(int n) {
    	int count=1;
    	 if(n<=0 || n>getSize()) {
    		 return -1;
    	 }
    	 Node currNode=head;
		// System.out.println(currNode.data);
    	 while(currNode!=null && count<n) {
    		 currNode=currNode.next;
    		// System.out.println(currNode.data);
    		 count++;
    	 }
    	 return currNode.data;
    	 
     }
     
     int nthNodefromLast(int index) {
    	 if(size!=0 && getSize()<index) 
    		 return -1;
    	 
    	 int n=getSize();
    	 
    	 n=n-index+1;
    	 System.out.println(n);
    	return  nthNodeFromBegin(n);
    	
    	 
     }
//     int nthNodeFromEnd(int index) {
//    	    int size = getSize();
//    	    int sindex;
//
//    	    if (size != 0 && size < index)
//    	        return -1;
//
//    	    sindex = size - index + 1;
//    	    return nthNodeFromBegin(sindex);
//    	}

     
}
public class LinkedListnthNOdefromBegAndEnd {
	public static void main(String[] args) {
      SlB s= new SlB();
      s.addFirst(20);
      s.addLast(21);
      s.addLast(34);
      s.addLast(45);
      s.Print();
      System.out.println();
     // int data=s.nthNodeFromBegin(2);//second node from beginning is 21 
      int data=s.nthNodefromLast(5);
      System.out.println(data);
	}
}
