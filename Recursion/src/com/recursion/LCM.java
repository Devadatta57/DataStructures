package com.recursion;

class lcmcalc{
	static int i=2;

	public static int dolcm(int n1,int n2) {
		if(i%n1==0 && i%n2==0) {
			return i;
		}
		else {
			i++;
			return dolcm(n1,n2);
		}
	}
}
public class LCM {
	public static void main(String[] args) {
		int res=lcmcalc.dolcm(4, 6);
		System.out.println(res);
	}
}
