package ArraysPrograms;

import java.util.Arrays;
//123456
//first index as it is then swap  adj elements 
class ArrayWav{
	public static void  smallHigh(int[] a) {
		System.out.print(a[0]+" ");
		int n=a.length;
		for(int i=1;i<n-1;i=i+2) {//works when n is odd
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			System.out.print(a[i]+" "+a[i+1]+" ");
		}
		if(n%2==0) {//if n is even last index print 
		System.out.println(a[n-1]);
		}
	}
}
public class ArrayWave {
	public static void main(String[] args) {
		 int a[]=new int[5];
	     a=new int[] {1,2,3,4,5};
	     
	     Arrays.sort(a);
	     
	     ArrayWav.smallHigh(a);
	     

	}
}
