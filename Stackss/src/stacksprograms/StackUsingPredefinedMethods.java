package stacksprograms;

import java.util.Stack;

public class StackUsingPredefinedMethods {
	public static void main(String[] args) {
		
      Stack s = new Stack();
      s.push(23);//1
      s.push(12);//2
      s.push(11);//3
//      s.pop();
//      s.pop();
//      s.pop();
//      s.pop();
    
//      while(!s.isEmpty()) {
//    	  System.out.print(s.pop()+" ");
//      }
   // System.out.println(s.peek());
    System.out.println(s.search(23));
    System.out.println(s.search(12));
    System.out.println(s.search(11));

	}
}
