package com.track;
class SubSets{
	public static void findSubSets(String s,String ans,int index) {
		if(index==s.length()) {
			System.out.println(ans);
			return ;
		}
		findSubSets(s, ans+s.charAt(index), index+1);
		findSubSets(s, ans, index+1);

	}
}
public class SubSetsInString {
	public static void main(String[] args) {
         String s="abc";
         String ans="";
         SubSets.findSubSets(s, ans, 0);
	}
}
