package service;

import config.GameStatus;
import model.Spot;
import model.piece.King;
import model.piece.Piece;
import model.player.Player;
import Board.Board;

import java.util.ArrayList;
import java.util.List;

public class Game {

    Player[] players;
    Board board;
    Player currentPlayer;
    List<Move> movesPlayed;
    GameStatus gameStatus;

    public boolean isEnd() {
        return this.gameStatus != GameStatus.ACTIVE;
    }

    private void initialise(Player p1, Player p2) {
        players = new Player[2];
        players[0] = p1;
        players[1] = p2;

        board = new Board();

        if(p1.isWhite) {
            this.currentPlayer = p1;
        } else {
            this.currentPlayer = p2;
        }

        movesPlayed = new ArrayList<>();
        movesPlayed.clear();

    }

    public boolean playerMove(Player player, int startX, int startY, int endX, int endY) {
        Spot x = board.getBox(startX, startY);
        Spot y = board.getBox(endX, endY);
        Move move = new Move(player, x, y);
        return makeMove(player, move);
    }

    private boolean makeMove(Player player, Move move) {

        Piece sourcePiece = move.start.piece;

        if(player!=currentPlayer) {
            return false;
        }

        if(sourcePiece.isWhite != player.isWhite) {
            return false;
        }

        if(!sourcePiece.canMove(board, move.start, move.end)) {
            return false;
        }

        Piece destPiece = move.end.piece;
        if(destPiece!=null) {
            destPiece.killed = true;
            move.pieceKilled = destPiece;
        }
        movesPlayed.add(move);

        move.end.piece = sourcePiece;
        move.start.piece = null;

        if(destPiece!=null && destPiece instanceof King) {
            if(player.isWhite) {
                gameStatus = GameStatus.WHITE_WIN;
            } else {
                gameStatus = GameStatus.BLACK_WIN;
            }
        }
        if(currentPlayer == players[0]) {
            this.currentPlayer = players[1];
        } else {
            this.currentPlayer = players[0];
        }

        return true;
    }
}
