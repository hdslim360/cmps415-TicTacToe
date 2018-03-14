package src;
import java.util.Scanner;;

public class PlayerController {
	private TicTacToeView view;
	private TicTacToeModel model;
	private final int X = 1;
	private final int O = -1;
	private boolean winner;
	
	public PlayerController(TicTacToeView view, TicTacToeModel model) {
		this.view = view;
		this.model = model;
	}
	
	public boolean CheckWin(){
		if (model.checkWin(X) == true ) {
			view.displayXWinner();
			return true;
		}if (model.checkWin(O)==true) {
			view.displayOWinner();
			return true;
		}else {
			return false;
		}
	}
	
	private int input() {
		Scanner in = new Scanner(System.in);
		return in.nextInt();
		
	}
	//xMove and oMove are to controller methods that call methods in the view to display data or methods in the model.  
	//The only logic in xMove and oMove are if statements
	//xMove calls methods for player X to move 
	private void xMove() {
		int row;
		int col;
		boolean tryagain = true;
		do {
			view.playerXMoveRow();
			row = input();
			view.playerXMoveColumn();
			col = input();
			if (model.inputMove(row, col)) {
				model.placeBoard(row, col, X);
				tryagain = false;
			}else {
				view.moveAgain();
				view.displayScreen();
			}
		
			if (CheckWin()) {
				winner = true;
				tryagain = false;
			}
		}while(tryagain);
	}
	//oMove calls methods for player O to move
	private void oMove() {
		int row;
		int col;
		boolean tryagain = true;
		do {
			view.playerOMoveRow();
			row = input();
			view.playerOMoveCol();
			col = input();
			if (model.inputMove(row, col)) {
				model.placeBoard(row, col, O);
				tryagain = false;
			}else {
				view.moveAgain();
				view.displayScreen();
			}
		
			if (CheckWin()) {
				winner = true;
				tryagain = false;
			}
		}while(tryagain);
	}
    //the gameRunner well, runs the game
	public void gameRunner(){
		boolean runGame = true;
		
		while (runGame){
			xMove();
			view.displayScreen();
			if (winner) {
				runGame= false;
				break;
			}
			oMove();
			view.displayScreen();
			if(winner) {
				runGame = false;
				break;
			}
			
			
		} 
		view.thankYou();
	}


}
