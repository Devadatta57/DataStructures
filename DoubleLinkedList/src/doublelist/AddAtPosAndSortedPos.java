package doublelist;

import java.util.Currency;
import java.util.spi.CurrencyNameProvider;

class DoubleL2{
	Node head;
	int size=0;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data,Node next,Node prev){
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
		
	}
	public  void traverse() {
		if(head==null) {
			System.out.println("empty list");
		}
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.print("null");
	}
	
	void addFirst(int data) {
		Node newNode;
		if(size==0) {
			newNode = new Node(data,null,null);
			head=newNode;
			size++;
			return;
		}
		else {
			newNode = new Node(data,null,null);
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
			size++;
		}
	}
	
	void addLast(int data) {
		Node newNode;
		Node currNode=head;
		if(size==0) {
			newNode = new Node(data,null,null);
			head=newNode;
			size++;
			return;
		}
		else {
			newNode = new Node(data,null,null);
            while(currNode.next!=null) {
            	currNode=currNode.next;
            }
            currNode.next=newNode;
            newNode.prev=currNode;
            size++;
		}
	}
	
	void AscIns(int data) {
		Node newNode= new Node(data,null,null);
		if(head==null) {
			addFirst(data);
			return;
		}
		
		Node currNode=head;
		if(currNode.data>data){
			addFirst(data);
			return;
		}
		while(currNode.next!=null && currNode.next.data<data){
			currNode=currNode.next;
		}
		if(currNode.next!=null) {
		newNode.next=currNode.next;
		currNode.next.prev=newNode;
		currNode.next=newNode;
		newNode.prev=currNode;
		}
		else{
			addLast(data);
		}
		
	}
	
	void InserAtPos(int data,int pos) {
	 Node newNode = new Node(data,null,null);
	 int count=0;
	 Node curNode=head;
	 Node temp=null;
	 if(pos<0 || pos>=size) {//add only from 0 to 2 if size 3 get out of range  
		 System.out.println("out of range");
		 return;
	 }
//	 if(pos==getSize()) {//at last index if u want to include use this  and  change do pos>size 
//		 addLast(data);
//		 return;
//	 }
	 
		if(pos!=0) {
			while(curNode.next!=null && count<pos) {
				temp=curNode;
				curNode=curNode.next;
				count++;
				
			}
			temp.next=newNode;
			newNode.prev=temp;
			curNode.prev=newNode;
			newNode.next=curNode;
			size++;
		}
		else {
			addFirst(data);
		}
	}
	int getSize() {
		return size;
	}
}
public class AddAtPosAndSortedPos {

	public static void main(String[] args) {
     DoubleL2 l=new DoubleL2();
     l.addFirst(22);
     l.addLast(25);
     l.addLast(45);
     l.addLast(90);
    // System.out.println(l.getSize());
     //System.out.println();
     l.traverse();
     System.out.println();
    // l.InserAtPos(34,0);
     l.AscIns(99);
     l.traverse();
	}

}
