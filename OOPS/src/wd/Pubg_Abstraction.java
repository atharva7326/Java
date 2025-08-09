package wd;

public class Pubg_Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pubg g1 = new PubgStart();
		g1.startPubg();
		
		Pubg g2 = new PubgPlay();
		g2.playPubg();
		
		Pubg g3 = new EndPubg();
		g3.endPubg();
		

	}

}
