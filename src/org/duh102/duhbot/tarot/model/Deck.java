package org.duh102.duhbot.tarot.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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

    /**
     * Shuffles the deck, both in card order and card reversal
     * @return The deck, shuffled
     */
    synchronized public Deck shuffle() {
        Collections.shuffle(cards, random);
        for(Card card : cards) {
            if(random.nextBoolean()) {
                card.reverse();
            }
        }
        return this;
    }

    /**
     * Creates a list of cards, pulling from the "top" of the deck
     * @param number the number of cards to pull; if the number of cards is greater than the length of the deck, will throw a RuntimeException
     * @return a list of cards which are deep copies of the actual deck's cards
     */
    synchronized public List<Card> pullCards(int number) {
        if(number > cards.size()) {
            throw new RuntimeException(String.format("Requested %d cards out of %d size deck; impossible", number, cards.size()));
        }
        return cards.subList(0, number).stream().map(Card::new).collect(Collectors.toList());
    }

    /**
     * Performs a shuffle, then a pull, all in one synchronized method
     * @param number the number of cards to pull; if the number of cards is greater than the length of the deck, will throw a RuntimeException
     * @return a list of cards which are deep copies of the actual deck's cards
     */
    synchronized public List<Card> shufflePull(int number) {
        shuffle();
        return pullCards(number);
    }
}
