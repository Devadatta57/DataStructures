package com.recursion;

class NnaturalRev{
	public static void print(int n) {
		if(n>=1) {
		print(n-1);
		System.out.print(n+" ");
		}

	}
}
public class nnaturalNosRever {
	public static void main(String[] args) {
		NnaturalRev.print(5);

	}
}
