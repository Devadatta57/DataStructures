package com.stringss;

import java.util.Arrays;
import java.util.StringTokenizer;

//public class Tokenizer {
//	public static void main(String[] args) {
//            String s1="heart is vital";
//           StringTokenizer st= new StringTokenizer(s1);
//           System.out.println(st.countTokens());
//
//           while(st.hasMoreTokens()) {
//        	   System.out.println(new StringBuffer(st.nextToken()).reverse());
//   
//           }
//           
//	}
//}

public class Tokenizer {
	public static void main(String[] args) {
            String s1="heart is vital";//0 1 2 
           StringTokenizer st= new StringTokenizer(s1);
           System.out.println(st.countTokens());
           System.out.println(s1);
            int i=0;
           while(st.hasMoreTokens()) {
        	   if(i%2==0) {
        	   System.out.print(new StringBuffer(st.nextToken()).reverse()+" ");
        	   }
        	   else {
        		   System.out.print(st.nextToken()+" ");
        	   }
        	   i++;
   
           }
           
	}
}
