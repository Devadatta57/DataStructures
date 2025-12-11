package com.stringss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
class PatternMatch{
	public static void PatternM(String patternName,String regex,String input) {
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		int c=0;
		while(m.find()) {
			c++;
			System.out.print(m.group()+" ");
		}
		System.out.println(c+" "+patternName);
		System.out.println();
	}
}
public class Strings4 {
	public static void main(String[] args) {
		String input="who are you? ha! hello @1234? WHat";
		PatternMatch.PatternM("whitespace", "\\s", input);
		PatternMatch.PatternM("Non whitespace", "\\S", input);
		PatternMatch.PatternM("Digit", "\\d", input);
		PatternMatch.PatternM("Nondigit ", "\\D", input);
		PatternMatch.PatternM(" ", "\\w", input);
		PatternMatch.PatternM(" ", "\\W", input);
		PatternMatch.PatternM(" ", ".", input);
		PatternMatch.PatternM(" /", "[.]", input);
		PatternMatch.PatternM("userdefined class", "a+", input);
		PatternMatch.PatternM("userdefined class", "a*", input);

		PatternMatch.PatternM("userdefined class", "[are]", input);

		PatternMatch.PatternM("userdefined class", "are", input);
		PatternMatch.PatternM("userdefined class", "[^are]", input);


	}
}
//public class Strings4 {
	//public static void main(String[] args) {
    
       // Pattern p = Pattern.compile("a");
       // Pattern p = Pattern.compile("a*");
	      //  Pattern p = Pattern.compile("a+");
	      // Pattern p = Pattern.compile("a?");
	      //  Pattern p = Pattern.compile("a{3}");

	      //  Pattern p = Pattern.compile("a{3,5}");

		
//       Matcher m = p.matcher("aaaabaaaaa");
//       int c=0 ;
//       while(m.find()) {
//     	  System.out.println(m.start()+" ===> "+m.end()+" ====> "+m.group());
//     	  c++;
//       }
//       System.out.println(c +" ");
// 	}
// }
