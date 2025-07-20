package com.recursion;


class NDigits{
	static int c=0;

	public static int ndig(int n) {
		if(n!=0) {
			c++;
			ndig(n/10);
		}
		return c;
	}
}
public class NoOfDigCounts {
	public static void main(String[] args) {
	int res=NDigits.ndig(1234);
	System.out.println(res);
	}
}
