package com.track;

class Permutationsfinding{
	public static  void findPermu(String s,String ans) {
		
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			char curr=s.charAt(i);
			
			String ns=s.substring(0,i)+s.substring(i+1);
			findPermu(ns, ans+curr);
		}
		
	}
}
public class FindPermutations {

	public static void main(String[] args) {
		String s="abc";
		String ans="";
		Permutationsfinding.findPermu(s, ans);

	}

}
