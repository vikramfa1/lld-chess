package service;

import model.Spot;
import model.piece.Piece;
import model.player.Player;

public class Move {

    public Spot start;
    public Spot end;
    public Player playerMoved;
    public Piece pieceMoved;
    public Piece pieceKilled;
    public boolean castlingDone = false;

    public Move(Player player, Spot start, Spot end) {
        this.playerMoved = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.piece;
    }
}
