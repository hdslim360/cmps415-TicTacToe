package src;

public class TicTacToeView {
	
	private TicTacToeModel model;
	
	public void displayScreen(TicTacToeModel model) {
		for(int row = 0; row < model.board.length; row++) {
			for(int col = 0; col < model.board.length; col++) {
				System.out.print(model.findSpot(row, col));
			}
			System.out.println("");
		}
	}

	public void displayXWinner() {
		System.out.println("X is the winner");
	}
	
	public void displayOWinner() {
		System.out.println("Y is the winner");
	}
	
	public void displayDraw() {
		System.out.println("It's a draw");
	}
	
	public void playerXMoveRow() {
		System.out.println("Player X, it's your turn");
		System.out.print(" enter row: ");
	}
	
	public void playerXMoveColumn() {
		System.out.println("Player X Enter a column");
	}
	
	public void playerOMoveRow() {
		System.out.println("Player O, it's your turn");
		System.out.print(" enter row: ");
	}
	
	public void playerOMoveCol() {
		System.out.println("Player O Enter a column");
		}

}
	


