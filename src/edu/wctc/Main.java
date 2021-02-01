package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Player player = new Player();
        Maze maze = new Maze(player);

        while (!maze.isFinished()) {
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println("Possible room exits: " + maze.getCurrentRoomExits());
            System.out.println("Enter in the direction(n, s, w, e, u, d) or loot(l) or interact(i) or exit(x) or check inventory(v).");
            char direction = keyboard.next().charAt(0);
            if (direction == 'x') {
                System.out.println(maze.exitCurrentRoom());
            } else if (direction == 'i') {
                System.out.println(maze.interactCurrentRoom());
            } else if (direction == 'l') {
                System.out.println(maze.lootCurrentRoom());
            } else if (direction == 'v') {
                System.out.println(maze.getPlayerInventory());
            } else if (!maze.move(direction)) {
                System.out.println("That is not a valid direction.");
            }
        }
        System.out.println("Your score : " + maze.getPlayerScore());
    }
}
