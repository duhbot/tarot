package org.duh102.duhbot.tarot.model;

public enum CardType {
    // Major arcana
    THE_FOOL("The Fool","innocence, new beginnings, free spirit", "recklessness, taken advantage of, inconsideration ",true),
    THE_MAGICIAN("The Magician","willpower, desire, creation, manifestation", "trickery, illusions, out of touch",true),
    THE_HIGH_PRIESTESS("The High Priestess","intuitive, unconscious, inner voice", "lack of center, lost inner voice, repressed feelings",true),
    THE_EMPRESS("The Empress","motherhood, fertility, nature", "dependence, smothering, emptiness, nosiness",true),
    THE_EMPEROR("The Emperor","authority, structure, control, fatherhood", "tyranny, rigidity, coldness",true),
    THE_HIEROPHANT("The Hierophant","tradition, conformity, morality, ethics", "rebellion, subversiveness, new approaches",true),
    THE_LOVERS("The Lovers","partnerships, duality, union", "loss of balance, one-sidedness, disharmony",true),
    THE_CHARIOT("The Chariot","direction, control, willpower", "lack of control, lack of direction, aggression",true),
    STRENGTH("Strength","inner strength, bravery, compassion, focus", "self doubt, weakness, insecurity",true),
    THE_HERMIT("The Hermit","contemplation, search for truth, inner guidance", "loneliness, isolation, lost your way",true),
    WHEEL_FORTUNE("Wheel of Fortune","change, cycles, inevitable fate", "no control, clinging to control, bad luck ",true),
    JUSTICE("Justice","cause and effect, clarity, truth", "dishonesty, unaccountability, unfairness",true),
    THE_HANGED_MAN("The Hanged Man","sacrifice, release, martyrdom", "stalling, needless sacrifice, fear of sacrifice ",true),
    DEATH("Death","end of cycle, beginnings, change, metamorphosis", "fear of change, holding on, stagnation, decay",true),
    TEMPERANCE("Temperance","middle path, patience, finding meaning", "extremes, excess, lack of balance ",true),
    THE_DEVIL("The Devil","addiction, materialism, playfulness", "freedom, release, restoring control ",true),
    THE_TOWER("The Tower","sudden upheaval, broken pride, disaster", "disaster avoided, delayed disaster, fear of suffering",true),
    THE_STAR("The Star","hope, faith, rejuvenation", "faithlessness, discouragement, insecurity",true),
    THE_MOON("The Moon","unconscious, illusions, intuition", "confusion, fear, misinterpretation", true),
    THE_SUN("The Sun","joy, success, celebration, positivity", "negativity, depression, sadness ", true),
    JUDGEMENT("Judgement","reflection, reckoning, awakening", "lack of self awareness, doubt, self loathing",true),
    THE_WORLD("The World","fulfillment, harmony, completion", "incompletion, no closure",true),


