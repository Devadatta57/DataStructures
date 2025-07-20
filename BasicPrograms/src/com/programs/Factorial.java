package com.programs;

class Fact{
	public static int factn(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
	       return fact;
	}
	public static int fact_rec(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n*fact_rec(n-1);
		}
	}
}
public class Factorial {
	public static void main(String[] args) {
		System.out.println(Fact.fact_rec(5));
		System.out.println(Fact.factn(5));
	}

}
