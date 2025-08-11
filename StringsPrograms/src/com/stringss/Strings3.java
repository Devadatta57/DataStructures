package com.stringss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings3 {
	public static void main(String[] args) {
     // Pattern p = Pattern.compile("[0-9]");
	    //  Pattern p = Pattern.compile("\\s");
	    //  Pattern p = Pattern.compile("\\S");
	    //  Pattern p = Pattern.compile("\\d");
	     // Pattern p = Pattern.compile("\\D");

	      //Pattern p = Pattern.compile("\\w");
	    //  Pattern p = Pattern.compile("\\W");
	    //  Pattern p = Pattern.compile(".");

	    // Pattern p = Pattern.compile("abqr");
	    // Pattern p = Pattern.compile("[abqr]");
	   //  Pattern p = Pattern.compile("[^abqr]");
		   //	   //  Pattern p = Pattern.compile("[^abqr]");
//             Pattern p = Pattern.compile("[a-zA-Z0-9]");
        Pattern p = Pattern.compile("[^a-zA-Z0-9 ]");//also dont want space so include space


      Matcher m = p.matcher("a1b2cA 3d4f9#( 54534 5uhq r ");
      int c=0 ;
      while(m.find()) {
    	  System.out.println(m.start()+" ===> "+m.end()+" ====> "+m.group());
    	  c++;
      }
      System.out.println(c +" ");
	}
}
