package com.game.module;

abstract class GameTemplate {

	abstract void play();

	void scoreTracking() {
		System.out.println("Tracking score...");
	}
}

class CricketGame extends GameTemplate {

	@Override
	void play() {
		System.out.println("Playing Cricket Game...");
	}
}

class ChessGame extends GameTemplate {

	@Override
	void play() {
		System.out.println("Playing Chess Game...");
	}
}

public class Main {
	public static void main(String[] args) {
		GameTemplate game1 = new CricketGame();
		game1.play();
		game1.scoreTracking();

		GameTemplate game2 = new ChessGame();
		game2.play();
		game2.scoreTracking();
	}
}
