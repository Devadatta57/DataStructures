package com.stringss;

public class StringVowelsAndConsonants {

	public static void main(String[] args) {
		String s = "weras";
		int vCount=0;int cCount=0;

//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//				vCount++;
//		      	System.out.println(s.charAt(i));
//			}
//           
//		}
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')) {
				cCount++;
		      	System.out.println(s.charAt(i));
			}
           
		}
      	System.out.println(cCount);

	}
}
