package model.player;

public class HumanPlayer extends Player{
    public HumanPlayer(boolean isWhite) {
        super(isWhite);
        this.isHumanPlayer = true;
    }
}
