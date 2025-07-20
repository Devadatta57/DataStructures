package matrixPrograms;

import java.util.Scanner;
//opposite diagonals sum 
class OppDiagonalSum{
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
		int n=a.length;
		int sum=0;
		for(int i=0;i<a.length;i++) {
				sum=sum+a[i][n-i-1]+a[i][i];
		}
		return sum;
	}
}
public class SumOfOppDiagonalELe {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
             OppDiagonalSum.MatrixRead(a);
             OppDiagonalSum.MatrixWrite(a);
             int sum=OppDiagonalSum.DiagonalSum(a);
             
             System.out.println(sum);
		
	}
}
