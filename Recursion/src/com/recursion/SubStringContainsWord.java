package com.recursion;

class SubStringW{
	 public static int CountSub(String s,int index) {
		 if(index<3) {
			 return 0;
		 }
		 if(s.substring(index-3,index+1).equals("very")) {
			 return 1+CountSub(s, index-4);
		 }
		 else{
			return CountSub(s, index-1); 
		 }
	 }
}
public class SubStringContainsWord {
	public static void main(String[] args) {
	String s="devadattaveryy is veryvery good girlvery";
       System.out.println(SubStringW.CountSub(s,s.length()-1));
	}
}
