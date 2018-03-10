
public class TicTacToeMain {

	public static void main(String [] args) {
		
		//How I start all my java programs
		System.out.println("Are you ready to rock!?!");
		TicTacToeView view = new TicTacToeView();
		TicTacToeModel model = new TicTacToeModel();
		PlayerController controller = new PlayerController();
		controller.playerOneMove(model, view);
	}
}
