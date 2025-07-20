package ArraysProgramsSearching;

import java.util.Arrays;

class BinaryV3{
	public static int binary(int[] a,int low,int high,int key){
		while(low<=high) {
			int mid=(low+high)/2;
		if(a[mid]==key) {
			return mid;
		}
		else if(a[mid]<key){
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		
		}
		return -1;
	} 
}
public class BinarySearchVersion3 {
	public static void main(String[] args) {
	int[] a=new int[7];
	a=new int[] {12,45,54,43,23,67};
	
       Arrays.sort(a);
       for(int i=0;i<a.length;i++) {
       System.out.print(a[i]+" ");
       }
       
       System.out.println();

      System.out.println(BinaryV3.binary(a,(a.length-1)/2,a.length-1,67));
	
	}
}
