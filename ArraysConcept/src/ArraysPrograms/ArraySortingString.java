package ArraysPrograms;

import java.util.Arrays;

class ArraySortString{
	
	public static void sortAsc(String[] s) {
	   Arrays.sort(s);
	}
	
	public static void sortAsc2(char[] c) {
		   Arrays.sort(c);
		   for(char c1:c) {
		    	 System.out.print(c1+" ");
		     }
	}
}
public class ArraySortingString {
	public static void main(String[] args) {
    String[] s=new String[5];
    s=new String[] {"deva","datta","ch"};
    
     ArraySortString.sortAsc(s);
     for(String s1:s) {
    	 System.out.println(s1);
     }
    
     String l="devadatta ch";
     l=l.replace(" ","");
     char[] c=l.toCharArray();
    
     ArraySortString.sortAsc2(c);
     
	}
}
