package de.qs.azubi.simpledicegame;

public class SimpleDiceGame {

    private Player playerA;
    private Player playerB;

    public static void main(String[] args) {
        SimpleDiceGame game = new SimpleDiceGame();
        game.setup();
        game.play();
    }

    private void setup() {
        playerA = new Player(1);
        playerB = new Player(2);
    }

    private void play() {
        int ties = 0;
        int playerAWon = 0;
        // TODO : Refactor me
        for (int i = 0; i < 10; i++) {
            int playerADiceRoll = playerA.rollMyDice();
            int playerBDiceRoll = playerB.rollMyDice();
            if (playerADiceRoll == playerBDiceRoll) {
                ties++;
            } else if (playerADiceRoll > playerBDiceRoll) {
                playerAWon++;
            }
        }

        System.out.printf("10 rounds played");
        System.out.printf("Ties : %d\n", ties);
        System.out.println("Player A won " + (playerAWon) + " rounds");
        System.out.println("Player B won " + (10 - playerAWon - ties) + " rounds");

        System.out.println("Winner is Player : " + (10 - playerAWon - ties > playerAWon ? "B" : "A"));
    }
}