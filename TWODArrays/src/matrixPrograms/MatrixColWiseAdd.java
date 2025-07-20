package matrixPrograms;

import java.util.Scanner;

class MatrixColSum{
	
	public static void MatrixRead(int[][] a) {

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter matrix a:");
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.println("Enter : "+i+j);
			a[i][j]=sc.nextInt();
		}
	}
	}
	
	public static void Matcolsum(int[][] a) {
		int sum=0;
           for(int i=0;i<a.length;i++) {
        	   int sumi=0;
			  for(int j=0;j<a[i].length;j++) {
				  sumi=sumi+a[j][i];
			  }
			  System.out.print(sumi+" ");

		   }
           
	}
}
public class MatrixColWiseAdd {
	public static void main(String[] args) {
		           int[][] a=new int[3][3];
				
                   MatrixColSum.MatrixRead(a);
                   MatrixColSum.Matcolsum(a);
	}
}
