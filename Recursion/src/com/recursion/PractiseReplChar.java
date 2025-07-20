package com.recursion;

class RepCha{
	public static String repC(String s,int index) {
		if(index<0) {
			return "";
		}
		if(s.charAt(index)=='x') {
			return repC(s,index-1)+"y";
		}
		else {
			return repC(s,index-1);
		}
	}
}
public class PractiseReplChar {
	public static void main(String[] args) {
		String s="xeroxx";
		System.out.println(ReplaceChar.repChar(s,s.length()-1));

	}

}
