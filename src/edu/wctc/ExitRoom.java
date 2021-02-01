package edu.wctc;

public class ExitRoom extends Room implements Exit {
    public String getDescription() {
        return "You are on a brightly lit bridge with a Jotnarr on the other side, do you signee him to the death to escape?";
    }

    @Override
    public String exit() {
        return "You have escaped the norse domain, but not really because you were already dead when you got here! Bum dealio!";
    }
}
