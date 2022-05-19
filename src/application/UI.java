package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		
		//Imprimir o Tabuleiro na tela
		for (int i=0; i<pieces.length; i++ ) {
			System.out.print((8 - i) + " ");
			for (int j=0; j<pieces.length; j++ ) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	//M�todo auxiliar para imprimir uma pe�a
	private static void printPiece(ChessPiece piece) {
		 if (piece == null) {
			 System.out.print("-");
		 }
		 else {
			 System.out.print(piece);
		 }
		 System.out.print(" ");
	}
}
