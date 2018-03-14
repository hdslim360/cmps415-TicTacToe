package src;
//Written by Jeremy Slimmer and Spencer Shaw


public class TicTacToeMain {

	public static void main(String [] args) {
		
		//A really cool start to a java program
		System.out.println("Are you ready to rock!?!");
		//instantiate model and view. Call game runner in the controller 
		TicTacToeModel model = new TicTacToeModel();
		TicTacToeView view = new TicTacToeView(model);
		PlayerController controller = new PlayerController(view, model);
		controller.gameRunner();
		}
}
