package model.player;

public class ComputerPlayer extends Player{
    public ComputerPlayer(boolean isWhite) {
        super(isWhite);
        this.isHumanPlayer = false;
    }
}
