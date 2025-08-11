package com.stringss;


public class Strings1 {
	public static void main(String[] args) {
 
		//constructors in string class
		
		 String s = new String();
		 System.out.println(s.isEmpty());
		 System.out.println(s.length());
		 
		 String s1 = new String("deva");
		 System.out.println(s1.isEmpty());
		 System.out.println(s1.length());

		 char[] ch = {'d','e','v','a'};
		 String s2 = new String(ch);
		 System.out.println(s2);
		 
		 String s3 = new String(ch,2,2);
		 System.out.println(s3);
		 
		 
		 byte[] b= {12,3,2,102,23,90};//ascii
		 String s4 = new String(b);
		 System.out.println(s4);
		 

          StringBuffer s5 = new StringBuffer("abc");
          String s6 = new String(s5);
          System.out.println(s5);
          System.out.println(s6);
          
          StringBuffer s7 = new StringBuffer("uip");
          String s8 = new String(s7);
          System.out.println(s7);
          System.out.println(s8);
	}
}
