package org.duh102.duhbot.tarot.model.readings;

import org.duh102.duhbot.tarot.model.State;
import org.duh102.duhbot.tarot.model.spreads.ThreeCardInOrderRowSpread;

import java.util.Arrays;
import java.util.List;

public class PastPresentFutureReading extends SimpleReading {
    private ThreeCardInOrderRowSpread spread;
    public PastPresentFutureReading(State state) {
        super(state);
        spread = new ThreeCardInOrderRowSpread(state.getDeck());
    }

    @Override
    protected String getReadingTitle() {
        return "Past/Present/Future";
    }

    @Override
    protected List<String> getCardInterpretations() {
        return Arrays.asList(
                String.format("Your past: %s", spread.getFirst()),
                String.format("Your present situation: %s", spread.getSecond()),
                String.format("Your future prediction: %s", spread.getThird())
        );
    }
}
