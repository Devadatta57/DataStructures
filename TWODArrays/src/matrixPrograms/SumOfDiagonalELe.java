package matrixPrograms;

import java.util.Scanner;

class DiagonalSum{
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
	
	public static void  MatrixWrite(int[][] a){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int  DiagonalSum(int[][] a){
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					sum=sum+a[i][j];
				}
			}
		}
		return sum;
	}
}
public class SumOfDiagonalELe {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
             DiagonalSum.MatrixRead(a);
             DiagonalSum.MatrixWrite(a);
             int sum=DiagonalSum.DiagonalSum(a);
             
             System.out.println(sum);
		
	}
}
