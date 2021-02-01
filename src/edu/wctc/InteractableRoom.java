package edu.wctc;

public class InteractableRoom extends Room implements Interactable {
    public String getDescription() {
        return "You are in a room that reeks of musk and men heavily indulging in adult beverages and singing and telling glorious stories of villages pillaged.";
    }

    @Override
    public String interact() {
        return "A massive sweaty bearded bard sings you the folksong of his people.";
    }
}
