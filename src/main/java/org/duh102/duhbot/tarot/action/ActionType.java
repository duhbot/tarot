package org.duh102.duhbot.tarot.action;

public enum ActionType {
    UNKNOWN(null, "Unknown action"),
    READ("read", "Performs a tarot reading; see sub-commands for specific help");

    // You must put the default subs into this static method because it executes after the construction of both enums
    static {
        READ.setDefaultSub(ActionSubtype.PAST_PRESENT_FUTURE);
    }

    private String actionString;
    private String description;
    private ActionSubtype defaultSub;
    ActionType(String actionString, String description) {
        this.actionString = actionString;
        this.description = description;
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
    void setDefaultSub(ActionSubtype sub) {
        defaultSub = sub;
    }
}
