package com.programs;

import java.util.Scanner;

class Natural{
	public static int findnUsingformula(int start,int end) {
		
		if(start==1) {
			return end*(end+1)/2;
		}
		else {
			//this is not for sum of n,for m to n
			int f=(end*(end+1)/2)-(((start-1)*start)/2);
			return f;
		}
	}
	
	public static int findn_rec(int n) {
		if(n==0) {
			return 0;
		}
			else {
				return n+findn_rec(n-1);
			}
		
	}
	public static int findn_usingloop(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i; 
		}
		return sum;
	}
  
}
public class SumofNnatural {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
//      System.out.println("enter start:");
//      int start=sc.nextInt();
//      System.out.println("enter end:");
//      int end=sc.nextInt();
//     int ans= Natural.findnUsingformula(start,end);
//     System.out.println(ans);
     int n=10;
     int res=Natural.findn_rec(n);
     System.out.println(res+" using recursion");
     int res1=Natural.findn_usingloop(n);
     System.out.println(res1+" using loop");
	}
}
