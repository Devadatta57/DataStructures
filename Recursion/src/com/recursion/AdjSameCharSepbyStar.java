package com.recursion;

class SameCharStar{
	public static String charS(String s) {
		if(s==null ||s.length()<=1) {
			return s;
		}
		else {
			if(s.charAt(0)==s.charAt(1)) {
				return s.charAt(0)+"*"+charS(s.substring(1));
			}
			else {
				return s.charAt(0)+charS(s.substring(1));
			}
		}
	}
}
public class AdjSameCharSepbyStar {
	public static void main(String[] args) {
	 System.out.println(SameCharStar.charS("aabbcdde"));

	}
}
