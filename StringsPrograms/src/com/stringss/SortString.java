package com.stringss;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String s = "weras";
	    char[] ch=s.toCharArray();
	    Arrays.sort(ch);
	    String s1= new String(ch);
      	System.out.println(s1);

	}
}
