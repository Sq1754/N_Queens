import java.util.ArrayList;
import java.util.List;

public class N_Queens {
//Q-> Print all solution where Queens are safe 
	/*
	 * NxN board with N queens
	 * */
	
	
  public static boolean isSafe(int row,int col, char[][]board) {
	  
	  // Horizontal checking
	  for (int j=0;j<board.length;j++) {
		  if(board[row][j]=='Q') {
			  return false;
		  }
	  }
	  
	  // Vertical checking
	  for(int i=0;i<board.length;i++) {
		  if(board[i][col]=='Q') {
			  return false;
		  }
	  }
	  
	  // UpperLeft (diagonally)
	  int r = row;
	  for(int c = col;c>=0 && r>=0;r--,c--) {
		  if(board[r][c]=='Q') {
			  return false;
		  }
	  }
	  
	  //UpperRight
	  r = row;
	  for(int c = col;c<board.length && r>=0;c++,r--) {
		  if(board[r][c]=='Q') {
			  return false;
		  }
	  }
	  
	  // LowerLeft
	  r=row;
	  for(int c = col;c>=0 && r<board.length;c--,r++) {
		  if(board[r][c]=='Q') {
			  return false;
		  }
	  }
	  
	  //LowerRight
	  r=row;
	  for(int c = col;c<board.length && r<board.length;c++,r++) {
		  if(board[r][c]=='Q') {
			  return false;
		  }
	  }
	  
	  return true;
  }
  
    public static void saveBoard(char[][]board, List<List<String>>allBoards) {
    	String row ="";
    	List<String> newBoard = new ArrayList<>();
    	for(int j = 0; j<board.length;j++) {
    		row = "";
    		for(int i =0; i<board[0].length;i++) {
    			if(board[i][j]=='Q') {
    				row += 'Q';
    			}
    			else {
    				row += ".";
    			}
    			
    		}
    		newBoard.add(row);
    		
    	}
    	allBoards.add(newBoard);
    }
    
      public static void helper(char[][]board,List<List<String>>allBoards,int col) {
    	  if(col==board.length) {
    		  saveBoard(board,allBoards);
    		  return;
    	  }
    	  for(int row =0; row<board.length;row++) {
    		  if(isSafe(row,col,board)) {
    			  board[row][col]='Q';
    			  helper(board,allBoards,col+1);
    			  board[row][col]='.';
    		  }
    	  }
      }
      
      public static List<List<String>>solveNQueens(int n){
    	  List<List<String>> allBoards = new ArrayList<>();
    	  
    	  char[][]board = new char[n][n];
    	  helper(board,allBoards,0);
    	  return allBoards;
      }
      
      public static void main(String[]args) {
    	  
    		System.out.println(solveNQueens(4));
    	   }  
 
}


