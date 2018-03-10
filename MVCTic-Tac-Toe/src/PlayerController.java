
public class PlayerController {
	
	public int playerOneMove(TicTacToeModel model,TicTacToeView view ) {
		
		view.displayScreen(model);
		
		return 1;
	}
	
	public int playerTwoMove(TicTacToeModel model,TicTacToeView view ) {
		return 2;
	}

	public static void CheckWin(){
		 if(model.horizWin() == 4 ){
            view.x
         } else if (horizWin() == -4 ) {
			view.o
		 } else if (model.draw == true){
		 	view.tiedGame();
		 } else {
			
		 }
	}
