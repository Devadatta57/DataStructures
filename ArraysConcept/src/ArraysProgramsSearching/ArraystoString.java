package ArraysProgramsSearching;

import java.util.Arrays;
import java.util.Scanner;

//Arrays.toString:prints the elements inside the array not ref  
public class ArraystoString {
	public static void main(String[] args) {
	int[] a=new int[7];
	a=new int[] {12,45,54,43,23,67};
	
       Arrays.sort(a);
       
       System.out.println(Arrays.toString(a));

	
	}
}
