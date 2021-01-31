package org.duh102.duhbot.tarot.model;

public class Card {
    private CardType type;
    private boolean reversed;

    public Card(CardType type) {
        this.type = type;
        reversed = false;
    }
    public Card(Card toCopy) {
        this.type = toCopy.getType();
        this.reversed = toCopy.isReversed();
    }
    public Card reverse() {
        this.reversed = !reversed;
        return this;
    }

    public CardType getType() {
        return type;
    }
    public boolean isReversed() {
        return reversed;
    }

    public String toString() {
        return String.format("%s%s (%s)", type.getProperName(), isReversed()?
                " in reverse": "", isReversed()? type.getReverseMeaning():
                type.getNormalMeaning());
    }
}
