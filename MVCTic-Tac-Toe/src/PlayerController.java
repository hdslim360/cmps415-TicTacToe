import java.util.Scanner;


public class PlayerController {
	private TicTacToeModel model;
	private TicTacToeView view;

Scanner input = new Scanner(System.in);

	public PlayerController(TicTacToeModel model, TicTacToeView view){
		this.model = model;
		this.view = view;
	}

	public int playerOneMove(model, view ) {//We probably can get rid of this method
		
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
			 view.playerXMoveRow();
			 int row = input.nextInt();
	         view.playerXMoveColumn();
	         int col = input.nextInt();
	         //Pass Input into model and validate input
		 }
	}

	public void CheckWinO(model , view){
		if(model.CheckWinO() == true){
			view.displayOWinner();			
		}
		else {
			view.playerOMoveRow();
		    int row = input.nextInt();
		    view.playerOMoveCol();
			int col = input.nextInt();
			
		    //Pass Input into model and validate input
		}
	}

	public void gameRunner(model, view){
		boolean runGame = true;
		model.newBoard();
		while (runGame){
			CheckWinO(model, view);
		}

	}


}