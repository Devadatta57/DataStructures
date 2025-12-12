package list;

class LinkLi{
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
	  
     void deleteFirst() {
    	 if(head==null) {
    		 System.out.println("empty list");
    		 return;
    	 }
    	 
    	 head=head.next;
    	 size--;
    	 
     }
    
    void deleteLast() {
    	if(head==null) {
    		System.out.println("empty list");
    		return;
    	}
    	Node temp1=head;
        Node temp2=head.next;
        while(temp2.next!=null) {
        	temp2=temp2.next;
        	temp1=temp1.next;
        }
        temp1.next=null;
        size--;
    }
    
    void deleteElement(int data) {
    	if(head==null) {
    		System.out.println("empty list");
    		return;
    	}
    	
    	Node temp=head;

    	
    	if(temp.data==data) {
    		size--;
    		head=temp.next;
    	}
    	
    	while(temp.next!=null) {
    		
    		if(temp.next.data==data) {
    			size--;
    			temp.next=temp.next.next;
    			return;
    		}
    		temp=temp.next;
    	}
    }
    
    
    public void deleteAllOcc(int data) {
	
	while(head!=null && head.data==data) {
		head=head.next;
	}
	if(head==null) {
		return;
	}
	Node currNode=head;
	while(currNode.next!=null) {
		if(currNode.next.data==data) {
			currNode.next=currNode.next.next;
		}
		else {
		 currNode=currNode.next;
		}
	}
	
}
    
    //my code
//    void deleteAtPos(int pos) {
//    	   int i=0;
//    	   if(head==null) {
//    		   System.out.println("empty list");
//    		   return;
//    	   }
//    	   if(pos<0 || pos==getSize()) {
//    		   System.out.println("Invalid");
//    		   return;
//    	   }
//    	   if(pos==0) {
//    		   head=head.next;
//    		   size--;
//               return;    		  
//    	   }
//    	   else {
//    		   Node temp=head;
//    		   Node prev=null;
//    		   while(temp.next!=null  && i<pos){
//    			   prev=temp;
//    			   temp=temp.next;
//    			   i++;
//    		   }
//    		   
//    		   if(i==pos) {
//    			   prev.next=temp.next;
//    			   size--;
//    		   }
//    	   }
//    }
//        
    
    
  void deleteAtPos(int pos) {
  	   int i=0;
  	   if(head==null) {
  		   System.out.println("empty list");
  		   return;
  	   }
  	 if(pos<0 || pos==getSize()) {
		   System.out.println("Invalid");
		   return;
	   }
  	   if(pos==0) {
  		   head=head.next;
  		   size--;
             return;    		  
  	   }
  	   else {
  		   Node temp=head;
  		  
  		   while(temp.next!=null  && i<pos){
  			 if(i==pos-1) {
    			  temp.next=temp.next.next;
    			   size--;
    			   return;
    		   }
  			 
  			   i++;
  			   temp=temp.next;
  		   }
  		   
  		  
  	   }
  }
      
}
public class LinkedListDelete {
	public static void main(String[] args) {
        LinkLi l=new LinkLi();
       
        l.addFirst(50);
   
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.Print();
        
        l.deleteAllOcc(10);
        l.deleteAtPos(3);
        System.out.println();
     
      
        l.Print();
       
    
	}
}
