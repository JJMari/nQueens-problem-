package Pieces;

/**
 *
 * @author marij
 */
public class Pawn extends Piece {

    public Pawn() {
        moves = new Moves(1);
        moves.addMove(0,1);
    }
}

