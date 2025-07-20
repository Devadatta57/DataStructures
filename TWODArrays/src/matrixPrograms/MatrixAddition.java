package matrixPrograms;

import java.util.Scanner;

class Matrix1{
	public static void MatrixRead(int[][] a,int[][] b) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter matrix a:");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter : "+i+j);
				a[i][j]=sc.nextInt();
			}
		}
		
         System.out.println("Enter b matrix:");
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("Enter :"+i+j);
				b[i][j]=sc.nextInt();
			}
		}
			
		
	}
	
	public static void  MatrixWrite(int[][] a,int[][] b){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	
		
		
	}
	
	public static int[][] add(int[][] a,int[][] b){
		int[][] c=new int[a.length][b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
}
public class MatrixAddition {
	public static void main(String[] args) {
      int sizer1=3;
      int sizec1=3;
      
      int sizer2=3;
      int sizec2=6;
      
      int[][] a=new int[sizer1][sizec1];
	  int[][] b=new int[sizer2][sizec2];
      
	  Matrix1.MatrixRead(a, b);
	  Matrix1.MatrixWrite(a, b);
	  
	  if(sizer1==sizec2) {
	    int[][]c= Matrix1.add(a, b);
	    System.out.println("add :");
		  
		 for(int i=0;i<c.length;i++) {
				for(int j=0;j<c[i].length;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
	  }
	  else {
		  System.out.println("not possible");
	  }
	  
	  
	
	
	  
      
		
	}
}
