package stacksprograms;

import java.util.Stack;


static boolean BalPara(String ss) {
    Stack<Character> s = new Stack<>();

    for (char c : ss.toCharArray()) {
        switch (c) {
            case '(':
            case '{':
            case '[':
                s.push(c);
                break;

            case ')':
                if (s.isEmpty() || s.pop() != '(')
                    return false;
                break;//when correct case condition break and go to nxt char

            case '}':
                if (s.isEmpty() || s.pop() != '{')
                    return false;
                break;

            case ']':
                if (s.isEmpty() || s.pop() != '[')
                    return false;
                break;
        }
    }

    // FINAL check
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
