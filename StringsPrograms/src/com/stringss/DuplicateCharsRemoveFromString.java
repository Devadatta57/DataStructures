package com.stringss;

import java.util.Arrays;

public class DuplicateCharsRemoveFromString {
	public static void main(String[] args) {
            String s1="heaghghghrwe";
            String d="";
            for(int i=0;i<s1.length();i++) {
            	String ch=s1.charAt(i)+"";
            	if(d.indexOf(ch)<0) {
            		d=d.concat(ch);
            	}
            }
	       System.out.println(d);
           
	}
}
