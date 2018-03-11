


public class PlayerController {
	



	public int playerOneMove(TicTacToeModel model,TicTacToeView view ) {//We probably can get rid of this method
		
		view.displayScreen(model);
		
		return 1;
	}
	
	public int playerTwoMove(TicTacToeModel model,TicTacToeView view ) {//We probably can get rid of this method
		return 2;
	}

	public void CheckWinX(TicTacToeModel model,TicTacToeView view){
		 if(model.checkWinX() == true){
			 view.displayXWinner();
		 }
		 else {
			 view.playerXMove();
		 }
	}

	public void CheckWinO(TicTacToeModel model,TicTacToeView view){
		if(model.CheckWinO() == true){
			view.displayOWinner();			
		}
		else {
			view.playerOMove();
		}
	}

	public void gameRunner(){
		boolean runGame = true;

		while (runGame){
			
		}

	}


}
