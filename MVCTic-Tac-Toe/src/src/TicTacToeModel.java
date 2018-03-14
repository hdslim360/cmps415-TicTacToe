
package src;


public class TicTacToeModel {
	public int board [][] = new int [4][4];
	private int X = 1;
	private int O = -1 ;
	private boolean winner;
	
	
	public TicTacToeModel(){
		X = 1;
		O = -1;
		winner = false;

	}
	
	public void newBoard(){
		for(int row = 0; row <= 4; row++) {
			for(int col = 0; col <=4; col++) {
				board[row][col] = 0;
			}
		}
	}

	public int startTurn() {
		System.out.println("so far so good");
		return 1;
	}
	
	public boolean checkWin(int play) {//this checks if there is winner. I is run after 3+ turns
		
		int horizontal = horizWin();
		int vertical = vertWin();
		boolean diag = diagWinO();

		if (play == 1) {
			if(horizontal == 4) {
				winner = true;
			}
			if(vertical == 4) {
				winner = true;
			}
			if (diag) {
				winner = true;
			}
		}else {
			winner = false;
		}
		
		if (play == -1) {
			if(horizontal == -4) {
				winner = true;
			}
			if(vertical == -4) {
				winner = true;
			}
			if (diag) {
				winner = true;
			}
		}else {
			winner = false;
		}
		return winner;
	}
	
	public int horizWin(){
      //Variable holds the "result" of hasWon. True if a winner was found.
      int retval = 0;
      //Check for horizontal win
      for( int row = 0; row < board.length; row++ ){
         
         for( int col = 0; col < board[0].length; col++ ){
            retval += board[row][col];
         }
         //Check to see if the sum of that row was 4 or -4
        
         }
	  
		return retval;
	}

	public int vertWin(){  
      //Check for vertical win
    	int retval = 0;
		for( int col = 0; col < board[0].length; col++ ){
         
        	for( int row = 0; row < board.length; row++ ){
        	retval += board[row][col];
         }
         //Check to see if the sum of that column was 3 or -3, a win...
        
      }
	  return retval;
	}

	public boolean diagWinX(){
		boolean retVal = false;
		
		if((board[0][0] + board[1][1] + board[2][2] + board[3][3]) == 4){
			retVal = true;}
			else if((board[0][3] + board[1][2] + board[2][1] + board[3][0]) == 4 ) {
         retVal = true;
	  }
		return retVal;
	}

	public boolean diagWinO (){
		boolean retVal = false;
		
		if( (board[0][0] + board[1][1] + board[2][2]) + board[3][3] == -4 ){
         
         retVal = true;
      } else if ( (board[0][3] + board[1][3] + board[2][1] + board[3][0]) == -4 ) {
         
         retVal = true;
	  }
      return retVal;
	}

	public boolean draw (){
		boolean retVal = false;
		//Check for cat game
      boolean foundSpace = false;
      for( int row = 0; row < board.length; row++ ){
         for( int col = 0; col < board[0].length; col++ ){
            if( board[row][col] == 0 ) 
               foundSpace = true;
         }
      }
      if( foundSpace == false ){
         retVal = true;
      }
	return retVal;
	}
	
	public boolean inputMove(int row, int col){
		boolean ableMove = false;
		if (findSpot(row, col) == 0){
			ableMove = true;
		}
		return ableMove;
	}

	public int findSpot(int row, int col){
		return  board[row][col];
	}
	
	public void placeBoard(int row, int col, int player) {
		board[row][col] = player;
		}


     
}

	

//TODO finish logic