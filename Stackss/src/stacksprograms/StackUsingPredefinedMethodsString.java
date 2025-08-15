package stacksprograms;

import java.util.Stack;

public class StackUsingPredefinedMethodsString {
	public static void main(String[] args) {
		
      Stack<String> s = new Stack<String>();
      s.push("deva");//1
      s.push("datta");//2
      s.push("ch");//3

    System.out.println(s);
    System.out.println(s.peek());
    System.out.println(s.search("DEVA"));
    System.out.println(s.pop());

	}
}
