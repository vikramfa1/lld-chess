package model;

import model.piece.Piece;


public class Spot {
 public Piece piece;
 public int x;
 public int y;

 public Spot(Piece piece, int x, int y) {
     this.piece = piece;
     this.x = x;
     this.y = y;
 }
}
