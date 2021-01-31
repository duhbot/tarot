package org.duh102.duhbot.tarot.model.readings;

import org.duh102.duhbot.tarot.model.Deck;
import org.duh102.duhbot.tarot.model.Reading;
import org.duh102.duhbot.tarot.model.spreads.ThreeCardInOrderRowSpread;

public class PastPresentFutureReading implements Reading {
    private ThreeCardInOrderRowSpread spread;
    public PastPresentFutureReading(Deck drawFrom) {
        spread = new ThreeCardInOrderRowSpread(drawFrom);
    }

    @Override
    public String read() {
        return String.format("You drew %s, %s, and %s", spread.getFirst(), spread.getSecond(), spread.getThird());
    }
}
