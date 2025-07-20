package matrixPrograms;

import java.util.Scanner;

//swap row 1 and 3
class SwapTwoCols{
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
	
	public static void MatrixCol1and2(int[][] a,int m,int n){
		for(int i=0;i<a.length;i++) {
			int temp=a[i][m-1];
			a[i][m-1]=a[i][n-1];
			a[i][n-1]=temp;
		}
		System.out.println();
	}
}
public class SwappingTwoColmns {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		
        SwapTwoCols.MatrixRead(a);
        SwapTwoCols.MatrixWrite(a);
        SwapTwoCols.MatrixCol1and2(a,1,2);
        SwapTwoCols.MatrixWrite(a);
	}
}
