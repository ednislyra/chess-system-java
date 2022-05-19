package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Devemos apagar o set do Color pois não queremos que a cor possa ser modificada, apenas acessada pelo método get.
	public Color getColor() {
		return color;
	}
	
}
