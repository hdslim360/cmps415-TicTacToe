
public class TicTacToeModel {
	public int board [][] = new int [4][4];
	public int X;
	public int O;
	public boolean winner;
	
	
	public TicTacToeModel(){
		X = 1;
		O = 2;
		winner = false;
	}
	
	public 


	public int startTurn() {
		System.out.println("so far so good");
		return 1;
	}
	
	
	public static boolean horizWin( int [][] matrix ){
      //Variable holds the "result" of hasWon. True if a winner was found.
      boolean retVal = false;
      //Check for horizontal win
      for( int row = 0; row < matrix.length; row++ ){
         int sum = 0;
         for( int col = 0; col < matrix[0].length; col++ ){
            sum += matrix[row][col];
         }
         //Check to see if the sum of that row was 3 or -3, a win...
         if( sum == 3 ){
            System.out.println("X wins.");
            retVal = true;
         } else if ( sum == -3 ) {
            System.out.println("O wins.");
            retVal = true;
         }
	  }
		return retVal;
	}

	public static boolean vertWin( int [][] matrix){  
      //Check for vertical win
    	boolean retval = false;
		for( int col = 0; col < matrix[0].length; col++ ){
         int sum = 0;
        	for( int row = 0; row < matrix.length; row++ ){
            sum += matrix[row][col];
         }
         //Check to see if the sum of that column was 3 or -3, a win...
        if( sum == 3 ){
            System.out.println("X wins.");
            retVal = true;
        } else if ( sum == -3 ) {
            System.out.println("O wins.");
            retVal = true;
        }
      }
	  return retVal;
	}

	public static boolean diagWin (int [][] matrix){
		boolean retval = false;
		//Check for diagonal win
		if( (matrix[0][0] + matrix[1][1] + matrix[2][2]) == 3 ){
         retVal = true;
      } else if ( (matrix[0][0] + matrix[1][1] + matrix[2][2]) == -3 ) {
         retVal = true;
      }
      	if( (matrix[0][2] + matrix[1][1] + matrix[2][0]) == 3 ){
         retVal = true;
      } else if ( (matrix[0][2] + matrix[1][1] + matrix[2][0]) == -3 ) {
         System.out.println("O wins.");
         retVal = true;
      }
	  return retval;
	}

	public static boolean draw (int [][] matrix){
		boolean retval = false;
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
      
	public static checkWin(){
		
	}


      return retVal;
	}

	
}
//TODO finish logic