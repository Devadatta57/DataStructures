package com.track;

class Grid{
	public static int GridWays(int i ,int j,int n ,int m) {
		if(i==n-1 && j==m-1)
			return 1;
		else if(i==n || j==m)
			return 0;
		int value1=GridWays(i+1, j, n, m);
		int value2=GridWays(i, j+1, n, m);
		return value1+value2;
		
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
