package com.recursion;

class PowerC{
	public static int PowerN(int a,int b) {
//		if(b==1){
//			return a;
//		}
//		else {
//			return a* PowerN(a,b-1);
//		}
		if(b>=1) {
			return a*PowerN(a, b-1);
		}
		else {
			return 1;
		}
	}
}
public class PowerCalcu {
   public static void main(String[] args) {
		int res=PowerC.PowerN(3, 2);
		System.out.println(res);
	}
}
