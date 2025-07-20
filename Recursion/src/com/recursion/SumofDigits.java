package com.recursion;

class Sum{
	public static int sumDig(int n) {
		if(n==0) {
			return 0;
		}else {
			
			return n%10+sumDig(n/10);
		}
	}
}
public class SumofDigits {
	public static void main(String[] args) {
	 int res=Sum.sumDig(98);
	 System.out.println(res);
	}
}
