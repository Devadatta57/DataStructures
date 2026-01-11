package com.track;

class Grid{
	public static int GridWays(int i ,int j,int n ,int m) {
		if(i==n-1 && j==m-1)//if row and col reaches destination return 1 so one way
			return 1;
		else if(i==n || j==m)
			return 0;//if row or col goes out of grid even anyone return 0 path
		int value1=GridWays(i+1, j, n, m);//go down
		int value2=GridWays(i, j+1, n, m);//go right
		return value1+value2;//how many ways total from up and down 
		
	}
}
public class GridWaysfromFIsrtRowCOlToLastRowCol {
	public static void main(String[] args) {
          int m=2;
          int n=2;
          int res=Grid.GridWays(0,0,n,m);
          System.out.println(res);
          
	}
}
