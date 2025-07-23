package RotationUsingTempVar;

import java.util.Scanner;


class RRotation{
     public static void ArrayRead(int[] a) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter array:");
	
	       for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
	       }
    }

   public static int[] RRotate(int[] a,int r) {
	for(int i=0;i<r;i++) {
		int temp=a[a.length-1];
		for(int j=a.length-1;j>0;j--){	
			a[j]=a[j-1];
		
		}
		a[0]=temp;
	}
	return a;
}

   public static void ArrayWrite(int[] a) {		
	   for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	   }
   }

}
public class RightRotation {
	public static void main(String[] args) {
		int[] a=new int[5];
        RRotation.ArrayRead(a);
        RRotation.ArrayWrite(a);
       int[] c= RRotation.RRotate(a,1);
		System.out.println();

       for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
	}
	}
}
