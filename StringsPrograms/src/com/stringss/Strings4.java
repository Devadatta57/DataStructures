package com.stringss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings4 {
	public static void main(String[] args) {
    
       // Pattern p = Pattern.compile("a");
       // Pattern p = Pattern.compile("a*");
	      //  Pattern p = Pattern.compile("a+");
	      // Pattern p = Pattern.compile("a?");
	      //  Pattern p = Pattern.compile("a{3}");

	        Pattern p = Pattern.compile("a{3,5}");

		
      Matcher m = p.matcher("aaaabaaaaa");
      int c=0 ;
      while(m.find()) {
    	  System.out.println(m.start()+" ===> "+m.end()+" ====> "+m.group());
    	  c++;
      }
      System.out.println(c +" ");
	}
}
