package org.duh102.duhbot.tarot.action;

public enum ActionType {
    UNKNOWN(null, "Unknown action", null),
    READ("read", "Performs a tarot reading; see sub-commands for specific help", ActionSubtype.PASTPRESENTFUTURE);
    private String actionString;
    private String description;
    private ActionSubtype defaultSub;
    ActionType(String actionString, String description, ActionSubtype defaultSub) {
        this.actionString = actionString;
        this.description = description;
        this.defaultSub = defaultSub;
    }

    public String getActionString() {
        return actionString;
    }
    public String getDescription() {
        return description;
    }
    public boolean hasDefault() {
        return defaultSub != null;
    }
    public ActionSubtype getDefault() {
        return defaultSub;
    }
}
