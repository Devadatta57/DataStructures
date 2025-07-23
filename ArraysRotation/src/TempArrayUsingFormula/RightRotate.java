package TempArrayUsingFormula;

import java.util.Scanner;


class RRotate{
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
	
	//using formula
	for(int i=0;i<a.length;i++) {
		temp[(i+r)%n]=a[i];
	}
	
	
	//copying temp array values to array
	for(int i=0;i<n;i++) {
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
        RRotate.ArrayRead(a);
        RRotate.ArrayWrite(a);
       int[] c= RRotate.RRotate(a,2);
		System.out.println();

       for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
	}
	}

}
