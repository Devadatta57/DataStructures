package TempArray;

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
	r=r%a.length;
	int n=a.length;
	int[] temp=new int[a.length];
	int index=0;
	
	//store r rotations in temp array
	for(int i=n-r;i<a.length;i++) {
		temp[index++]=a[i];
		
	}
	
	//swapping values in array
	for(int i=a.length-1;i>=r;i--) {
		a[i]=a[i-r];
	}
	
	//copying temp array values to array
	for(int i=0;i<r;i++) {
		a[i]=temp[i];
	}
	
	return a;
}

   public static void ArrayWrite(int[] a) {		
	   for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	   }
   }

}
public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
