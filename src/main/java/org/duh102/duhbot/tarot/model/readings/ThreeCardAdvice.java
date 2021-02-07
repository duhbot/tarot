package org.duh102.duhbot.tarot.model.readings;

import org.duh102.duhbot.tarot.model.State;
import org.duh102.duhbot.tarot.model.spreads.ThreeCardInOrderRowSpread;

import java.util.Arrays;
import java.util.List;

public class ThreeCardAdvice extends SimpleReading {
    private ThreeCardInOrderRowSpread spread;
    public ThreeCardAdvice(State state) {
        super(state);
        spread = new ThreeCardInOrderRowSpread(state.getDeck());
    }

    @Override
    protected String getReadingTitle() {
        return "Three-card advice reading";
    }

    @Override
    protected List<String> getCardInterpretations() {
        return Arrays.asList(
                String.format("The nature of your problem: %s", spread.getFirst()),
                String.format("The cause of it: %s", spread.getSecond()),
                String.format("A solution: %s", spread.getThird())
        );
    }
}
