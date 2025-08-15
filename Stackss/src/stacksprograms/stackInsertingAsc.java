package stacksprograms;

import java.util.Stack;

class StackInsert{
	static void InsertAtPos(Stack<Integer> ss,int value) {
	    if(ss.isEmpty() || value>ss.peek()) {
	    	ss.push(value);
	    }
	    else {
	    	int temp=ss.pop();
	    	InsertAtPos(ss, value);
	    	ss.push(temp);
	    }
	}
	
	static void SortStack(Stack<Integer> ss) {
		int temp=0;
		if(ss.isEmpty()==false) {
		   temp=ss.pop();
		   SortStack(ss);
		   InsertAtPos(ss, temp);
		}
	}
	
	static void bottomInsert(Stack<Integer> ss,int value) {
		if(ss.isEmpty()) {
			ss.push(value);
		}
		else{
			  int temp=ss.pop();
			  bottomInsert(ss,value);
				 ss.push(temp);
		 }
		 
	}
	
	static void Reverse(Stack<Integer> ss) {
		if(ss.isEmpty()) {
			return;
		}
		else{
			  int temp=ss.pop();
			  Reverse(ss);
			  bottomInsert(ss, temp);
		 }
		 
	}
  
}
public class stackInsertingAsc {
	public static void main(String[] args) {
		StackInsert d= new StackInsert();
       Stack<Integer> s = new Stack<Integer>();
       s.push(45);
       s.push(2);
       s.push(89);
       s.push(4);
       //System.out.println(s);
     //  d.InsertAtPos(s,1);
     //  d.SortStack(s);
       for (int i = s.size() - 1; i >= 0; i--) {
    	    System.out.print(s.get(i) + " ");
    	}
       System.out.println();
       //d.bottomInsert(s, 78);
      // d.bottomInsert(s, 8);
       d.Reverse(s);

       for (int i = s.size() - 1; i >= 0; i--) {
   	    System.out.print(s.get(i) + " ");
   	}
     // d.bottomInsert(s, 78);
      // System.out.println(s);
		
		
	}
}
