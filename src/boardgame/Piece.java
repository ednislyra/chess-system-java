package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Por padr�o o java atribui como nula, caso esta  n�o seja aqui declarada.
	}

	protected Board getBoard() {
		return board;
	}

}
