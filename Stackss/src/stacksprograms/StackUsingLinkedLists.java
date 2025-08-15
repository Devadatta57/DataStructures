package stacksprograms;

class StackLl{
	int size=0;
	Node head=null;
	class Node{
		int data;
		Node next;
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
	}
	
	boolean isEmpty() {
		if(size==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void print() {
		if(isEmpty()) {
			System.out.println("empty stack");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	void push(int data) {
		head=new Node(data,head);
		size++;
	}
	int pop() {
		if(isEmpty()) {
			System.out.println("stack under flow");
			return -1;
		}
		else {
		int value=head.data;
		head=head.next;
		size--;
		return value;
		}
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("stack under flow");
			return -1;
		}
		else {
			return head.data;
		}
	}
	boolean search(int data) {
		if(isEmpty()) {
			System.out.println("stack under flow");
			return false;
		}
		else {
			Node temp=head;
			while(temp!=null) {
				if(temp.data==data) {
					return true;
				}
				temp=temp.next;
			}
			return false;
		}
	}
	@Override
	public String toString() {
		Node temp=head;
		StringBuffer sb= new StringBuffer();
		sb.append("[ ");
		while(temp!=null) {
			if(temp.next!=null){
				sb.append(temp.data+" ");
			}
			else {
				sb.append(temp.data);
			}
			temp=temp.next;
		}
		sb.append(" ]");
		return sb.toString();

	}
}
public class StackUsingLinkedLists {

	public static void main(String[] args) {
      StackLl s = new StackLl();
      s.push(12);
      s.push(78);
      s.push(80);
//      System.out.println(s.pop()+" popped ");
//      System.out.println(s.pop()+" popped ");
//      System.out.println(s.pop()+" popped ");
//      System.out.println(s.pop()+" popped ");
       // System.out.println(s.peek());
       // System.out.println(s.search(9));
       System.out.println(s);
    //  s.print();
	}
}
