package org.duh102.duhbot.tarot.model.readings;

import org.duh102.duhbot.tarot.model.Reading;
import org.duh102.duhbot.tarot.model.State;

import java.util.List;
import java.util.stream.Collectors;

public abstract class SimpleReading implements Reading {
    private long readingNumber;

    public SimpleReading(State state) {
        readingNumber = state.getUniqueValue();
    }

    @Override
    public String read() {
        String readingTitle = getReadingTitle();
        List<String> cardInterpretations = getCardInterpretations().stream().map(s-> String.format("[%d] %s", readingNumber, s)).collect(Collectors.toList());
        String firstLine = String.format("[%d] Performing a %2$s reading",
                readingNumber, readingTitle);
        cardInterpretations.add(0,firstLine);
        return String.join("\n", cardInterpretations);
    }

    protected abstract String getReadingTitle();
    protected abstract List<String> getCardInterpretations();
}
