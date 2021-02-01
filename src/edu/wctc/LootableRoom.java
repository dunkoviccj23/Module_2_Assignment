package edu.wctc;

public class LootableRoom extends Room implements Lootable {
    public String getDescription() {
        return "You are in a dim chamber and you see a massive fireplace and a ram horn the size of your leg, do you dokthar it right into your inventory?";
    }

    @Override
    public String loot() {
        return "Looted a Horn dropped by the Gods themselves, Odin would be proud.";
    }
}
