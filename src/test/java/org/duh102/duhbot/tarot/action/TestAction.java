package org.duh102.duhbot.tarot.action;

import org.duh102.duhbot.tarot.model.Pair;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestAction {
    Action action = new Action();

    @Test
    public void testShouldAnswer() {
        assertThat(action.shouldAnswer("")).isFalse();
        assertThat(action.shouldAnswer(Action.PREFIX)).isTrue();
        assertThat(action.shouldAnswer("notacommand")).isFalse();
        assertThat(action.shouldAnswer(Action.PREFIX + " Maybe a command")).isTrue();
    }

    @Test
    public void testParseActions() {
        // Not a tarot command
        Pair<ActionType, ActionSubtype> parsed = action.parseCommand("harp");
        assertThat(parsed).isNull();

        // No actual command, just the prefix
        parsed = action.parseCommand(Action.PREFIX);
        assertThat(parsed).isNull();

        // Unknown command
        parsed = action.parseCommand(Action.PREFIX + " NOTACOMMAND");
        assertThat(parsed).isNotNull();
        assertThat(parsed.getFirst()).isEqualTo(ActionType.UNKNOWN);
        assertThat(parsed.getSecond()).isNull();

        // Command with a default (we don't have any that don't have defaults atm)
        parsed = action.parseCommand(Action.PREFIX + " " + ActionType.READ.getActionString());
        assertThat(parsed).isNotNull();
        assertThat(parsed.getFirst()).isEqualTo(ActionType.READ);
        assertThat(parsed.getSecond()).isEqualTo(ActionSubtype.PAST_PRESENT_FUTURE);

        // Command with a subtype
        parsed = action.parseCommand(Action.PREFIX + " " + ActionType.READ.getActionString() + " " + ActionSubtype.PAST_PRESENT_FUTURE.getCommand());
        assertThat(parsed).isNotNull();
        assertThat(parsed.getFirst()).isEqualTo(ActionType.READ);
        assertThat(parsed.getSecond()).isEqualTo(ActionSubtype.PAST_PRESENT_FUTURE);
    }
}
