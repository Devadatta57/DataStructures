package ArrayPrograms2;

import java.util.Arrays;
import java.util.Scanner;

class ArrayD{
	public static int[] ArrayD(int[] a,int loc) {
		
		int[] b=new int[a.length-1];
		int index=0;
		
		for(int i=0;i<loc;i++) {
			b[index++]=a[i];
		}
		for(int j=loc+1;j<a.length;j++) {
			b[index++]=a[j];
		}
		return b;
	}
	
public static int[] ArrayD1(int[] a,int loc) {
		
		int[] b=new int[a.length-1];
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			if(i==loc) {
				continue;
			}
			b[index++]=a[i];
		}
		
		return b;
	}
}
public class DeletingAnELeAtGivenPos {
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter index");
   int loc=sc.nextInt();
   int[] a={12,34,23,121};
   if(loc<0 || loc>=a.length) {
	   System.out.println("index not found");
   }
   else {
//	   int[] c=ArrayD.ArrayD(a,loc);
	   int[] c=ArrayD.ArrayD1(a,loc);

	   for(int i=0;i<c.length;i++) {
		   System.out.print(c[i]+" ");
	   }
   }

   
   
	
	}
}
