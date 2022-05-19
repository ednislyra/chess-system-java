//Essa classe � o cora��o do jogo de xadrez, onde v�o estar as regras do jogo.

package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//M�todo que vai retornar uma Matriz de pe�as de xadrez correspondente � partida
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
