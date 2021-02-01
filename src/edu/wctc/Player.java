package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score = 0;
    List<String> inventory = new ArrayList<>();

    public void addToInventory(String addItem) {
        inventory.add(addItem);
    }

    public void addToScore(int score) {
        this.score = this.score + score;
    }

    public String getInventory() {
        if (inventory.size() == 0) {
            return "No items in inventory.";
        }
        return String.join(", ", inventory);
    }

    public int getScore() {
        return score;
    }
}

