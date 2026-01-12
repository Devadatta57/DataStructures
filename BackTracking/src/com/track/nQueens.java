package com.track;

class Queens{
	static int count=0;
     public static void PrintBoard(char[][] board) {
    	 for(int i=0;i<board.length;i++) {
 			for(int j=0;j<board.length;j++) {
 				System.out.print(board[i][j]+" ");
 			}
 			System.out.println();
 		}
			System.out.println();
     }
     
     public static void SolvingQueens(char[][] board,int row) {
    	 if(row==board.length) {
    		 count++;
    		 PrintBoard(board);
    		 return;
    	 }
    	 for(int j=0;j<board.length;j++){
    		 if(isSafe(board,row,j)) {
    			 board[row][j]='Q';    		
    			 SolvingQueens(board,row+1);
    			 board[row][j]='x';//if isSafe true and put quee while recursion 
    			 // if isSafe fails then that queen placed  is repalced with 'x'
    			 
    		 }
    	   		 //if isSafe false move to nxt column
    	 }
     }

	 static boolean isSafe(char[][] board, int row, int col) {
	     //vertically up
		 for(int i=row-1;i>=0;i--) {
			 if(board[i][col]=='Q')
				 return false;
		 }
		 //diagonal left-up
		 for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			 if(board[i][j]=='Q')
				 return false;
		 }
		 //diagonal right-up
		 for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
			 if(board[i][j]=='Q')
				 return false;
		 }
		
		return true;
	}
}
public class nQueens {
	public static void main(String[] args) {
		int n=4;
		char[][] board=new char[n][n];
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				board[i][j]='x';
			}
		}
		
		Queens.SolvingQueens(board,0);
		System.out.println(Queens.count);

	}
}
