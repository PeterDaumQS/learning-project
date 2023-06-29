package de.qs.azubi.simpledicegame;

/**
 * A simpler player representation.
 */
public class Player {
    private final Die die;

    // TODO : Player should have a name.
    public Player(int diceRollResult) {
        // TODO : The dice should be injected then rather created here.
        this.die = new StaticDie(diceRollResult);
    }


    // TODO : document me
    public int rollMyDice() {
        return die.rollADice();
    }
}
