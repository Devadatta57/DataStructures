package ArrayPrograms2;

import java.util.Arrays;
import java.util.Scanner;

class ArrayDE{
	public static int[] ArrayD(int[] a,int element,int count) {
		
		int[] b=new int[a.length-count];
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				continue;
			}
			b[index++]=a[i];
		}
			return b;
	}
	public static int  FoundC(int[] a,int ele) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				count=count+1;
			}
		}
		return count;
	}

}
public class DeletingAnELe {
	public static void main(String[] args) {
  
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter element");
   int ele=sc.nextInt();
   int[] a={121,12,34,23,121,121};
   
   
   int count=ArrayDE.FoundC(a, ele);
   System.out.println(count);
   if(count>0) {
	   int[] c=ArrayDE.ArrayD(a,ele,count);
	   for(int i=0;i<c.length;i++) {
		   System.out.print(c[i]+" ");
	   }
   }
   else {
	   System.out.print("not found");
   }

  
   

   
   
	
	}
}
