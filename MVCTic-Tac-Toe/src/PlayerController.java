
package src;

public class PlayerController {
	
	TicTacToeView view = new TicTacToeView();
	TicTacToeModel model = new TicTacToeModel();


	public int playerOneMove(TicTacToeModel model,TicTacToeView view ) {
		
		view.displayScreen(model);
		
		return 1;
	}
	
	public int playerTwoMove(TicTacToeModel model,TicTacToeView view ) {
		return 2;
	}

	public void CheckWinX(TicTacToeModel model,TicTacToeView view){
		 if(model.checkWinX() == true){
			 view.diplayXWinner();
		 }
	}

	public void CheckWinO(TicTacToeModel model,TicTacToeView view){
		if(model.CheckWinO() == true){
			view.diplayYWinner();

		}
	}

	public void gameRunner(){
		boolean runGame = true;

		while (runGame){

		}

	}


}
