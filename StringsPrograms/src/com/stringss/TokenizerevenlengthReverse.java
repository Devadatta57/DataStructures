package com.stringss;

import java.util.Arrays;
import java.util.StringTokenizer;


public class TokenizerevenlengthReverse {
	public static void main(String[] args) {
            String s1="heartu is vital";//0 1 2 
           StringTokenizer st= new StringTokenizer(s1);
         
           while(st.hasMoreTokens()) {
        	   String s=st.nextToken();
        	   if(s.length()%2==0) {
        		   System.out.print(new StringBuffer(s).reverse()+" ");
        	   }
        	   else {
            	   System.out.print(s+" ");

        	   }
        	   
           }
          
           
	}
}
