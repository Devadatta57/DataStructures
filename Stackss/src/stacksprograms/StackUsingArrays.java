package stacksprograms;

class StackArray{
    int size=5;
	int[] data;
	
	public StackArray() {
		data=new int[size];
	}
	
	int top=-1;
	
	int getSize() {
		return top+1;
	}
	
	boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void print() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		for(int i=0;i<=top;i++) {
			System.out.print(data[i]+" ");
		}
	}
	void push(int value) {
		if(getSize()==data.length) {
			System.out.println("stack over flow");
		    return;
		}
		top++;
		data[top]=value;
		
	}
	int pop() {
		if(isEmpty()) {
			System.out.println("stack under flow");
		    return -1;
		}
	
		int value=data[top];
		top--;
		return value;
		
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("stack under flow");
		    return data.length;
		}
		return data[top];
	 
	}
	
	boolean search(int value) {
		for(int i=0;i<=top;i++) {
			if(data[i]==value) {
				return true;
			}
		}
		return false;
	}
	
}
public class StackUsingArrays {

	public static void main(String[] args) {
		StackArray s = new StackArray();
		
		s.push(34);
		s.push(45);
		s.push(23);
		s.push(89);
		s.push(33);
		//System.out.println(s.peek());
		//s.print();
		System.out.println(s.search(39));

	}

}
