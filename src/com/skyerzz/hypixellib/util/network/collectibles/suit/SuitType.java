package com.skyerzz.hypixellib.util.network.collectibles.suit;

/**
 * Created by sky on 4-7-2017.
 */
public enum SuitType {
    FROG("Frog Suit", "One of the rarest suits around. Browse dank memes from far above when you equip this Frog Suit.", "Super high jump."),
    NINJA("Ninja Suit", "Silent but deadly, skulk around your favourite lobby with this Ninja Suit.", "Click to throw a Ninja Shuriken!"),
    SPEEDSTER("Speedster Suit", "Nothing moves faster than the speed of light... except you when you're wearing this Speedster Suit!", "Sprint to run extremely fast."),
    GHOSTLY_SKELETON("Ghostly Skeleton Suit", "Are you feeling spooky? Then equip this spooky scary Ghostly Skeleton Suit!", "Makes the wearer invisible under the suit!"),
    DISCO("Disco Suit", "It was your Dad's favourite dance movement - bring back the boogie with this Disco Suit!", "Changes colors when equipped!"),
    MERMAID("Mermaid Suit", "Everything's better down where it's wetter! Head under the sea with this Mermaid Suit.", "Transform into a beautiful Squid when under water."),
    SPOODERMAN("Spooderman Suit", "Wiv grat powr com grat respunsabils. Save the day with this Spooderman Suit.", "Click to swing around lobbies!"),
    WARRIOR("Warrior Suit", "The Warrior's way is one of honour, resilience, and butt-kicking special abilities!", "Left click and look down to Ground Slam, or look ahead to Seismic Wave."),
    NECROMANCER("Necromancer Suit", "Put the RAVE in the grave yard and bring back the dead with this Necromancer Suit!", "Click to raise the dead"),
    THOR("Thor Suit", "\"I like this suit. ANOTHER!\" Wield the power of the God of Thunder with this Thor Suit.", "Click to strike lightning."),
    DEATH_ANGEL("Death Angel Suit", "Don't blink - not even once, not for a second... whatever you do - don't blink!", " Click any player to lock on, chasing them around the lobby."),
    BAKER("Baker Suit", "What's better than a cookie A man who can bake a million cookies!", "Click tod eliver baked goods around the lobby."),
    BUMBLEBEE("Bumblebee Suit", "We aren't sure what all the buzz is about this suit.", "This suit will play a classical song when you fly (requires VIP) or left-click!"),
    FIREFIGHTER("Firefighter Suit", "Become an everyday hero when you equip this Firefighter Suit!", "Click to spray water."),
    PLUMBER("Plumber Suit", "We're sorry, your princess is in another lobby!", "Click to throw fireballs."),
    ICE_WALKER("Ice Walker Suit", "No, she doesn't want to build a snow man... and don't tell her to \"Let it go!\".", "Absorb heat and chill the world around you by walking."), //fixonline snow man > snowman?
    VAMPIRE("Vampire Suit", "Like a bat out of hell, become a blood-craving villain with this Vampire Suit", "Transform into a bat when you fly."),
    DRAGON_BREATH("Dragon Breath Suit", "For generations, the wearer of the Dragon Breath Suit has protected the realms of man with its ancient abilities.", "Click to breathe fire on your foes!"),
    PIRATE("Pirate Suit", "YARR! Set sail for treasure in a boat fit for landlubbers and salty sea dogs alike with this Pirate Suit!", "Click to sail around in a boat."),
    TNT("TNT Suit", "You know what's better than building things? BLOWING THEM UP!", "Click to throw a bomb!"),
    WOLF_PRINCESS("Wolf Princess Suit", "As protector of the forest, the wearer of the Wolf Princess suit can call upon her animal allies.", "Click to summon your wolf pack!"), //fixonline suit not capitalized in lore
    SOLAR_POWER("Solar Power Suit", "Harness the natural energy of the sun to super charge this Solar Suit!", "Suit rains as you move around. Click to recharge!"),
    SOCCER("Soccer Suit", "Forget Ronaldo, forget Messi, the best player in the world is you wearing this Soccer Suit!", "Click to spawn a soccer ball, which you can kick around!"),
    SANTA("Santa Suit", "HO HO HO! Discover who has been naughty or nice with this jolly old Santa Suit.", " Click to deliver presents!"),
    TOY_SOLDIER("Toy Soldier Suit", "Finally, a suit that works like clockwork... because it is clockwork!", "Click to play the drums!"),
    SURPRISE_GIFT("Surprise Gift Suit", "SURPRISE! As a reward for being so generours, you can equip this Surprise Gift Suit!", "Click to disguise yourself as a present that other players can unwrap."),
    TREASURE_HUNTER("Treasure Hunter Suit", " Archeology is the search for facts, not truth. Explore tombs, crypts and ruins with this Treasure Hunter Suit!", "Search lobbies to collect ancient golden treasures."),
    COSTUME("Costume Suit", "It's halloween, the season of fancy dress - why choose one spooky costume when you can have them all?", "The suit rapidly changes to different spooky outfits."),
    NEW_YEAR("New Year's Celebration Suit", "Celebrate the end of yet another crazy year with the New Year Celebration Suit!", "Punch to set off a firework."),
    GRINCH("Grinch Suit", "Not everyone loves christmas! Collect this full suit to transform into an evil Grinch.", "Punch to spawn presents that turn into coal.");

    private String displayName, lore, ability;

    SuitType(String displayName, String lore, String ability){
        this.displayName = displayName;
        this.lore = lore;
        this.ability = ability;
    }

    public String getDisplayName(){ return displayName; }

    public String getLore(){ return lore; }

    public String getLoreAbility(){ return "Full Set Ability: " + getAbility(); }

    public String getAbility(){return ability;}
}
