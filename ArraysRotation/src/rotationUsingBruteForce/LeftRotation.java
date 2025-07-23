package rotationUsingBruteForce;

import java.util.Scanner;

class LRotation{
	
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
    		int prev=a[0];
    		for(int j=a.length-1;j>=0;j--) {
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
public class LeftRotation {
	public static void main(String[] args) {
		int[] a=new int[5];
         LRotation.ArrayRead(a);
         LRotation.ArrayWrite(a);
        int[] c= LRotation.LRotate(a,1);
		System.out.println();

        for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
	}
	}
}
