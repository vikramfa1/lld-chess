package model.piece;

import model.Spot;
import Board.Board;

public class Knight extends Piece{


    public Knight(boolean isWhite) {
        this.isWhite = isWhite;
    }
    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        int xDist = Math.abs(start.x - end.x);
        int yDist = Math.abs(start.y - end.y);
        int res = xDist * yDist;
        return res == 2;
    }
}
