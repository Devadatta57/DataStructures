package com.programs;

class Swapping{
	public static void doswap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b+" after swapping");

	}
}
public class SwapUsingAddAndSub {
	public static void main(String[] args) {
    int a=3;
    int b=2;
	System.out.println("before swapping "+a+ " "+b);

    Swapping.doswap(a,b);
	}
}
