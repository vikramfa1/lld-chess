package model.piece;

import Board.Board;
import model.Spot;

public class King extends  Piece {

    public boolean isCastlineDone = false;

    public King(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {

        if(super.isWhite == end.piece.isWhite) {
            return false;
        }

        int xPos = Math.abs(start.x - end.x);
        int yPos = Math.abs(start.y - end.y);
        if(xPos+yPos ==1) {
            return true;
        }
        return isValidCastling(board, start, end);
    }

    public boolean isValidCastling(Board board, Spot start, Spot end) {
        if(isCastlineDone) {
            return false;
        }

        //logic for doing castling
        return true;
    }
}
