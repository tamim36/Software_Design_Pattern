package TemplatePatternByUdemy;

public class Main {

	public static void main(String[] args) {

		GameSkeleton game = new Football();
		game.play();

		System.out.println(" ............... ");

		game = new Cricket();
		game.play();

	}

}
