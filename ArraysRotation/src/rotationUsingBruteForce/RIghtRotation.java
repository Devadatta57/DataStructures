package rotationUsingBruteForce;

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
    		int prev=a[a.length-1];
    		for(int j=0;j<a.length;j++) {
    			int temp=a[j];
    			a[j]=prev;
    			prev=temp;
    		}
    	}
    	return a;
    }
    
    
    public static void ArrayWrite(int[] a) {		
		for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
		}
    }
    
}
public class RIghtRotation {

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
