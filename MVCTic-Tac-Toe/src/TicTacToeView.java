package src;

public class TicTacToeView {
	
	private TicTacToeModel model;
	
	public void displayScreen(TicTacToeModel model) {
		for(int row = 0; row < model.board.length; row++) {
			for(int col = 0; col < model.board.length; col++) {
				System.out.print(". ");
			}
			System.out.println("");
		}
	}

	public void displayXWinner() {
		System.out.println("X is the winner");
	}
	
	public void displayYWinner() {
		System.out.println("Y is the winner");
	}
	
	public void displayDraw() {
		System.out.println("It's a draw");
	}



}
	


