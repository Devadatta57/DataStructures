package com.recursion;

class RemSpecChar{
	public static String remSpeChar(String s) {
		if(s==null || s.length()<=1) {
			return s;
		}
		else {
			if(s.charAt(0)!='x') {
				return s.charAt(0)+remSpeChar(s.substring(1));
			}
			else {
				return remSpeChar(s.substring(1));
			}
		}
	}
}
public class RemSpecCharacter {
	public static void main(String[] args) {
	System.out.println(RemSpecChar.remSpeChar("xaxbxcxd"));

	}
}
