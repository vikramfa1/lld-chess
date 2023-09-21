package Board;

import model.Spot;
import model.piece.King;
import model.piece.Rook;

public class Board {

    Spot[][] spot;

    public Board() {
        spot = new Spot[8][8];

        resetBoard();
    }

    public Spot getBox(int x, int y) {
        return spot[x][y];
    }

    public void resetBoard() {
        spot[0][0] = new Spot(new Rook(false), 0, 0);
        spot[0][1] = new Spot(new King(false), 0, 1);
        spot[0][2] = new Spot(new King(false), 0, 2);
        spot[0][3] = new Spot(new King(false), 0, 3);

        spot[8][0] = new Spot(new Rook(true), 8, 0);
        spot[8][1] = new Spot(new King(true), 8, 1);
        spot[8][2] = new Spot(new King(true), 8, 2);
        spot[8][3] = new Spot(new King(true), 8, 3);

        for(int i=2;i<6;i++) {
            for(int j=0;j<8;j++) {
                spot[i][j] = new Spot(null, i, j);
            }
        }
    }


}
