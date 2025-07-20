package matrixPrograms;

import java.util.Scanner;

class OppDiagonalInterchange{
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
	
	public static void  MatrixDiaInter(int[][] a){
		int n=a.length;
	     int temp=0;
		for(int i=0;i<a.length;i++) {
                 temp=a[i][i];
                a[i][i]=a[i][n-i-1];
                a[i][n-i-1]=temp;
			
		}
		System.out.println();
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
	
}
public class AdjDiagTranspose {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
        OppDiagonalInterchange.MatrixRead(a);
        OppDiagonalInterchange.MatrixWrite(a);
        OppDiagonalInterchange.MatrixDiaInter(a);
        OppDiagonalInterchange.MatrixWrite(a);
        
	}
}
