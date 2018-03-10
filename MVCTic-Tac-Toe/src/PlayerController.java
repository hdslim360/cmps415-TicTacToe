


public class PlayerController {
	
	public int playerOneMove(TicTacToeModel model,TicTacToeView view ) {
		
		view.displayScreen(model);
		
		return 1;
	}
	
	public int playerTwoMove(TicTacToeModel model,TicTacToeView view ) {
		return 2;
	}

	public static void CheckWinX(TicTacToeModel model,TicTacToeView view){
		 if(model.checkWinX() == true){
			 view.diplayXWinner();
		 }
	}

	public static void CheckWinO(TicTacToeModel model,TicTacToeView view){
		if(model.CheckWinO() == true){
			view.diplayYWinner()
		}
	}
