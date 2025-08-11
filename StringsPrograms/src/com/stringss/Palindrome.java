package com.stringss;

public class Palindrome {
	public static void main(String[] args) {
        String s="dgeved";
        String s1=new StringBuffer(s).reverse().toString();
        if(s.equals(s1)) {
        	System.out.println("palindrome");
        }
        else {
        	System.out.println("not");
        }
	}
}
