package RotationUsingTempVar;

import java.util.Scanner;


class LRotate{
     public static void ArrayRead(int[] a) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter array:");
	
	       for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
	       }
    }

   public static int[] LRotate(int[] a,int r) {
	r=r%a.length;
	for(int i=0;i<r;i++) {
		int temp=a[0];
		for(int j=0;j<a.length-1;j++) {	
			a[j]=a[j+1];
		
		}
		a[a.length-1]=temp;
	}
	return a;
}

   public static void ArrayWrite(int[] a) {		
	   for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	   }
   }

}
public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
        LRotate.ArrayRead(a);
        LRotate.ArrayWrite(a);
       int[] c= LRotate.LRotate(a,1);
		System.out.println();

       for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
	}
	}

}
