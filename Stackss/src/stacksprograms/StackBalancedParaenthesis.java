package stacksprograms;

import java.util.Stack;


class Paraenthesis{
	static boolean BalPara(String ss) {
		Stack<Character> s= new Stack<Character>();
		
		char[] ch=ss.toCharArray();
		for(char c:ch) {
		     switch(c) {
		     case '(':
		    	      s.push(c);
		              break;
		     case '{':
		    	      s.push(c);
		    	      break;
		     case '[':
	    	         s.push(c);
	    	         break;	
		     case ')':
	    	         if(s.pop()!='(') {	    	          	
	    	           return false;	  
	    	         }
	    	         break;
	    	          
	         case '}':
	    	          if(s.pop()!='{') {
	    	          return false;
	    	          }
	    	          break;
	        case ']':
	        	    if(s.pop()!='[')   {
  	                   return false;
	        	    }
	        	    break;
		     }
		}
		 
		return s.isEmpty();
	
	}
}
public class StackBalancedParaenthesis {
	public static void main(String[] args) {
		
      String s="(){}[]";
      boolean b=Paraenthesis.BalPara(s);
      System.out.println(b);

	}
}
