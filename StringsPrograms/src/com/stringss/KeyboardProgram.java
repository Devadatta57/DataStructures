package com.stringss;

import java.util.Scanner;

public class KeyboardProgram {

	public static void main(String[] args) {
       //word from same row returns true else false
		String s1="qwertyuiop";
		String s2="asdfghjkl";
		String s3="zxcvbnm";
		
		Scanner sc=new Scanner(System.in);
		
		int r1=0;
		int r2=0;
		int r3=0;
		
		System.out.println("enter string");
		String s=sc.nextLine().toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			String t=s.charAt(i)+"";
		    if(s1.contains(t)){
		    	r1++;
		    }
		     if(s2.contains(t)) {
		    	r2++;
		    }
		    if(s3.contains(t)){
		    	r3++;
		    }
		}
		
		//if word from same row returns true
//		if(r1==s.length() || r2==s.length() || r3==s.length()) {
//			System.out.println("true");
//		}else{
//			System.out.println("false");
//		}
		
		//if word from every row
		if(r1>0 && r2>0 && r3>0) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
	}

}
