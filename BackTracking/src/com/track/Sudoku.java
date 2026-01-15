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
						          return true;//if recursion returns true,returns true to its called recursion back cell else backtrack to previous cell and keep 0 
					           }
					      board[row][col]=0;
			             }
			       
			        }
			   return false;//if no number fits after trying all returns false to previous cell which called this recursion
		}
	  }
	}
     return true;//rteurns final output whether sudoku can be solved or not
	
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
		//why %3 to find the row index position in grid which 3-3 grid if 4-4 grid %4 likethat normal sudoku 3-3- grid
		// row%3 from grid start that row index where(eg index is from grid start 2-index ,1-index,0 index(grid start point))
		//row-row%3 gives  the row which is located at somewhere come to starting index of 3-3grid and loop until grid ends
		int startRow = row - row % 3; // %3 gives position inside 3-row block, subtract to reach block start
        int startCol = col - col % 3; // same logic for column (3-column block)
 
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