    // Minor arcana
    // Wands
    ACE_WANDS("Ace of Wands","creation, willpower, inspiration, desire", "lack of energy, lack of passion, boredom", false),
    TWO_WANDS("Two of Wands","planning, making decisions, leaving home", "fear of change, playing safe, bad planning", false),
    THREE_WANDS("Three of Wands","looking ahead, expansion, rapid growth", "obstacles, delays, frustration", false),
    FOUR_WANDS("Four of Wands","community, home, celebration", "lack of support, transience, home conflicts", false),
    FIVE_WANDS("Five of Wands","competition, rivalry, conflict", "avoiding conflict, respecting differences", false),
    SIX_WANDS("Six of Wands","victory, success, public reward", "excess pride, lack of recognition, punishment", false),
    SEVEN_WANDS("Seven of Wands","perseverance, defensive, maintaining control", "give up, destroyed confidence, overwhelmed", false),
    EIGHT_WANDS("Eight of Wands","rapid action, movement, quick decisions", "panic, waiting, slowdown", false),
    NINE_WANDS("Nine of Wands","resilience, grit, last stand", "exhaustion, fatigue, questioning motivations", false),
    TEN_WANDS("Ten of Wands","accomplishment, responsibility, burden", "inability to delegate, overstressed, burnt out", false),
    PAGE_WANDS("Page of Wands","exploration, excitement, freedom", "lack of direction, procrastination, creating conflict", false),
    KNIGHT_WANDS("Knight of Wands","action, adventure, fearlessness", "anger, impulsiveness, recklessness ", false),
    QUEEN_WANDS("Queen of Wands","courage, determination, joy", "selfishness, jealousy, insecurities", false),
    KING_WANDS("King of Wands","big picture, leader, overcoming challenges", "impulsive, overbearing, unachievable expectations", false),
    // Cups
    ACE_CUPS("Ace of Cups","new feelings, spirituality, intuition", "emotional loss, blocked creativity, emptiness ", false),
    TWO_CUPS("Two of Cups","unity, partnership, connection", "imbalance, broken communication, tension", false),
    THREE_CUPS("Three of Cups","friendship, community, happiness", "overindulgence, gossip, isolation", false),
    FOUR_CUPS("Four of Cups","apathy, contemplation, disconnectedness", "sudden awareness, choosing happiness, acceptance", false),
    FIVE_CUPS("Five of Cups","loss, grief, self-pity", "acceptance, moving on, finding peace", false),
    SIX_CUPS("Six of Cups","familiarity, happy memories, healing", "moving forward, leaving home, independence", false),
    SEVEN_CUPS("Seven of Cups","searching for purpose, choices, daydreaming", "lack of purpose, diversion, confusion", false),
    EIGHT_CUPS("Eight of Cups","walking away, disillusionment, leaving behind", "avoidance, fear of change, fear of loss", false),
    NINE_CUPS("Nine of Cups","satisfaction, emotional stability, luxury", "lack of inner joy, smugness, dissatisfaction", false),
    TEN_CUPS("Ten of Cups","inner happiness, fulfillment, dreams coming true", "shattered dreams, broken family, domestic disharmony", false),
    PAGE_CUPS("Page of Cups","happy surprise, dreamer, sensitivity", "emotional immaturity, insecurity, disappointment", false),
    KNIGHT_CUPS("Knight of Cups","following the heart, idealist, romantic", "moodiness, disappointment", false),
    QUEEN_CUPS("Queen of Cups","compassion, calm, comfort", "martyrdom, insecurity, dependence", false),
    KING_CUPS("King of Cups","compassion, control, balance", "coldness, moodiness, bad advice", false),
    // Swords
    ACE_SWORDS("Ace of Swords","breakthrough, clarity, sharp mind", "confusion, brutality, chaos", false),
    TWO_SWORDS("Two of Swords","difficult choices, indecision, stalemate", "lesser of two evils, no right choice, confusion", false),
    THREE_SWORDS("Three of Swords","heartbreak, suffering, grief", "recovery, forgiveness, moving on", false),
    FOUR_SWORDS("Four of Swords","rest, restoration, contemplation", "restlessness, burnout, stress", false),
    FIVE_SWORDS("Five of Swords","unbridled ambition, win at all costs, sneakiness", "lingering resentment, desire to reconcile, forgiveness", false),
    SIX_SWORDS("Six of Swords","transition, leaving behind, moving on", "emotional baggage, unresolved issues, resisting transition", false),
    SEVEN_SWORDS("Seven of Swords","deception, trickery, tactics and strategy", "coming clean, rethinking approach, deception", false),
    EIGHT_SWORDS("Eight of Swords","imprisonment, entrapment, self-victimization", "self acceptance, new perspective, freedom", false),
    NINE_SWORDS("Nine of Swords","anxiety, hopelessness, trauma", "hope, reaching out, despair", false),
    TEN_SWORDS("Ten of Swords","failure, collapse, defeat", "can't get worse, only upwards, inevitable end", false),
    PAGE_SWORDS("Page of Swords","curiosity, restlessness, mental energy", "deception, manipulation, all talk", false),
    KNIGHT_SWORDS("Knight of Swords","action, impulsiveness, defending beliefs", "no direction, disregard for consequences, unpredictability", false),
    QUEEN_SWORDS("Queen of Swords","complexity, perceptiveness, clear mindedness", "cold hearted, cruel, bitterness", false),
    KING_SWORDS("King of Swords","head over heart, discipline, truth", "manipulative, cruel, weakness", false),
    // Pentacles
    ACE_PENTACLES("Ace of Pentacles","opportunity, prosperity, new venture", "lost opportunity, missed chance, bad investment", false),
    TWO_PENTACLES("Two of Pentacles","balancing decisions, priorities, adapting to change", "loss of balance, disorganized, overwhelmed", false),
    THREE_PENTACLES("Three of Pentacles","teamwork, collaboration, building", "lack of teamwork, disorganized, group conflict", false),
    FOUR_PENTACLES("Four of Pentacles","conservation, frugality, security", "greediness, stinginess, possessiveness", false),
    FIVE_PENTACLES("Five of Pentacles","need, poverty, insecurity", "recovery, charity, improvement", false),
    SIX_PENTACLES("Six of Pentacles","charity, generosity, sharing", "strings attached, stinginess, power and domination", false),
    SEVEN_PENTACLES("Seven of Pentacles","hard work, perseverance, diligence", "work without results, distractions, lack of rewards", false),
    EIGHT_PENTACLES("Eight of Pentacles","apprenticeship, passion, high standards", "lack of passion, uninspired, no motivation", false),
    NINE_PENTACLES("Nine of Pentacles","fruits of labor, rewards, luxury", "reckless spending, living beyond means, false success", false),
    TEN_PENTACLES("Ten of Pentacles","legacy, culmination, inheritance", "fleeting success, lack of stability, lack of resources", false),
    PAGE_PENTACLES("Page of Pentacles","ambition, desire, diligence", "lack of commitment, greediness, laziness", false),
    KNIGHT_PENTACLES("Knight of Pentacles","efficiency, hard work, responsibility", "laziness, obsessiveness, work without reward", false),
    QUEEN_PENTACLES("Queen of Pentacles","practicality, creature comforts, financial security", "self-centeredness, jealousy, smothering", false),
    KING_PENTACLES("King of Pentacles","abundance, prosperity, security", "greed, indulgence, sensuality", false)
    ;
    private String properName;
    private String normalMeaning;
    private String reverseMeaning;
    private boolean isMajor;
    CardType(String properName, String normalMeaning, String reverseMeaning, boolean isMajor) {
        this.properName = properName;
        this.normalMeaning = normalMeaning;
        this.reverseMeaning = reverseMeaning;
        this.isMajor = isMajor;
    }

    public String getProperName() {
        return properName;
    }

    public String getNormalMeaning() {
        return normalMeaning;
    }

    public String getReverseMeaning() {
        return reverseMeaning;
    }

    public boolean isMajor() {
        return isMajor;
    }
}
