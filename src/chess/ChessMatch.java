//Essa classe é o coração do jogo de xadrez, onde vão estar as regras do jogo.

package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//Método que vai retornar uma Matriz de peças de xadrez correspondente à partida
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for ( int i=0; i<board.getRows(); i++ ) {
			for ( int j=0; j<board.getColumns(); j++ ) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
}
