package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        // Java already starts position = null, so I can omit it
    }

    protected Board getBoard() {
        return board;
    }
}
