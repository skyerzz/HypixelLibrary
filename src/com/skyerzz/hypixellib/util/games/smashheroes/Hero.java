package com.skyerzz.hypixellib.util.games.smashheroes;

import com.skyerzz.hypixellib.OutDated;

import java.util.ArrayList;

/**
 * Created by sky on 7-1-2017.
 */
public enum Hero {
    //<editor-fold desc="[BULK]">
    THE_BULK("Bulk", "Capable of smashing anything that stands in front of him, he is one of the world's most fearsome Heroes. Try not to anger him...", ClassType.MELEE, 2, 0, 0,
        new SmashAbility(
                 "BOULDER",
                 "BULK THROW!",
                 "Right Click to throw a car towards the targeted location that deals damage to anyone it passes through.",
                 "The car is affected by gravity. If your target is far away, make sure you aim above their head before you throw it."
        ),
        new SmashAbility(
                "MONSTER_CHARGE",
                "BULK CHARGE!",
                "Press [2] to charge in the direction you're facing. Anyone caught in your path will be damaged.",
                "You can charge upwards while falling to go up. This could save you the next time you fall off of the map.",
                "You can charge downwards after double-jumping to combo BULK CHARGE! with your passive ability, BULK SLAM!.", //fixonline there is a "." after combo
                "The cooldown of BULK CHARGE! is reduced during BULK SMASH!."
        ),
        new SmashAbility(
                "MONSTER_MASH",
                "BULK SMASH!",
                "Press [3] to begin repeatedly jumping up and down, dealing damage to players you hit. The cooldown of Bulk Charge is reduced during use.", //fixonline cooldown of bulk charge is reduced, not smash.
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "SEISMIC_SLAM",
                "BULK SLAM!",
                "After performing a double-jump, you will execute a ground slam the next time you touch the ground, dealing damage to nearby enemy heroes. Requires 70 energy.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "If you execute it correctly, you can use other abilities in conjunction with BULK SLAM! to deliver a triple or even a quad hit combo on an unsuspecting enemy." //fixonline conjonction > conjunction
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[GENERAL CLUCK]">
    GENERAL_CLUCK("General Cluck", "Bawk bawk...BACAAAWWWK!", ClassType.RANGED, 1, 0, 0,
        new SmashAbility(
                "BAZOOKA",
                "Shoot Rocket",
                "Right Click to shoot a rocket that explodes on impact, dealing damage to enemy heroes. Shooting at your feet will launch you upwards, also known as a Rocket Jump. Allows the use of Clusterbuck after 3 successful hits.",
                "If the enemies you are shooting at are far away, shoot ahead of them if they are moving as the rocket travels slowly.",
                "You take no damage from your own rockets.",
                "Alternating between Rocket Jumps and Flap will allow you to cover greater distances without touching the ground."
        ),
        new SmashAbility(
                "EGG_BAZOOKA",
                "Clusterbuck",
                "Press [2] to shoot a cluster rocket that will explode into multiple explosive eggs. Requires 3 successful hits of Shoot Rocket to become available.",
                "If you're lucky, landing a direct impact on a player increases the chance of multiple eggs hitting the same player."
        ),
        new SmashAbility(
                "REINFORCEMENTS",
                "Chicken Army",
                "Press [3] call in an army of chickens that will fight for you. The chickens are armed with a Bazooka and will shoot rockets at enemy players.",
                "As a RANGED hero, hitting an enemy with your Right Click ability will instantly reduce your Smash Ability's cooldown by 2 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "FLAP",
                "Flap",
                "Instead of double-jumping, you can flap your wings several times to glide longer distances. Each wing flap costs energy.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "You can't gain much altitude by flapping your wings, but when used alongside Rocket Jump, you can cover large distances."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[CAKE MONSTER]">
    CAKE_MONSTER("Cake Monster", "This pastry-loving monster has one dream and one dream only. He wishes to become the world's most renowned chef!", ClassType.MELEE, 2, 0, 0,
        new SmashAbility(
                "SWING_PIN",
                "Swing Pin",
                "Right Click to swing your rolling pin in front of you, sending you slightly forward and damaging all enemies caught in your path. Hits with any of your other abilities will reset Swing Pin's cooldown.",
                "If you're falling off the map, you can use Swing Pin while looking upwards to gain some altitude for a chance at getting back to safety."
        ),
        new SmashAbility(
                "THROW_CAKE",
                "Regurgicake",
                "Press [2] to spew cakes in front of you, dealing damage to enemies. For each cake that hits an enemy, you will take 5% less damage, up to a maximum of 30% for 3 seconds.", //fixonline "take 5% less damage damage" > remove 1x damage
                "Use Swing Pin right before using Regurgicake in order to reset its cooldown immediately, allowing you to use it twice in rapid succession."
        ),
        new SmashAbility(
                "CAKE_STORM",
                "Cake Storm",
                "Press [3] to start rapidly launching cakes from your mouth for several seconds.",
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "DEFECAKE",
                "Defecake",
                "Double-Jumping will cause you to eject an explosive cake, granting you an extra jump at the cost of 50 energy and damaging nearby enemies when it explodes.",
                "Your energy is represented by the yellow experience bar above your hotbar."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[BOTMON]">
    BOTMUN("Botmon", "After achieving mental and physical perfection through arduous training, he now fights crime dressed up as a bat. He is vengeance, he is the night, he is...the Botmon", ClassType.RANGED, 1, 0, 0,
        new SmashAbility(
                "BATARANG",
                "Throw Botarang",
                "Right Click to throw 3 botarangs in rapid succession.",
                "If the enemies you are shooting at are far away, aim ahead of them if they are moving as the Botarangs require some traveling time."
        ),
        new SmashAbility(
                "GRAPPLING_HOOK",
                "Botclaw",
                "Press [2] to attatch your Botclaw to the block you're aiming at, allowing you to quickly travel to it. Botbombs will be automatically thrown as you travel towards the end of the Botclaw.",
                "No tips for this one!"
        ),
        new SmashAbility(
                "BOTMUBILE",
                "Botmobile",
                "Press [3] to hop into your Botmobile, allowing you to fly around. Running over enemy players will deal damage to them.",
                "As a RANGED hero, hitting an enemy with your Right Click ability will instantly reduce your Smash Ability's cooldown by 2 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "BAT_GLIDE",
                "Bat Glide",
                "Double-Jumping will cause you to glide forward in a cloud of abts, pushing enemy players and preventing you from being knocked back. Requires 80 energy. If you don't have enough energy you will double-jump normally.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "Activate Bat Glide right before getting hit by a strong attack to avoid being knocked back. Will not work if the attack kills you."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[TINMAN]">
    TINMAN("Tinman", "We have always been taught and shown that iron is stronger than tin. But is it really? Tinman is here to prove otherwise!", ClassType.RANGED, 1, 0, 10000,
        new SmashAbility(
                "LASER_CANNON",
                "Shoot Laser",
                "Right Click to rapidly shoot lasers using your laser gun. Allows the use of Rocket Punch after 5 successful hits.",
                "If the enemies you are shooting at are far away, aim ahead of them if they are moving as the lasers require some time to travel.",
                "You can't manually reload your laser gun. It will reload automatically after you have shot all of your lasers."
        ),
        new SmashAbility(
                "ROCKET_PUNCH",
                "Rocket Punch",
                "Press [2] to fire a rocket punch missile that explodes upon impact, dealing damage and knocking back enemy heroes.",
                "Rocket Punch travels much slower than your lasers but deals a lot more damage. Try getting closer to your target before firing to make sure you don't miss!"
        ),
        new SmashAbility(
                "HOMING_MISSILES",
                "Homing Missiles",
                "Press [3] to fire a volley of missiles into the sky that will then lock onto enemy players before coming back down towards them.",
                "As a RANGED hero, hitting an enemy with your Right Click ability will instantly reduce your Smash Ability's cooldown by 2 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown.",
                "If you are good at aiming with your Shoot Laser ability, your Homing Missiles will become available quickly. Be ready to fire them frequently!"
        ),
        new SmashAbility(
                "OVERLOAD",
                "Overload",
                "Pressing [Sneak] will discharge lightning around you, dealing damage to nearby enemies and sending you upwards into the air. Costs 65 energy.",
                "Your energy is represented by the yellow experience bar above your hotbar."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[MARAUDER]">
    MARAUDER("Marauder", "His real name is a mystery. Rumor says that he used to be a valiant knight known by everyone in the galaxy. All we know is that he utilizes Dark Energy to do his evil deeds", ClassType.MELEE, 2, 0, 10000,
        new SmashAbility(
                "FORCE_LIGHTNING",
                "Lightning",
                "Right Click to instantly strike all enemies in front of you with lightning. Costs 40 Dark Energy.",
                "Make sure you are close enough to your target or else your Lightning will not reach them.",
                "Lightning is powerful, but it costs a lot of Dark Energy. Make sure you won't need to use your High Jump ability right after using Lightning or you won't be able to!"
        ),
        new SmashAbility(
                "FORCE_PULL",
                "Grip",
                "Press [2] to grip all enemies in front of you, dealing damage to them before sending them towards you. Costs 80 Dark Energy",
                "Use Grip to temporarily immobilize enemy heroes before using Lightning on them. It'll be much easier to hit them."
        ),
        new SmashAbility(
                "UNLEASHED_ENERGY",
                "Unleashed Energy",
                "Press [3] to unleash your darkest energy, causing your abilities to consume half the amount of Dark Energy and reducing the amount of damage you take by half for 15 seconds",
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "DARK_ENERGY",
                "Dark Energy",
                "Marauder' s Lightning and High Jump abilities have no cooldown but require Dark Energy to use. Dark Energy regenerates at a rate of 20 per second and hitting an enemy with a melee attack will generate 10 Dark Energy",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "While fighting an enemy, try to never let your Dark Energy bar full up completely for too long or that means you're wasting some potential damage or mobility."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[SPOODERMAN]">
    SPODERMAN("Spooderman", "Due 2 n unfortunate accidnet, spooderman became who he iz aftur gettin bit by a spooder. dis caused him 2 gain incredible abilities at teh cost of brain funcshun. with graet powr comes graet reshponsibility", ClassType.HYBRID, 4, 0, 25000,
        new SmashAbility(
                "SPIDER_KICK",
                "Spooder Kick",
                "Right Click to perform a kick that will send you forward slightly and deal damage to anyone in your path.",
                "Spooder Kick will knock enemies it hits downwards instead of upwards. Try and kick players who are coming back to the map after being knocked off of it.", //fixonline player > players
                "If you're falling off the map, you can use Spooder Kick while looking upwards to gain some altitude for a chance at getting back to safety."
        ),
        new SmashAbility(
                "WEB_SHOT",
                "Web Shot",
                "Press [2] to instantly fire a string of web where you're aiming. If it hits a block, it will pull you in that direction. If it hits a player, it will deal damage and pull them towards you. Hitting an enemy player alsog reatly reduces the cooldown.",
                "Web Shot has a greater effect if your target is lower than you. Try jumping before shooting Web Shot.",
                "Use Web Shot to bring an enemy in range of your Spooder Kick."
        ),
        new SmashAbility(
                "SPOODER_BUDDIES",
                "Spooder Buddies",
                "Press [3] to call in your buddies. After they've landed on the ground they will chase enemy players and show them who's the boss.",
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.", //fixonline melee > hybrid
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "WALL_CLIMBER",
                "Spooder Mastery",
                "Your Spooder Mastery allows you to climb walls by holding [Sneak] at the cost of energy, and every 5th melee hit will summon a spooder to aid you in combat for 10 seconds.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "If you are really far down the map and are desperately trying to hang on to a wall but you're running out of energy, alternate between Spooder Mastery and Web Shot for a higher chance at making it back to safety."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[PUG]">
    PUG("Pug", "Don't get fooled by this puppy's cuteness! The last thing Pug wants is a bely rub!", ClassType.MELEE, 2, 0, 25000,
        new SmashAbility(
                "BITE",
                "Bite",
                "Right Click to Bite, sending you slightly forwards and damaging all enemies in your path. Deals extra damage if used shortly after Pounce.",
                "If you're falling off the map, you can use Spooder Kick while looking upwards to gain some altitude for a chance at getting back to safety."
        ),
        new SmashAbility(
                "SUPERSONIC_BARK",
                "Sonic Bark",
                "Press [2] to let out a sonic bark, dealing damage to all enemies in front of you. Cooldown is greatly reduced while Intruders! is active.",
                "The sound waves of Sonic Bark need some time to travel. If the enemy you're aiming at is moving, try and aim ahead of them."
        ),
        new SmashAbility(
                "WEREPUG",
                "Intruders!",
                "Press [3] to sound the alarm, releasing two very dangerous companions to chase down the intruders! Your Sonic Bark has a reduced cooldown for the duration.",
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "POUNCE",
                "Pounce",
                "Pressing [Sneak] causes you to Pounce forwards, launching you in that direction and increase the damage of your next Bite used within 3 seconds. Costs a minimum of 30 energy.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "The longer you hold, the further you will jump and the stronger your next Bite will be."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[CRYOMANCER]">
    FROSTY("Cryomancer", "As a Mage who specialized in the power of Ice, he is pretty cool. Hehe heh hehehe heh... heheheheh...hehe...ehehe......heh...", ClassType.HYBRID, 3, 0, 25000,
        new SmashAbility(
                "FROSTBOLT",
                "Frostbolt",
                "Right Click to shoot a frostbolt that will shatter on impact, dealing damage and slowing nearby enemies temporarily.",
                "If the enemies you are shooting at are far away, shoot ahead of them if they are moving as Frostbolt travels slowly."
        ),
        new SmashAbility(
                "FREEZING_BREATH",
                "Freezing Breath",
                "Press [2] to breathe cold air in a cone in front of you, dealing damage to all enemies hit and slowing them temporarily.",
                "If two or more enemies are fighting close to each other, try to position yourself in a way that will make Freezing Breath hit all of them the next time you use it."
        ),
        new SmashAbility(
                "ICE_BARRIER",
                "Ice Barrier",
                "Press [3] to surround yourself with a layer of freezing air, reducing any damage you take nd shortens the cooldown of both your Frostbolt and Freezing Breath abilities for the duration.",
                "As a HYBRID hero, hitting an enemy with your melee attacks or with an ability will isntantly reduce your Smash Ability's cooldown by 1 second.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "ARCTIC_AURA",
                "Arctic Aura",
                "Enemies standing in the snow that constantly surrounds you take more damage from your Frostbolt and Freezing Breath abilities.",
                "If your abilities are ready to use and you tihnk you can catch up to a fleeing enemy soon, delaying their usage by a second or two in order tu use Arctic Aura's effect might be worth the wait."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[SGT SHIELD]">
    SERGEANT_SHIELD("Sgt. Shield", "After experimenting with a dangerous Irish super serum and tons of aerobics, Sergeant Shield became the pinnacle of human physical perfection. He throws his shield at his foes and can block with it. A fantastic melee fighter, some might call him the One-man army", ClassType.HYBRID, 3, 0, 25000,
        new SmashAbility(
                "SHIELD_BASH",
                "Shield",
                "Right Click to dash forward, hitting enemy heroes with your shield.",
                "No tips for this one!"
        ),
        new SmashAbility(
                "RICOCHET",
                "Ricochet",
                "Press [2] to throw Sergeant Shield's shield a short distance at an enemy, potentially bouncing off and hitting multiple targets before returning.",
                "While your shield is in your hand you take 15% less damage",
                "Keep in mind you're more vulnerable while the shield is away!"
        ),
        new SmashAbility(
                "SHIELD_QUAKE",
                "Justice Shield",
                "Press [3] to throw your shield into the sky. The shield will plummet into the ground, throwing enemy heroes far off the map",
                "You will lose your 15% damage reduction while your shield is away, so be careful!", //fixonline 15 > 15%
                "A good use of this skill is to knock enemy heroes off the map in order to edge guard and guarantee an enemy hero kill."
        ),
        new SmashAbility(
                "REFLECT",
                "Reflect",
                "[Sneak] to use your shield to its maximum potential, reflecting any projectiles launcher at you back to their original senders!",
                "Reflection can deflect most projectiles, but not all of them!",
                "A good rule of thumb is to block precision projectiles, as opposed to very large ones or skills which affect an area",
                "Be wary, ultimates are more powerful than normal skills and some can't be deflected"
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[KARAKOT]">
    GOKU("Karakot", "One of Earth's greatest fighters, Karakot does his best to use his strength and amazing skills to uphold peace", ClassType.HYBRID, 3, 0, 50000,
        new SmashAbility(
                "KI_BLAST",
                "Ki Blast",
                "Right Click to fire blasts of ki energy. Allows the use of Kame Do after 3 successful hits.",
                "Ki Blast isn't very accurate, so try and get closer to your enemy in order to be able to hit them."
        ),
        new SmashAbility(
                "KAME_BEAM",
                "Kame Do",
                "Press [2] to launch an accurate beam of energy forward. Requires 3 successful hits of Ki Blast to become available.",
                "While True Power is active, Kame Do can be used a lot more frequently due to the amount of Ki Blasts you can fire."
        ),
        new SmashAbility(
                "TRUE_POWER",
                "True Power",
                "Press [3] to activate True Power mode for 15 seconds. During that time, your Ki Blast will fire twice the amount of projectiles, your Teleport will cost half the amount of energy, and the damage you take will be reduced by half.",
                "As a HYBRID hero, hitting an enemy with your melee attacks or with an ability will isntantly reduce your Smash Ability's cooldown by 1 second.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown.",
                "Hold down Right Click while True Power is active to fire Ki Blast as fast as possible."
        ),
        new SmashAbility(
                "TELEPORT",
                "Teleport",
                "Instead of double-jumping, you will teleport in the direction you are facing. Costs 40 energy. If you don't have enough energy, you will double-jump normally. Costs half the regular amount of energy while True Power is active.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "While fighting face-to-face with another player, using Teleport to appear behind their back might confuse them for a moment.",
                "If you are quick enough, you can teleport through an enemy's projectile attack to dodge it."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[Skullfire]">
    SKULLFIRE("Skullfire", "As a professional Cops and Crims player, Skullfire causes terror and chaos using his favourite weapon; The Deagle", ClassType.RANGED, 3, 0, 50000,
        new SmashAbility(
                "DESERT_EAGLE",
                "Deagle",
                "Right Click to fire the Desert Eagle and deal damage instantly to players from a distance. Hold [Sneak] to fire a triple-shot. Damage is reduced at longer range.",
                "Try aiming slightly ahead of your enemy when they are moving to ahve a better chance of hitting them.",
                "You can't manually reload your Deagle. It will reload automatically after you have shot all 7 bullets.", //todo is this right? cant remember.
                "You will have to take gun recoil into consideration if you shoot too quickly."
        ),
        new SmashAbility(
                "GRENADE",
                "Grenade",
                "Press [2] to throw a grenade that will explode instantly upon impact with a player or a block.",
                "The grenade is affected by gravity. If your target is far away, make sure you aim above their head before you throw it."
        ),
        new SmashAbility(
                "FLAMING_DESERT_EAGLE",
                "Flaming Deagle",
                "Press [3] to transform your Deagle into a Flaming Deagle for 10 seconds, or until it runs out of ammo. Bullets will deal double damage, explode on contact, and the clip size is increased.",
                "As a RANGED hero, hitting an enemy with your Right Click ability will instantly reduce your Smash Ability's cooldown by 2 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "BULLSEYE",
                "Bullseye",
                "Successfully landing 3 consecutive hits in a row with your Shoot ability without missing will instantly reset your Grenade's cooldown and shooting an enemy while in midair will refund a double-jump charge.", //fixonline "consecutive hits in a row" is double
                "Keep an eye on your experience bar to see how many consecutive shots you've landed in a row.", //fixonline "consecutive hits in a row" is double
                "If your Grenade is ready to be thrown and you have already shot twice without missing, throw your Grenade before landing the third hit as the next shot will reset the cooldown, allowing you to throw another one immediately."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[SANIC]">
    SANIC("Sanic", "Gotta go fast", ClassType.MELEE, 2, 0, 75000,
        new SmashAbility(
                "DASH",
                "Spin Dash",
                "Right Click to dash upwards and boost yourself forward, knocking back any enemy heroes in your way",
                "If you're falling off the map, you can use Dash while looking upwards for a chance at getting back to safety."
        ),
        new SmashAbility(
                "BOOM",
                "Sanic Boom",
                "Press [2] to gain a burst of speed, emitting explosions in your wake as you run around the map",
                "Your Boom skill only works while on the ground."
        ),
        new SmashAbility(
                "ONION_CANNON",
                "Supersanic Ring Cannon",
                "Press [3] to power up and eject rings for 8 seconds. The more rings you have, the more damage you deal!",
                "Be wary that your rings have a lot of horizontal impact, but very little vertical impact",
                "A good way to hit heroes jumping oer you is to jump up with them!"
        ),
        new SmashAbility(
                "ONION_RINGS",
                "Onion Rings",
                "Enemy heroes drop onion rings when you punch them. Gather as many as you can to make your smash ability more powerful!" //fixonline no tips exist, not even the "no tips for this one!" message
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[Void CRAWLER]">
    DUSK_CRAWLER("Void Crawler", "A few years ago, reports were filed claiming he appeared out of thin air to steal an artifact weapon from the ruins of an ancient location called Warlords Armory, and then disappeared again. His origins are unknown", ClassType.MELEE, 2, 100, 100000,
        new SmashAbility(
                "VOID_SLASH",
                "Void Slash",
                "Right Click to perform a sword slash that will send you forward slightly and deal damage to anyone in your path.",
                "If you're falling off the map, you can use Void Slash while looking upwards to gain some altitude for a chance at getting back to safety."
        ),
        new SmashAbility(
                "TELEBOOM",
                "Teleboom",
                "Press [2] to teleport a short distance in the direction you are aiming. On arrival, you will deal damage to anyone around you.",
                "If you see more than one enemy fighting, Teleboom between them to hit them both at the same time.",
                "If you are quick enough, you can teleport through an enemy's projectile attack to dodge it."
        ),
        new SmashAbility(
                "TELEPUNCH",
                "Shadow Fury",
                "Press [3] to activate Shadow Fury for 12 seconds. During that time, your Teleboom will deal twice the amount of damage and its cooldown will be reduced by half.", //fixonline shadow fury not listed in orange
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.", //fixonline currently tells HYBRID tips, is a MELEE hero
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "VOID_ENERGY",
                "Void Energy",
                "Hitting enemies with your melee attacks will grant you Void Energy. The damage of your abilities is increased based on how much Void Energy you currently have.",
                "Your Void Energy is represented by the yellow experience bar above your hotbar.",
                "Void Energy depletes quickly, so make sure you try and melee hit enemies a lot.",
                "Try and fill up your Void Energy bar before using your main damage abilities for a bigger damage burst."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[Shoop]">
    SHOOP_DA_WHOOP("Shoop", "Shoop is capable of emitting light from his oral cavity through a process of optical amplification based on the stimulated emission of electromagnetic radiation. In other words... HE CAN SHOOT LASERS OUT OF HIS MOUTH!", ClassType.RANGED, 3, 150, 150000,
        new SmashAbility(
                "STATIC_LASER",
                "Lightning Bolt",
                "Right Click to throw a bolt of lightning towards the targeted location, dealing damage to anyone it passes through. Grants 1 charge of Charged Lazor per enemy hit. A mazimum of 5 charges can be stored.",
                "Lightning Bolt pierces through enemies, allowing you to hit more than one per activation. Try and use that to your advantage to gain charges for Charged Lazor faster."
        ),
        new SmashAbility(
                "CHARGED_BEAM",
                "Charged Lazor",
                "Press [2] to consume all charges you have and fire a long-range beam, dealing damage to enemies it hits. The more charges you have, the higher the damage will be.",
                "Charged Lazor can hit multiple enemies if they're lined up in front of you. Try and position yourself accordingly",
                "The amount of charges you have is displayed on the ability's icon on your hotbar."
        ),
        new SmashAbility(
                "FIR_MA_LAZER",
                "FIRIN' MAH LAZOR",
                "Press [3] to unleash a devastating lazor.",
                "As a RANGED hero, hitting an enemy with your Right Click ability will instantly reduce your Smash Ability's cooldown by 2 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "RIDE_THE_LIGHTNING",
                "Ride The Lightning",
                "Pressing [Sneak] to hop onto a Lightning Bolt in order to travel up to 50 bloicks. Costs 80 energy.", //fixonline "pressing" > "press"
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "Flying through enemies while using Ride the Lightning will damage them and grant you a charge for Charged Lazor."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[GreenHood]">
    GREEN_HOOD("Green Hood", "By day, a waiter in a French restaurant; by night a vigilante archer. The Green Hood uses his martial arts and bow skills to destroy his enemies", ClassType.RANGED, 4, 200, 200000,
        new SmashAbility(
                "NOTCHED_BOW",
                "Enhanced Bow",
                "Right Click to charge your bow, releasing a variety of special arrows at Green Hood's disposal.",
                "The bow can be charged further after you have pulled it all the way, which powers up some arrow types."
        ),
        new SmashAbility(
                "SWITCH_ARROW",
                "Switch Arrow",
                "Press [2] to switch ebtween different arrow types.",
                "Charging your bow (by holding right click) will make your arrows have a more powerful effect in most cases",
                "MultiShot Arrow will fire multiple arrows at once, depending on your bow charge",
                "A Scatter Arrow will eject numerous arrows at the point of contact",
                "A Tripmine Arrow will wait whereever you shoot it at, and explode when enemy heroes get close!",
                "Tripmine arrows can be stuck to enemy heroes and explode"
        ),
        new SmashAbility(
                "GRAVITY_ARROW",
                "Gravity Arrow",
                "Press [3] to equip a Gravity Arrow. Your next fired arrow will create a spherical gravity field after landing which pulls in nearby enemy heroes, leaving them vulnerable",
                "Enemy heroes can easily be hit while trapped in this skill, but watch out for ones who aren't trapped!",
                "If you shoot this on the side of a ledge just right, you can pull enemy heroes off the edge and hold them there"
        ),
        new SmashAbility(
                "FLYING_PUNCH",
                "Flying Punch",
                "After a double-jump, performing a melee hit while in the air will cause you to do a flying punch in the direction you are looking at. If you hit an enemy hero, they will take damage and be knocked back.",
                "You can only use a single flying punch while mid-air, before having to return to the ground",
                "Flying punch can only be used after you've exhausted all of your double-jumps." //fixonline no - inbetween double-jumps
        )
    ),
    //</editor-fold>

    @OutDated
    //<editor-fold desc="[Shaun]">
    SHAUN_SHEEP("OUTDATED", "OUTDATED", null, -1, -1, -1,
        new SmashAbility(
                "OUTDATED",
                "OUTDATED",
                "OUTDATED"
        ),
        new SmashAbility(
                "OUTDATED",
                "OUTDATED",
                "OUTDATED"
        ),
        new SmashAbility(
                "OUTDATED",
                "OUTDATED",
                "OUTDATED"
        ),
        new SmashAbility(
                "OUTDATED",
                "OUTDATED",
                "OUTDATED"
        )
    ),
    //</editor-fold>

    ;


    private String displayName, description;
    private ClassType classType;
    private int difficulty, requiredSmashLevel, unlockCost;
    private SmashAbility quickMove, chargeMove, smashMove, passive;

    Hero(String displayName, String description, ClassType classType, int difficulty, int requiredSmashLevel, int unlockCost,
         SmashAbility quickMove, SmashAbility chargeMove, SmashAbility smashMove, SmashAbility passive){
        this.displayName = displayName;
        this.description = description;
        this.classType = classType;
        this.difficulty = difficulty;
        this.requiredSmashLevel = requiredSmashLevel;
        this.unlockCost = unlockCost;

        this.quickMove = quickMove;
        this.chargeMove = chargeMove;
        this.smashMove = smashMove;
        this.passive = passive;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Hero item: Hero.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    public ClassType getClassType() {
        return classType;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getRequiredSmashLevel() {
        return requiredSmashLevel;
    }

    public int getUnlockCost() {
        return unlockCost;
    }

    public int getHealth(int prestigeLevel){
        switch(prestigeLevel){
            case 0: return 100;
            case 1: return 102;
            case 2: return 105;
            case 3: return 109;
            case 4: return 114;
            case 5: return 120;
        }
        return -1;
    }

    public int getPrestigeCost(int level){
        switch(level){
            case 0:
                return unlockCost;
            case 1: return 50000;
            case 2: return 120000;
            case 3: return 250000;
            case 4: return 400000;
            case 5: return 750000;
        }
        return -1;
    }

    public int getMasterSkinCost(){
        return 250000;
    }

    public String getMasterSkinDescription() { return "Unlocks the alternate appearance for " + getDisplayName(); }

    public SmashAbility getQuickMove() {
        return quickMove;
    }

    public SmashAbility getChargeMove() {
        return chargeMove;
    }

    public SmashAbility getSmashMove() {
        return smashMove;
    }

    public SmashAbility getPassive() {
        return passive;
    }
}
