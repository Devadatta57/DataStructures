package TempArray;

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
	int n=a.length;
	int[] temp=new int[a.length];
	
	//store r rotations in temp array
	for(int i=0;i<r;i++) {
		temp[i]=a[i];
	}
	
	//swapping values in array
	for(int i=r;i<a.length;i++) {
		a[i-r]=a[i];
	}
	
	//copying temp array values to array
	for(int i=0;i<r;i++) {
		a[i+n-r]=temp[i];
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
       int[] c= LRotate.LRotate(a,2);
		System.out.println();

       for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
	}
	}

}
