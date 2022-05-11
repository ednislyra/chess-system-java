package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Por padrão o java atribui como nula, caso esta  não seja aqui declarada.
	}

	protected Board getBoard() {
		return board;
	}

}
