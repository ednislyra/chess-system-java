package application;

import chess.ChessMatch;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciar uma partida de xadrez e imprimir o tabuleiro
		ChessMatch chessMatch = new  ChessMatch();
		
		//M�todo que vai receber a matriz de pe�as da minha partida
		UI.printBoard(chessMatch.getPieces());
	}

}
