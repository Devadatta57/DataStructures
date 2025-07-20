package ArraysPrograms;

import java.util.Arrays;

class ArraySortHalf{
	
	public static int[] sortAsc(int[] a) {
		int n=a.length-1;
		System.out.println(n+ " "+n/2);
	    Arrays.sort(a,0,n/2);//0 to (n/2-1)
	    Arrays.sort(a,n/2,n+1);//0 to (n)
	    return a;
	}
}
public class ArraySortingAscHalfHalf {
	public static void main(String[] args) {
     int a[]=new int[5];
     a=new int[] {142,42,121,34,78};
     
     //not all sorted by taking half portion and sorted 
     
     int[] b=ArraySortHalf.sortAsc(a);
     for(int i=0;i<b.length;i++){
    	 System.out.print(b[i]+" ");	
	 }
     
    
     
	}
}
