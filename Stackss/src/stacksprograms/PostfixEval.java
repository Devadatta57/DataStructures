package stacksprograms;

import java.util.Stack;

class Postfix{
	static int Postfix(String s) {
		char[] c=s.toCharArray();
		Stack<Integer> st= new Stack<Integer>(); 
		for(char ch:c) {
			if(Character.isDigit(ch)) {
				st.push(ch-'0');//to convert char to numeric value ch-'0';
			}else {
				int v1=p.pop();
				int v2=p.pop();
			
				switch(ch) {
				case '*':
					    st.push(v2*v1);
					    break;
				case '/':
					    st.push(v2/v1);
					    break;
				case '+':
					     st.push(v2+v1);
					     break;
				case '-':	
					     st.push(v2-v1);
					     break;
				}
			}
     	}
		return st.pop();
	}
}
public class PostfixEval {
	public static void main(String[] args) {
         String s="23*1+";
         Postfix p= new Postfix();
        System.out.println(p.Postfix(s));
	}
}
