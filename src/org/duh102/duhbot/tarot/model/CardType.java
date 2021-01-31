package org.duh102.duhbot.tarot.model;

public enum CardType {
    // Major arcana
    THE_FOOL("The Fool","",true),
    THE_MAGICIAN("The Magician","",true),
    THE_HIGH_PRIESTESS("The High Priestess","",true),
    THE_EMPRESS("The Empress","",true),
    THE_EMPEROR("The Emperor","",true),
    THE_HIEROPHANT("The Hierophant","",true),
    THE_LOVERS("The Lovers","",true),
    THE_CHARIOT("The Chariot","",true),
    STRENGTH("Strength","",true),
    THE_HERMIT("The Hermit","",true),
    WHEEL_FORTUNE("Wheel of Fortune","",true),
    JUSTICE("Justice","",true),
    THE_HANGED_MAN("The Hanged Man","",true),
    DEATH("Death","",true),
    TEMPERANCE("Temperance","",true),
    THE_DEVIL("The Devil","",true),
    THE_TOWER("The Tower","",true),
    THE_STAR("The Star","",true),
    THE_MOON("The Moon","",true),
    THE_SUN("The Sun","",true),
    JUDGEMENT("Judgement","",true),
    THE_WORLD("The World","",true),


    // Minor arcana
    // Wands
    ACE_WANDS("Ace of Wands","",false),
    TWO_WANDS("Two of Wands","",false),
    THREE_WANDS("Three of Wands","",false),
    FOUR_WANDS("Four of Wands","",false),
    FIVE_WANDS("Five of Wands","",false),
    SIX_WANDS("Six of Wands","",false),
    SEVEN_WANDS("Seven of Wands","",false),
    EIGHT_WANDS("Eight of Wands","",false),
    NINE_WANDS("Nine of Wands","",false),
    TEN_WANDS("Ten of Wands","",false),
    PAGE_WANDS("Page of Wands","",false),
    KNIGHT_WANDS("Knight of Wands","",false),
    QUEEN_WANDS("Queen of Wands","",false),
    KING_WANDS("King of Wands","",false),
    // Cups
    ACE_CUPS("Ace of Cups","",false),
    TWO_CUPS("Two of Cups","",false),
    THREE_CUPS("Three of Cups","",false),
    FOUR_CUPS("Four of Cups","",false),
    FIVE_CUPS("Five of Cups","",false),
    SIX_CUPS("Six of Cups","",false),
    SEVEN_CUPS("Seven of Cups","",false),
    EIGHT_CUPS("Eight of Cups","",false),
    NINE_CUPS("Nine of Cups","",false),
    TEN_CUPS("Ten of Cups","",false),
    PAGE_CUPS("Page of Cups","",false),
    KNIGHT_CUPS("Knight of Cups","",false),
    QUEEN_CUPS("Queen of Cups","",false),
    KING_CUPS("King of Cups","",false),
    // Swords
    ACE_SWORDS("Ace of Swords","",false),
    TWO_SWORDS("Two of Swords","",false),
    THREE_SWORDS("Three of Swords","",false),
    FOUR_SWORDS("Four of Swords","",false),
    FIVE_SWORDS("Five of Swords","",false),
    SIX_SWORDS("Six of Swords","",false),
    SEVEN_SWORDS("Seven of Swords","",false),
    EIGHT_SWORDS("Eight of Swords","",false),
    NINE_SWORDS("Nine of Swords","",false),
    TEN_SWORDS("Ten of Swords","",false),
    PAGE_SWORDS("Page of Swords","",false),
    KNIGHT_SWORDS("Knight of Swords","",false),
    QUEEN_SWORDS("Queen of Swords","",false),
    KING_SWORDS("King of Swords","",false),
    // Coins
    ACE_COINS("Ace of Coins","",false),
    TWO_COINS("Two of Coins","",false),
    THREE_COINS("Three of Coins","",false),
    FOUR_COINS("Four of Coins","",false),
    FIVE_COINS("Five of Coins","",false),
    SIX_COINS("Six of Coins","",false),
    SEVEN_COINS("Seven of Coins","",false),
    EIGHT_COINS("Eight of Coins","",false),
    NINE_COINS("Nine of Coins","",false),
    TEN_COINS("Ten of Coins","",false),
    PAGE_COINS("Page of Coins","",false),
    KNIGHT_COINS("Knight of Coins","",false),
    QUEEN_COINS("Queen of Coins","",false),
    KING_COINS("King of Coins","",false)
    ;
    private String properName;
    private String description;
    private boolean isMajor;
    CardType(String properName, String description, boolean isMajor) {
        this.properName = properName;
        this.description = description;
        this.isMajor = isMajor;
    }

    public String getProperName() {
        return properName;
    }

    public String getDescription() {
        return description;
    }

    public boolean isMajor() {
        return isMajor;
    }
}
