package ArrayPrograms2;

import java.util.Arrays;

//at same position same element comp
class ArrayCompar{
	public static boolean ArraysC(int[] a,int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		boolean res=Arrays.equals(a,b);
		return res;
	}
}
public class ArrayComparisionDIffPosSameElementsUsingPredefinedMethod {
	public static void main(String[] args) {
		boolean res=ArrayCompar.ArraysC(new int[] {12,23,34,66},new int[] {12,34,23});

		System.out.println(res);


	}
}
