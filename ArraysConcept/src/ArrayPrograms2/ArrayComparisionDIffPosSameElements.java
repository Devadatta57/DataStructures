package ArrayPrograms2;

import java.util.Arrays;

//at same position same element comp
class ArrayCompa{
	public static boolean ArraysC(int[] a,int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
}
public class ArrayComparisionDIffPosSameElements {
	public static void main(String[] args) {
		boolean res=ArrayCompa.ArraysC(new int[] {12,23,34},new int[] {12,34,23});

		System.out.println(res);


	}
}
