package matrixPrograms;

import java.util.Scanner;

class Identity{
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
	
	public static boolean MatrixIdentity(int[][] a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter matrix a:");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i!=j && a[i][j]!=0) {
					return false;
				}
				if(i==j && a[i][j]!=1) {
					return false;
				}
			}
		}
		return true;
		
		}
}
public class IdentityMatrix {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		
         Identity.MatrixRead(a);
         boolean result=Identity.MatrixIdentity(a);
         System.out.println(result);
	}
}
