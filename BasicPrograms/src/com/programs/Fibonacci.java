package com.programs;

class Fibo{
	 public static void fibo_n(int n) {
		 int a=0; int b=1;
		 System.out.print(a+" "+b+" ");
		 for(int i=2;i<=n;i++) {
			 int c=a+b;
			 System.out.print(c+" ");
			 a=b;
			 b=c;
		 }
	 }
      public static int fibo_rec(int n) {
    	 if(n==0)
    		 return 0;
    	 else if(n==1)
    		 return 1;
    	 else
    		 return fibo_rec(n-1)+fibo_rec(n-2);
	  }
}
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Fibo.fibo_n(5);
      int n=5;
      System.out.println();
      for(int i=0;i<=n;i++) {
      System.out.print(Fibo.fibo_rec(i)+" ");
      }
	}

}
