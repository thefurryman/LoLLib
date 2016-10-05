package com.example.tofum.loldb;

/**
 * Created by tofum on 9/8/2016.
 */
public class AbilityData {


    String[] aatroxName = {
            "Blood Well",
            "Dark Flight", "Blood Thirst/Blood Price", "Blades of Torment",
            "Massacre"
    };
    String[] aatroxDesc = {
            "When using an ability that costs Health, Aatrox stores the self-inflicted damage into the Blood Well. Upon taking fatal damage, Aatrox extracts the blood from the well and recovers it as Health over a brief duration. Additionally, Aatrox gains 1% Attack Speed for every 2% blood that is in the well.",

            "Aatrox takes flight and slams down at a targeted location, dealing damage and knocking up enemies at the center of impact.\n" +
                    "Aatrox takes flight and slams down at target location, dealing 70/115/160/205/250 (+60% bonus Attack Damage) physical damage and knocking up enemies at the center of impact for 1 second.",

            "While toggled on Aatrox deals bonus damage every third subsequent attack at the expense of his own Health. While toggled off Aatrox restores Health every third subsequent attack.\n" +
                    "Toggle Off:\n" +
                    "Blood Thirst: Every third attack, Aatrox restores 20/25/30/35/40 (+25% bonus Attack Damage) Health, increased by 200% when below half Health.\n" +
                    "Toggle On: Blood Price: Every third attack, Aatrox deals 60/95/130/165/200 (+100% bonus Attack Damage) bonus physical damage and loses Health.",

            "Aatrox unleashes the power of his blade, dealing damage to enemies hit and slowing them.\n" +
                    "Aatrox unleashes the power of his blade, dealing 75/110/145/180/215 (+60% Ability Power) (+60% bonus Attack Damage) Magic Damage to enemies hit and slowing them by 40% for 1.75/2/2.25/2.5/2.75 seconds.",

            "Aatrox draws in the blood of his foes, damaging all nearby enemy champions around him and gaining increased Attack Speed and bonus Attack Range for a short duration.\n" +
                    "Aatrox draws in the blood of his foes, dealing 200/300/400 (+100% Ability Power) magic damage to nearby enemy champions. Massacre fills Aatrox's Blood Well by 20% for each champion hit and grants him 40/50/60% attack speed and 175 attack range for 12 seconds.",
    };

    String[][] name = {
            aatroxName,
    };

    String[][] desc = {
            aatroxDesc,
    };
}
