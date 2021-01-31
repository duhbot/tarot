package org.duh102.duhbot.tarot.model;

import java.util.function.Function;

public interface Reading {
    Function<Deck, CardArrangement> getReadingFunction();
}
