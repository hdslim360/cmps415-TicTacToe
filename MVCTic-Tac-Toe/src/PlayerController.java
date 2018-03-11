


public class PlayerController {
	



	public int playerOneMove(TicTacToeModel model,TicTacToeView view ) {
		
		view.displayScreen(model);
		
		return 1;
	}
	
	public int playerTwoMove(TicTacToeModel model,TicTacToeView view ) {
		return 2;
	}

	public void CheckWinX(TicTacToeModel model,TicTacToeView view){
		 if(model.checkWinX() == true){
			 view.displayXWinner();
		 }
	}

	public void CheckWinO(TicTacToeModel model,TicTacToeView view){
		if(model.CheckWinO() == true){
			view.displayOWinner();

		}
	}

	public void gameRunner(){
		boolean runGame = true;

		while (runGame){
			
		}

	}


}
