package ArraysProgramsSearching;

import java.util.Arrays;

class BinaryS{
	public static int binary(int[] a,int key){
		int low=0;
		int high=a.length-1;
		
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
public class BinarySearch {
	public static void main(String[] args) {
	int[] a=new int[7];
	a=new int[] {12,32,54,43,23,67};
	
       Arrays.sort(a);
      System.out.println(BinaryS.binary(a,54));
	
	}
}
