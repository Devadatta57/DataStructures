package com.recursion;

class Nnatural{
	public static void print(int n) {
		if(n>=1) {
			System.out.print(n+" ");
			print(n-1);
		}
	}
}
public class nnaturalNos {
	public static void main(String[] args) {
		Nnatural.print(3);

	}
}
