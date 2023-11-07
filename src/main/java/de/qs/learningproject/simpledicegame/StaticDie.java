package de.qs.learningproject.simpledicegame;

/**
 * A die that always returns the same result
 *
 * TODO : Write tests
 */
public class StaticDie implements Die {

    private final int staticDiceRoll;

    public StaticDie(int staticDiceRoll) {
        this.staticDiceRoll = staticDiceRoll;
    }

    @Override
    public int rollADice() {
        return staticDiceRoll;
    }
}
