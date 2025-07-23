package ReversalAlg;

import java.util.Scanner;


class LRotate{
	     public static void ArrayRead(int[] a) {
		       Scanner sc=new Scanner(System.in);
		       System.out.println("Enter array:");
		
		       for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();	
		       }
	    }

	   public static int[] LRotate(int[] a,int s,int e) {
		while(s<e) {
			int temp=a[s];
			a[s]=a[e];
			a[e]=temp;
			s++;
			e--;
		}
		
		return a;
	}

	   public static void ArrayWrite(int[] a) {		
		   for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
		   }
	   }

	}

public class LeftRotation {
	public static void main(String[] args) {
         int[] a=new int[5];
         int r=2;
         r=r%a.length;
         LRotate.ArrayRead(a);
         LRotate.ArrayWrite(a);
         LRotate.LRotate(a, 0, r-1);
         LRotate.LRotate(a, r, a.length-1);
         LRotate.LRotate(a, 0, a.length-1);
		System.out.println();

         LRotate.ArrayWrite(a);

	}
}
