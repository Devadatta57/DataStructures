package list;

class LinkL{
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
	
     boolean Search(int data) {
		

		Node currNode=head;
		while(currNode!=null) {
			if(currNode.data==data) {
			return true;
			}
			currNode=currNode.next;
		}
		return false;
		
	}
    
     int getSize() {
    	return size; 
     }
	  
     void InserAtPos(int data,int pos) {
    	 
    	 int i=0;
    	 Node newNode = new Node(data);
    	 if(head==null) {
    		   head=newNode;
    		   return;
    	 }
    	 if(pos!=0) {
    		 Node prevNode=null;
    		 Node currNode=head;
    		 while(currNode!=null && i<pos) {
    			 prevNode=currNode;
    			 currNode=currNode.next;
    			 i++;
    		 }
    		 prevNode.next=newNode;
    		 newNode.next=currNode;
    	 }
    	 else{
    		 newNode.next=head;
    	     head=newNode;
    	 }
    	 
     }
     void InserAsc(int data){
    	 Node newNode = new Node(data);
    	 Node currNode=head;
    	 if(currNode==null || currNode.data>data) {
    		 newNode.next=head;
    		 head=newNode;
    		 return;
    	 }
    	 while(currNode.next!=null && currNode.next.data<data) {
    		 currNode=currNode.next;
    	 }
              newNode.next=currNode.next;
              currNode.next=newNode;
     }
}
public class LinkedListSearch {
	public static void main(String[] args) {
        LinkL l=new LinkL();
        l.addFirst(333);
        l.addFirst(222);
        l.addLast(444);
        l.addLast(777);
        l.addFirst(111);
       // l.Print();
      //  System.out.println();
      //  l.InserAtPos(555,6);
      //  l.Print();
        System.out.println();
      //  l.InserAsc(223);
        l.InserAsc(6);
        l.Print();

     //  System.out.println(l.Search(339));
     //  System.out.println(l.getSize());
	}
}
