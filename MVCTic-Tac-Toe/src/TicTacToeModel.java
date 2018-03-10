
public class TicTacToeModel {
	public int board [][] = new int [4][4];
	public int X;
	public int O;
	public boolean winner;
	
	
	public TicTacToeModel(){
		X = 1;
		O = 2;
		winner = false;
	}
	
	public int startTurn() {
		System.out.println("so far so good");
		return 1;
	}
	
	
	public boolean checkWinner(int [][] matrix ){
		boolean winner = false;
		//Check for vertical win
		return winner;
	}
	
}
//TODO finish logic