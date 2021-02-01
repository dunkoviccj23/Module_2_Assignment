package edu.wctc;

public abstract class Room {
    private Room north = null, south = null, east = null, west = null, up = null, down = null;

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction) {
        if (direction == 'n') {
            return north;
        }
        if (direction == 's') {
            return south;
        }
        if (direction == 'e') {
            return east;
        }
        if (direction == 'w') {
            return west;
        }
        if (direction == 'u') {
            return up;
        }
        if (direction == 'd') {
            return down;
        }
        return null;
    }

    public String getExits() {
        String exits = "";
        if (this.isValidDirection('n')) {
            exits = exits + "North, ";
        }
        if (this.isValidDirection('s')) {
            exits = exits + "South, ";
        }
        if (this.isValidDirection('w')) {
            exits = exits + "West, ";
        }
        if (this.isValidDirection('e')) {
            exits = exits + "East, ";
        }
        if (this.isValidDirection('u')) {
            exits = exits + "Up, ";
        }
        if (this.isValidDirection('d')) {
            exits = exits + "Down, ";
        }
        return exits.substring(0, exits.length() - 2);
    }

    public boolean isValidDirection(char direction) {
        return this.getAdjoiningRoom(direction) != null;
    }

    public void setNorthRoom(Room room) {
        this.north = room;
    }

    public void setSouthRoom(Room room) {
        this.south = room;
    }

    public void setWestRoom(Room room) {
        this.west = room;
    }

    public void setEastRoom(Room room) {
        this.east = room;
    }

    public void setUpRoom(Room room) {
        this.up = room;
    }

    public void setDownRoom(Room room) {
        this.down = room;
    }
}
