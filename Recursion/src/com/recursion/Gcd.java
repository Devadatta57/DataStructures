package com.recursion;

class GcdCalc{
	public static int gcd(int a,int b) {
		while(a!=b) {
			if(a>b) {
				return gcd(a-b,b);
			}
			else {
				return gcd(b,b-a);
			}
		}
		return a;
	}
}
public class Gcd {
	public static void main(String[] args) {
		System.out.println(GcdCalc.gcd(4,6));
	}
}
