package org.duh102.duhbot.tarot.model.spreads;

import org.duh102.duhbot.tarot.model.Card;
import org.duh102.duhbot.tarot.model.Deck;

import java.util.List;

/**
 * Describes a three card spread, pulled in left-to-right order and placed in a single row
 * [1] [2] [3]
 */
public class ThreeCardInOrderRowSpread{
    private Card first, second, third;
    public ThreeCardInOrderRowSpread(Deck drawFrom) {
        List<Card> cards = drawFrom.shufflePull(3);
        first = cards.get(0);
        second = cards.get(1);
        third = cards.get(2);
    }

    public Card getFirst() {
        return first;
    }

    public Card getSecond() {
        return second;
    }

    public Card getThird() {
        return third;
    }
}
