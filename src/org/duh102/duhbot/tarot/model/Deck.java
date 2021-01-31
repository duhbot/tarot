package org.duh102.duhbot.tarot.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private Random random;
    private List<Card> cards;
    public Deck() {
        random = new Random(System.currentTimeMillis());
        CardType[] cardTypes = CardType.values();
        cards = new ArrayList<>(cardTypes.length);
        for( CardType type : cardTypes) {
            cards.add(new Card(type));
        }
    }

    public Deck shuffle() {
        Collections.shuffle(cards, random);
        return this;
    }

    public List<Card> pullCards(int number) throws Exception {
        if(number > cards.size()) {
            throw new Exception(String.format("Requested %d cards out of %d size deck; impossible", number, cards.size()));
        }
        return cards.subList(0, number);
    }
}
