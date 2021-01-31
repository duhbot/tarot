package org.duh102.duhbot.tarot.model.readings;

import org.duh102.duhbot.tarot.model.Deck;
import org.duh102.duhbot.tarot.model.Reading;
import org.duh102.duhbot.tarot.model.State;
import org.duh102.duhbot.tarot.model.spreads.ThreeCardInOrderRowSpread;

public class PastPresentFutureReading implements Reading {
    private ThreeCardInOrderRowSpread spread;
    private long readingNumber;
    public PastPresentFutureReading(State state) {
        spread = new ThreeCardInOrderRowSpread(state.getDeck());
        readingNumber = state.getUniqueValue();
    }

    @Override
    public String read() {
        return String.format("[%1$,d] Performing a Past/Present/Future " +
                        "reading\n" +
                        "[%1$d] Your past: %2$s\n" +
                        "[%1$d] Your present situation: %3$s\n" +
                        "[%1$d] Your future prediction: %4$s",
                readingNumber,
                spread.getFirst(),
                spread.getSecond(),
                spread.getThird());
    }
}
