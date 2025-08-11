package com.stringss;

import java.util.Arrays;

public class UpperToLowerViceVersa {
	public static void main(String[] args) {
            String s1="head ERA";
                String s2="";
            for(int i=0;i<s1.length();i++) {
            	char ch=s1.charAt(i);
            	if(ch>='a' && ch<='z') {
            		ch=(char)(ch-32);
            	}
            	else if(ch>='A' && ch<='Z') {
            		ch=(char)(ch+32);
            	}
            	s2=s2.concat(ch+"");
            }
  	       System.out.println(s2);

           
	}
}
