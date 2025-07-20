package com.recursion;


class Fibo{
	public static int fibon(int n) {
		if(n==0 ||n==1) {
			return n;
		}
		else {
			return fibon(n-1)+fibon(n-2);
		}
	}
}
public class fibonacciSeries {
	public static void main(String[] args) {
     int res=Fibo.fibon(10);
     System.out.println(res);
	}
}
