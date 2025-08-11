package com.stringss;

import java.util.Arrays;
import java.util.StringTokenizer;


public class TokenizerFirstLetterCapital {
	public static void main(String[] args) {
            String s1="heart is vital";//0 1 2 
           StringTokenizer st= new StringTokenizer(s1);
         
           while(st.hasMoreTokens()) {
        	   String s=st.nextToken(); 
               int n=s.length();
        	   //first letter in word capital
        	  // System.out.print(s.substring(0,1).toUpperCase()+s.substring(1)+" ");
         	//first and last capital
               //  System.out.print(s.substring(0,1).toUpperCase()+s.substring(1,n-1)+s.substring(n-1,n).toUpperCase()+" ");
               //all capitals except first and last
             System.out.print(s.substring(0,1)+s.substring(1,n-1).toUpperCase()+s.substring(n-1,n)+" ");

               
           }
          
           
	}
}
