package com.track;

import java.util.Arrays;

class BackTrackArrays{
	 
	public static void ChangeArray(int[] a,int index,int value) {
	if(index==a.length) {
	    System.out.println(Arrays.toString(a));
		return;
	}
		a[index]=value;
		ChangeArray(a, index+1, value+1);
		a[index]=a[index]-2;
	}
}
public class InArrays {

	public static void main(String[] args) {
      int[] a=new int[5];
      
      BackTrackArrays.ChangeArray(a,0,1); 
      System.out.println(Arrays.toString(a));
      
      
	}
}
