package org.duh102.duhbot.tarot.action;

import org.duh102.duhbot.tarot.model.Pair;
import org.duh102.duhbot.tarot.model.State;

import java.util.HashMap;
import java.util.Map;

import static org.duh102.duhbot.tarot.action.ActionSubtype.ACTION_TYPES_WITH_SUBTYPES;
import static org.duh102.duhbot.tarot.action.ActionSubtype.UNKOWN;

public class Action {
    public static String prefix = ".tarot";
    private static Map<String, String> help = null;
    private static final Integer helpLock = 1;

    private static final State state = new State();

    public Pair<ActionType, ActionSubtype> parseCommand(String toParse) {
        String[] parts = toParse.toLowerCase().trim().split("[ \t]");

        if(parts.length <2 || !prefix.equals(parts[0])) {
            return null;
        }
        ActionType action = ActionType.UNKNOWN;
        ActionSubtype subtype = null;
        for(ActionType type : ActionType.values()) {
            if(type.getActionString().equals(parts[1])) {
                action = type;
                break;
            }
        }
        if(ACTION_TYPES_WITH_SUBTYPES.contains(action)) {
            if(!action.hasDefault()) {
                subtype = UNKOWN;
            }
            if(parts.length > 2) {
                for(ActionSubtype type : ActionSubtype.values()) {
                    if(type.getSubActionOf() != action) {
                        continue;
                    }
                    if(type.getCommand().equals(parts[2])) {
                        subtype = type;
                        break;
                    }
                }
            } else if (action.hasDefault()) {
                subtype = action.getDefault();
            }
        }
        return new Pair(action, subtype);
    }

    public boolean shouldAnswer(String message) {
        return message.toLowerCase().trim().startsWith(prefix);
    }

    public String performAction(String message) {
        Pair<ActionType, ActionSubtype> actionPair = parseCommand(message);
        if(actionPair == null) {
            return null;
        }
        ActionType action = actionPair.getFirst();
        ActionSubtype actionSubtype = actionPair.getSecond();
        if(action == ActionType.UNKNOWN) {
            return "Unknown action, seek help";
        }
        if(actionSubtype == UNKOWN) {
            return String.format("Unkown sub-action of %s, seek help", action.getActionString());
        }
        switch(action) {
            case READ:
                return actionSubtype.performSubaction(state);
            default:
                return "Unknown action, seek help";
        }
    }

    public Map<String, String> getHelp() {
        synchronized (helpLock) {
            if (this.help == null) {
                generateHelp();
            }
        }
        return this.help;
    }
    private void generateHelp() {
        this.help = new HashMap<>();
        Map<ActionType, ActionSubtype> defaultSubTypes = new HashMap<>();
        Map<ActionType, Map<ActionSubtype, String>> actionHelp = new HashMap<>();
        // Prepare all the sub-action help texts, which also builds the defaults table
        // The first sub-action listed in the enum is determined to be the default
        for(ActionSubtype subType : ActionSubtype.values()) {
            ActionType subTypeParent = subType.getSubActionOf();
            if(!actionHelp.containsKey(subTypeParent)) {
                actionHelp.put(subTypeParent, new HashMap<>());
            }
            Map<ActionSubtype, String> actionSubHelp = actionHelp.get(subTypeParent);
            if(actionSubHelp.size() == 0 && subTypeParent.hasDefault()) {
                defaultSubTypes.put(subTypeParent, subType);
            }
            actionSubHelp.put(subType, descriptionHelpString(subType));
        }
        // Now build the real help, doing a depth-first read of the commands
        for(ActionType actionType : ActionType.values()) {
            // Skip out on the UNKNOWN action, which we use as a flag to show the "rtfm" message
            if(actionType == ActionType.UNKNOWN) {
                continue;
            }
            // Insert the main action first
            this.help.put(commandHelpString(actionType, null), actionType.getDescription());
            // Then any sub-commands, if they exist
            if(actionHelp.containsKey(actionType)) {
                Map<ActionSubtype, String> subHelps = actionHelp.get(actionType);
                // We may not have a default; use null as the flag that we don't have a default
                ActionSubtype defaultSubAction = actionType.hasDefault()? defaultSubTypes.get(actionType) : null;
                for(ActionSubtype actionSubtype : subHelps.keySet()) {
                    String description = descriptionHelpString(actionSubtype);
                    // If we have a default, flag it
                    if(defaultSubAction != null && defaultSubAction == actionSubtype) {
                        description+= " (default)";
                    }
                    String commandString = commandHelpString(actionType, actionSubtype);
                    this.help.put(commandString, description);
                }
            }
        }
    }

    private String commandHelpString(ActionType command, ActionSubtype subCommand) {
        return String.format("%s %s%s", prefix, command.getActionString(), subCommand == null? "" : " " + subCommand.getCommand());
    }
    private String descriptionHelpString(ActionSubtype actionType) {
        return String.format("%s: %s", actionType.getName(), actionType.getDescription());
    }
}
