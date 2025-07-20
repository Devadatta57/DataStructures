package matrixPrograms;

import java.util.Scanner;

//swap row 1 and 3
class SwapTwo{
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
	
	public static void  MatrixRow1and3(int[][] a,int m,int n){
		for(int i=0;i<a.length;i++) {
			int temp=a[m-1][i];
			a[m-1][i]=a[n-1][i];
			a[n-1][i]=temp;
		}
		System.out.println();
	}
}
public class SwappingTwoRows {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		
        SwapTwo.MatrixRead(a);
        SwapTwo.MatrixWrite(a);
        SwapTwo.MatrixRow1and3(a,1,3);
        SwapTwo.MatrixWrite(a);
	}
}
