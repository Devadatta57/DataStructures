package com.programs;

class findMaxi{
	public static int findm_usingif(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>c) {
			return b;
		}
		else {
			return c;
		}
	}
     public static int findm_func(int a,int b,int c) {
		     return Math.max(Math.max(a,b),c);
	  }
}
public class MaxofThreeNumb {
	public static void main(String[] args) {
		int res=findMaxi.findm_func(11, 43, 64);
		int res1=findMaxi.findm_func(11, 43, 64);
		System.out.println(res+" "+res1);

		
	}
}
