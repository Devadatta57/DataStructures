package com.recursion;

class RevStr{
	public static String revS(String s) {
		if(s==null ||s.length()<=1) {
			return s;
		}
		else {
			return revS(s.substring(1))+s.charAt(0);
		}
	}
}
public class ReverseOfString {
	public static void main(String[] args) {
	 System.out.println(RevStr.revS("abcd"));

	}
}
