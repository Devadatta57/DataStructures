package ArrayPrograms2;

import java.util.Scanner;

class UpdateE{
	public static int[] updateElem(int[] a,int loc,int ele) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(i==loc) {
				b[i]=ele;
				System.out.println(ele);
			}else {
			b[i]=a[i];
			}
		}
		return b;
	}
}
public class UpdatingElementOnPos {
	public static void main(String[] args) {
		int[] a= {12,44,232,431,4};

		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter loc");
		   int loc=sc.nextInt();
		   if(loc>=0 && loc<=a.length-1) {
		        int[] c= UpdateE.updateElem(a,loc,34);
		         for(int i=0;i<c.length;i++) {
		        	 System.out.print(c[i]+" ");
		         }
		   }
		   else {
			   System.out.println("not found index");
		   }
		
	}
}
