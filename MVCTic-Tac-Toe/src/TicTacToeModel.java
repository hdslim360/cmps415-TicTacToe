
package src;


public class TicTacToeModel {
	public int board [][] = new int [4][4];
	public int X;
	public int O;
	public boolean winner;
	
	
	public TicTacToeModel(){
		X = 1;
		O = -1;
		winner = false;
	}
	


	public int startTurn() {
		System.out.println("so far so good");
		return 1;
	}
	public boolean checkWinX() {//this checks if X is the winner. I is run after 3+ turns
		boolean winner = false;
		int horizWin;
		int vertWin;
		boolean diagWin;
		
		if((horizWin = horizWin(board)) == 4) {//return true if x won
			winner = true;
		}
		else if((vertWin = vertWin(board)) == 4) {
			winner = true;
		}
		else if((diagWin = diagWinX(board)) == true) {
			winner = true;
		}
		return winner;
	}
	
	public boolean CheckWinO() {//this checks if O is the winner. I is run after 3+ turns
		boolean winner = false;
		int horizWin;
		int vertWin;
		boolean diagWin;
		
		if((horizWin = horizWin(board)) == -4) {//return true if x won
			winner = true;
		}
		else if((vertWin = vertWin(board)) == -4) {
			winner = true;
		}
		else if((diagWin = diagWinO(board)) == true) {
			winner = true;
		}
		return winner;
	}
	
	public static int horizWin( int [][] matrix ){
      //Variable holds the "result" of hasWon. True if a winner was found.
      int retval = 0;
      //Check for horizontal win
      for( int row = 0; row < matrix.length; row++ ){
         
         for( int col = 0; col < matrix[0].length; col++ ){
            retval += matrix[row][col];
         }
         //Check to see if the sum of that row was 4 or -4
        
         }
	  
		return retval;
	}

	public static int vertWin( int [][] matrix){  
      //Check for vertical win
    	int retval = 0;
		for( int col = 0; col < matrix[0].length; col++ ){
         
        	for( int row = 0; row < matrix.length; row++ ){
        	retval += matrix[row][col];
         }
         //Check to see if the sum of that column was 3 or -3, a win...
        
      }
	  return retval;
	}

	public static boolean diagWinX(int [][] matrix){
		boolean retVal = false;
		
		if((matrix[0][0] + matrix[1][1] + matrix[2][2] + matrix[3][3]) == 4){
			retVal = true;}
			else if((matrix[0][3] + matrix[1][2] + matrix[2][1] + matrix[3][0]) == 4 ) {
         retVal = true;
	  }
		return retVal;
	}

	public static boolean diagWinO (int [][] matrix){
		boolean retVal = false;
		
		if( (matrix[0][0] + matrix[1][1] + matrix[2][2]) + matrix[3][3] == -4 ){
         
         retVal = true;
      } else if ( (matrix[0][3] + matrix[1][3] + matrix[2][1] + matrix[3][0]) == -4 ) {
         
         retVal = true;
	  }
      return retVal;
	}

	public static boolean draw (int [][] matrix){
		boolean retVal = false;
		//Check for cat game
      boolean foundSpace = false;
      for( int row = 0; row < matrix.length; row++ ){
         for( int col = 0; col < matrix[0].length; col++ ){
            if( matrix[row][col] == 0 ) 
               foundSpace = true;
         }
      }
      if( foundSpace == false ){
         retVal = true;
      }
	return foundSpace;
	}
	
	


     
}

	

//TODO finish logic