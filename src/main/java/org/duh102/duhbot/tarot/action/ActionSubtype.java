package org.duh102.duhbot.tarot.action;

import org.duh102.duhbot.tarot.model.State;
import org.duh102.duhbot.tarot.model.readings.PastPresentFutureReading;
import org.duh102.duhbot.tarot.model.readings.ThreeCardAdvice;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum ActionSubtype {
    UNKOWN(null, null, null, null),
    PAST_PRESENT_FUTURE("ppf", "Past/Present/Future", "A reading of your past, present, and future",
            (State state) -> { return (new PastPresentFutureReading(state)).read(); }),
    THREE_CARD_ADVICE("advice3", "Three-card Advice", "A simple advice reading",
            (State state) -> { return (new ThreeCardAdvice(state)).read(); });


    // You must put the parents into this static method because it executes after the construction of both enums
    public static final Set<ActionType> ACTION_TYPES_WITH_SUBACTIONS;
    static {
        PAST_PRESENT_FUTURE.setSubActionOf(ActionType.READ);
        THREE_CARD_ADVICE.setSubActionOf(ActionType.READ);

        ACTION_TYPES_WITH_SUBACTIONS = Arrays.stream(ActionSubtype.values())
                .map(ActionSubtype::getSubActionOf)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }



    private ActionType subActionOf;
    private String command;
    private String name;
    private String description;
    private Function<State, String> actionFunction;
    ActionSubtype(String command, String name, String description, Function<State, String> actionFunction) {
        this.command = command;
        this.name = name;
        this.description = description;
        this.actionFunction = actionFunction;
    }

    public ActionType getSubActionOf() {
        return subActionOf;
    }

    public String getCommand() {
        return command;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String performSubaction(State state) {
        return actionFunction.apply(state);
    }

    void setSubActionOf(ActionType parent) {
        this.subActionOf = parent;
    }
}
