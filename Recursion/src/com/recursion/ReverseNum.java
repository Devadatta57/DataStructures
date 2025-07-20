package com.recursion;
class Reverse{
	public static int reverse(int n,int length) {
		if(n==0) {
			return 0;
		}
		else {
			return n%10*(int)(Math.pow(10,length-1))+reverse(n/10,--length);
		}
	}
}
public class ReverseNum {

	public static void main(String[] args) {
		int n=156;
		String str=n+"";
		int length=str.length();
		int res=Reverse.reverse(n,length);
		
		System.out.println(res);

	}

}
