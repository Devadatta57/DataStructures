package com.recursion;

class AddStar{
	public static String addS(String s) {
		if(s==null ||s.length()<=1) {
			return s;
		}
		else {
			return s.charAt(0)+"*"+addS(s.substring(1));
		}
	}
}
public class AdjCharSepbyStar {
	public static void main(String[] args) {
	 System.out.println(AddStar.addS("abcd"));

	}
}
