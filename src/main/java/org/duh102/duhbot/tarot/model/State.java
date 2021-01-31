package org.duh102.duhbot.tarot.model;

public class State {
    private Deck deck;
    public State() {
        deck = new Deck();
    }

    public Deck getDeck() {
        return deck;
    }
}
