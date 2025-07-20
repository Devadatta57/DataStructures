package com.recursion;

class CountEachCha{
	public static int countAll(String s,int index) {
		if(index<0) {
			return 0;
		}
		else {
			return 1+countAll(s,index-1);
		}
	
	}
}
public class NumberOfChar {

	public static void main(String[] args) {
		String s="abbcd";
		int res=CountEachCha.countAll(s,s.length()-1);
		System.out.println(res);


	}

}
