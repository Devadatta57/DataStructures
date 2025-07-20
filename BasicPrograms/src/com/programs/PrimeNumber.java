package com.programs;

class Prime{
	public static boolean isPrime(int n) {
		boolean isPrime=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	public static void isPrimeRange(int start,int end) {
		for(int i=start;i<=end;i++) {
		boolean isPrime=true;
		
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}
}
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(Prime.isPrime(5));
		Prime.isPrimeRange(1,100);

	}

}
