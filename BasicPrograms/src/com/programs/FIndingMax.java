package com.programs;

class Max{
	public static int findmaxUsingMethod(int a,int b) {
		return Math.max(a, b);
	}
    public static int findmax(int a,int b) {
		 return (a>b)?a:b;
	}
}
public class FIndingMax {

	public static void main(String[] args) {
	int a=5;
	int b=1;
	int max1=Max.findmaxUsingMethod(a,b);
	int max2=Max.findmax(a,b);
	System.out.println(max1+" "+max2);
	}

}
