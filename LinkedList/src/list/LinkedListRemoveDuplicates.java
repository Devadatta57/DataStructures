package list;

import java.util.Currency;

class Lil{
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
     
     
     void RemoveDuplicates() {
    	//sort ll before removing duplicates
    	 Node currNode=head;
    	 while(currNode!=null) {
    		 if(currNode.next!=null && currNode.data==currNode.next.data) {
    			 currNode.next=currNode.next.next;
    		 }
    		 else {
    			 currNode=currNode.next;
    		 }
    		 
    	 }
     }
  
}
public class LinkedListRemoveDuplicates {
	public static void main(String[] args) {
        Lil l=new Lil();
       
     
        l.addLast(10);
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(30);
        l.Print();
        
       
     
        System.out.println();
       l.RemoveDuplicates();
      
        l.Print();
       
    
	}
}
