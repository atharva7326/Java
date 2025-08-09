package wd;

public abstract class Pubg {
     abstract void startPubg();
     abstract void playPubg();
     abstract void endPubg();
}
class PubgStart extends Pubg {
	void startPubg() {
        System.out.println("The Game is start in 10 second.");
	}

	void playPubg() {
		 System.out.println("Now you should play pubg");
	}

	void endPubg() {
		 System.out.println("Game Over");
	}
}

class PubgPlay extends Pubg {
	void startPubg() {
        System.out.println("The Game is start in 10 second.");
	}

	void playPubg() {
		 System.out.println("Now you should play pubg");
	}

	void endPubg() {
		 System.out.println("Game Over");
	}
}

class EndPubg extends Pubg {
	void startPubg() {
        System.out.println("The Game is start in 10 second.");
	}

	void playPubg() {
		 System.out.println("Now you should play pubg");
	}

	void endPubg() {
		 System.out.println("Game Over");
	}
}

