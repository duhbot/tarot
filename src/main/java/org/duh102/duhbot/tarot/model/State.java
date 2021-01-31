package org.duh102.duhbot.tarot.model;

import java.util.concurrent.atomic.AtomicLong;

public class State {
    private Deck deck;
    private AtomicLong counter = new AtomicLong(0);
    public State() {
        deck = new Deck();
    }

    public Deck getDeck() {
        return deck;
    }
    public long getUniqueValue() {
        return counter.getAndAdd(1);
    }
}
