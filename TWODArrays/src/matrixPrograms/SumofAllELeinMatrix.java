package matrixPrograms;

import java.util.Scanner;

class MatrixSum{
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
	
	public static int MatSum(int[][] a) {
		int sum=0;
           for(int i=0;i<a.length;i++) {
			  for(int j=0;j<a[i].length;j++) {
				  sum=sum+a[i][j];
			  }
		   }
           return sum;
	}
}
public class SumofAllELeinMatrix {
	public static void main(String[] args) {
		
		int[][] a=new int[3][3];
		MatrixSum.MatrixRead(a);
		
        int sum= MatrixSum.MatSum(a);
        System.out.println(sum);
      
	}
}
