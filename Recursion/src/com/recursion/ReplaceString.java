package com.recursion;
class ReplaceStr{
	public static String replaceS(String s,int index) {
		if(index<1) {
			return s;
		}
		if(s.substring(index-1,index+1).equals("pi")){
		//	System.out.println(s.substring(index-1,index+1)+" 1st if");
			 String newstr= s.substring(0, index-1)+"3.14"+s.substring(index+1);
			 return replaceS(newstr,index-2);
			 
		}
		else {
			return replaceS(s, index-1);
		}
	} 
}                                              
public class ReplaceString {
	public static void main(String[] args) {
		String s="xpipix";
		String res=ReplaceStr.replaceS(s,s.length()-1);
		System.out.println(res);
	}
}
