package stacksprograms;

import java.util.Stack;

class Postfix{
	static int Postfix(String s) {
		char[] c=s.toCharArray();
		Stack<Integer> st= new Stack<Integer>(); 
		for(char ch:c) {
			if(Character.isDigit(ch)) {
				st.push(ch-'0');
			}else {
				switch(ch) {
				case '+':int v1=st.pop();
				         int v2=st.pop();
				         st.push(v2+v1);
				         break;
				         
				case '-': v1=st.pop();
		                  v2=st.pop();
		                  st.push(v2-v1);
		                  break;
				
				case '*': v1=st.pop();
		                  v2=st.pop();
		                  st.push(v2*v1);
		                   break;
				
				case '/': v1=st.pop();
		                  v2=st.pop();
		                  st.push(v2/v1);
		                  break;
				}
			}
			
		}
		return st.peek();
	}
}
public class PostfixEval {
	public static void main(String[] args) {
         String s="23*1+";
         Postfix p= new Postfix();
        System.out.println(p.Postfix(s));
	}
}
