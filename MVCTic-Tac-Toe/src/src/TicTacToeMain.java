package src;

import java.util.Scanner;


public class TicTacToeMain {

	public static void main(String [] args) {
		
		//How I start all my java programs
		System.out.println("Are you ready to rock!?!");
		PlayerController controller = new PlayerController();
		controller.gameRunner();
		}
}
