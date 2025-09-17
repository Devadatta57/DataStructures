package com.track;

class SolvingSudoku{
	public static void printBoard(int[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static boolean SolveSudoku(int[][] board) {
	for(int row=0;row<board.length;row++) {
		for(int col=0;col<board.length;col++) {
			   if(board[row][col]==0) {
			        for(int num=1;num<=9;num++) {
					    if(isSafe(board,row,col,num)){
					    	board[row][col]=num;					
					           if(SolveSudoku(board)) {//recursion
						          return true;
					           }
					      board[row][col]=0;
			             }
			       
			        }
			   return false;
		}
	  }
	}
     return true;
	
	}

	public static boolean isSafe(int[][] board, int row, int col, int num) {
		//for row check
		for(int x=0;x<board.length;x++) {
			if(board[row][x]==num) {
				return false;
			}
		}
		
		//for columnwise check
		for(int x=0;x<board.length;x++) {
			if(board[x][col]==num) {
				return false;
			}
		}
		
		//for grid check
		 int startRow = row - row % 3;
	     int startCol = col - col % 3;
	     for(int row1=startRow;row1<startRow+3;row1++) {
	    	  for(int col1=startCol;col1<startCol+3;col1++) {
	 	    	 if(board[row1][col1]==num) {
	 	    		 return false;
	 	    	 }
	 	     }
	     }
		return true;
	}
		
}
public class Sudoku {
	public static void main(String[] args) {
		int[][] board= {
				 {5, 3, 0, 0, 7, 0, 0, 0, 0},
		            {6, 0, 0, 1, 9, 5, 0, 0, 0},
		            {0, 9, 8, 0, 0, 0, 0, 6, 0},
		            {8, 0, 0, 0, 6, 0, 0, 0, 3},
		            {4, 0, 0, 8, 0, 3, 0, 0, 1},
		            {7, 0, 0, 0, 2, 0, 0, 0, 6},
		            {0, 6, 0, 0, 0, 0, 2, 8, 0},
		            {0, 0, 0, 4, 1, 9, 0, 0, 5},
		            {0, 0, 0, 0, 8, 0, 0, 7, 9}
		};
		
		if(SolvingSudoku.SolveSudoku(board)) {
			System.out.println("solution found");
			SolvingSudoku.printBoard(board);
		}
		else {
			System.out.println("no solution");
		}
	}

}
