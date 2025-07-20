package com.programs;

class Swap{
	public static void doswap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b+" after swapping");
	}
}
public class SwapUsingTemp {

	public static void main(String[] args) {
		int a=23;
		int b=10;
		System.out.println("before swapping "+a+ " "+b);
		Swap.doswap(a,b);

	}

}
