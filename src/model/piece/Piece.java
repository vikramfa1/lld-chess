package model.piece;

import model.Spot;
import Board.Board;

public abstract class Piece {

    public boolean killed = false;
    public boolean isWhite = false;



    public abstract boolean canMove(Board board, Spot start, Spot end);
}
