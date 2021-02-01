package edu.wctc;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze(Player player) {
        this.player = player;

        InteractableRoom skaldRoom = new InteractableRoom();

        LootableRoom fireplaceChamber = new LootableRoom();

        ExitRoom valhalla = new ExitRoom();

        this.currentRoom = skaldRoom;

        skaldRoom.setNorthRoom(fireplaceChamber);

        fireplaceChamber.setSouthRoom(skaldRoom);

        fireplaceChamber.setEastRoom(valhalla);

        valhalla.setWestRoom(fireplaceChamber);
    }

    public String exitCurrentRoom() {
        if (this.currentRoom instanceof ExitRoom) {
            this.isFinished = true;
            return ((ExitRoom) this.currentRoom).exit();
        }
        return "This is no way to escape this viking townhall from this room.";
    }

    public String lootCurrentRoom() {
        if (this.currentRoom instanceof LootableRoom) {
            if (!this.player.getInventory().equals("Odin's Horn")) {
                this.player.addToInventory("Odin's Horn");
                return ((LootableRoom) this.currentRoom).loot();
            }
        }
        return "There are no viking artifacts here to plunder.";
    }

    public String interactCurrentRoom() {
        if (this.currentRoom instanceof InteractableRoom) {
            return ((InteractableRoom) this.currentRoom).interact();
        }
        return "There is nothing to interact with in this room.";
    }

    public boolean move(char direction) {
        if (this.currentRoom.isValidDirection(direction)) {
            this.currentRoom = this.currentRoom.getAdjoiningRoom(direction);
            return true;
        }
        return false;
    }

    public int getPlayerScore() {
        return this.player.getScore();
    }

    public String getPlayerInventory() {
        return this.player.getInventory();
    }

    public String getCurrentRoomDescription() {
        return this.currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return this.currentRoom.getExits();
    }

    public boolean isFinished() {
        return this.isFinished;
    }

}
