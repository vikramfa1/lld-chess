package model.piece;

import Board.Board;
import model.Spot;

public class Rook extends Piece{

    public Rook(boolean isWhite) {
        this.isWhite = isWhite;
    }
    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }
}
