package com.recursion;

class Fact{
	public static int factN(int n) {
		if(n==1 || n==0) {
			return 1;
		}else if(n<0) {
			return -1;
		}
		else {
			return n*factN(n-1);
		}
	}
}
public class Factorial {
	public static void main(String[] args) {
		int res=Fact.factN(-8);
        System.out.println(res);
	}

}
