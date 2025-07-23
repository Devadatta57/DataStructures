package ReversalAlg;

import java.util.Scanner;


class RRotate{
	     public static void ArrayRead(int[] a) {
		       Scanner sc=new Scanner(System.in);
		       System.out.println("Enter array:");
		
		       for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();	
		       }
	    }

	   public static int[] RRotate(int[] a,int s,int e) {
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

public class RightRotation {
	public static void main(String[] args) {
         int[] a=new int[5];
         int r=1;
         r=r%a.length;
        RRotate.ArrayRead(a);
        RRotate.ArrayWrite(a);
        RRotate.RRotate(a, 0, a.length-1);
        RRotate.RRotate(a, 0, r-1);
        RRotate.RRotate(a, r, a.length-1);

		System.out.println();

         RRotate.ArrayWrite(a);

	}
}
