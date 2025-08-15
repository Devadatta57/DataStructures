package stacksprograms;

import java.util.Stack;

class Exp{
	static int precedence(char ch) {
		if(ch=='*' || ch=='/') {
			return 2;
		}
		else if(ch=='+' || ch=='-') {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	static String infixToPostfix(String s)
	{
		Stack<Character> st= new Stack<Character>();
		char[] c=s.toCharArray();
		String output="";
		for(char ch:c) {
			if(Character.isLetterOrDigit(ch)){
				output=output+ch;
			}
			else if(ch=='(') {
				st.push(ch);
			}
			else if(ch==')') {
				
				while(st.isEmpty()==false && st.peek()!='(') {
					output=output+st.peek();
					st.pop();
				}
				st.pop();
			}
			else {
				while(st.isEmpty()==false && precedence(ch)<=precedence(st.peek())) {
					output=output+st.peek();
					st.pop();
				}
				st.push(ch);
			}
		}
		while(st.isEmpty()==false) {
			output=output+st.peek();
			st.pop();
		}
		return output;
	}
}
public class infixToPostfixExp {
	public static void main(String[] args) {
        String s="(a+b)+(c*d)";
        Exp p = new Exp();
       String output= p.infixToPostfix(s);
       
       System.out.println(output);
	}
}
