package org.duh102.duhbot.tarot.action;

import org.duh102.duhbot.tarot.model.State;
import org.duh102.duhbot.tarot.model.readings.PastPresentFutureReading;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum ActionSubtype {
    UNKOWN(null, null, null, null, null),
    PASTPRESENTFUTURE(ActionType.READ, "ppf", "Past/Present/Future", "A reading of your past, present, and future",
            (State state) -> { return (new PastPresentFutureReading(state.getDeck())).read(); });

    public static final Set<ActionType> ACTION_TYPES_WITH_SUBTYPES = Arrays.stream(values())
            .map(ActionSubtype::getSubActionOf)
            .filter(Objects::nonNull)
            .collect(Collectors.toSet());



    private ActionType subActionOf;
    private String command;
    private String name;
    private String description;
    private Function<State, String> actionFunction;
    ActionSubtype(ActionType parentAction, String command, String name, String description, Function<State, String> actionFunction) {
        this.subActionOf = parentAction;
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
}
