
public class PlayerController {
	
	public int playerOneMove(TicTacToeModel model,TicTacToeView view ) {
		
		view.displayScreen(model);
		
		return 1;
	}
	
	public int playerTwoMove(TicTacToeModel model,TicTacToeView view ) {
		return 2;
	}

}
