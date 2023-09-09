package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces()); //não instanciei, coloquei a classe e o que seria pego nela (Peças)
		
	}

}
