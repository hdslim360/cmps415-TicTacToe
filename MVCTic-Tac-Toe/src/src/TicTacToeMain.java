package src;

import java.util.Scanner;


public class TicTacToeMain {

	public static void main(String [] args) {
		
		//How I start all my java programs
		System.out.println("Are you ready to rock!?!");
		TicTacToeModel model = new TicTacToeModel();
		TicTacToeView view = new TicTacToeView(model);
		PlayerController controller = new PlayerController(view, model);
		controller.gameRunner();
		}
}
