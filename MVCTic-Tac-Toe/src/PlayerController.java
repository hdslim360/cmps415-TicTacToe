import java.util.Scanner;


public class PlayerController {
	
Scanner input = new Scanner(System.in);


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
			 view.playerXMoveRow();
			 int row = input.nextInt();
	         view.playerXMoveColumn();
	         int col = input.nextInt();
	         //Pass Input into model and validate input
		 }
	}

	public void CheckWinO(TicTacToeModel model,TicTacToeView view){
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

	public void gameRunner(){
		boolean runGame = true;

		while (runGame){
			
		}

	}


}
