package ArrayPrograms2;

import java.util.Scanner;

class UpdateEle{
	public static int[] updateElem(int[] a,int ele,int y) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
		    if(a[i]==ele) {
		    	b[i]=y;
		    }
		    else {
		    	b[i]=a[i];
		    }
		}
		return b;
	}
	public static int foundC(int[] a,int ele) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele)
				count=count+1;
		}
		return count;
	}
}
public class UpdatingElementBasedOnELem {
	public static void main(String[] args) {
		int[] a= {12,12,232,431,4};

		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter ele");
		   int ele=sc.nextInt();
		   
		   int count=UpdateEle.foundC(a,ele);
		   if(count>0) {
		    int[] c=UpdateEle.updateElem(a, ele,89);
		    for(int i=0;i<a.length;i++) {
				System.out.print(c[i]+" ");
			}
		   }
		   else{
			  System.out.println("not found");
		   }
		
	}
}
