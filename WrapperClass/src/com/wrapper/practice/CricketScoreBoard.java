package com.wrapper.practice;
import java.util.HashMap;
import java.util.Scanner;
//class Player{
//	private String name;
//	private String teamName;
//	private int run;
//	private int balls;
//	public Player(String name,String teamName,int run,int balls) {
//		this.name = name;
//		this.teamName = teamName;
//		this.run = run;
//		this.balls = balls;
//	}
//	String getTeamName() {
//		return teamName;
//	}
//	String getPlayerName() {
//		return name;
//	}
//	void setBalls() {
//		balls++;
//	}
//	int getRun(int r) {
//		run+= r;
//		setBalls();
//		return run;	
//	}
//	int getBalls() {
//		return balls;
//	}
//}
//class Team extends Player{
//    private int teamScore;
//	public Team(String name, String teamName, int run, int balls,int teamScore) {
//		super(name, teamName, run, balls);
//		this.teamScore = teamScore;
//	}
//	void disPlayTeam() {
//		System.out.println("Team " + getTeamName());
//		System.out.println("Player Name: " + getPlayerName());
//		System.out.println("Run: " + getRun());
//		System.out.println("Balls: " + getBalls());
//		System.out.println("TotalRun of Team: " + getTotalRun());	
//	}
//	
//}

public class CricketScoreBoard {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Scoreboard Menu ---");
            System.out.println("1. Add/Update Score");
            System.out.println("2. Display Scores");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter score to add: ");
                    int scoreToAdd = sc.nextInt();
                    sc.nextLine(); // consume newline

                    // Avoid NPE: use getOrDefault
                    int currentScore = scores.getOrDefault(name, 0);
                    scores.put(name, currentScore + scoreToAdd);

                    System.out.println(name + "'s updated score: " + scores.get(name));
                    break;

                case 2:
                    System.out.println("\n--- Current Scores ---");
                    if (scores.isEmpty()) {
                        System.out.println("No players on scoreboard yet.");
                    } else {
                        for (String player : scores.keySet()) {
                            System.out.println(player + ": " + scores.get(player));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting Scoreboard. Bye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
