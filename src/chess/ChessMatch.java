package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

/* Essa é a classe do Coração do projeto,
 * aqui terá todas as regras do jogo.*/

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	//retornará as peças de uma partida "ChessMatch"
	public ChessPiece[][] getPieces(){
		 ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		 //loop do tabuleiro - Downcasting para ChessPiece
		 for(int i = 0; i < board.getRows(); i++) {
			 for(int j = 0; j < board.getColumns(); j++) {
				 mat[i][j] = (ChessPiece) board.piece(i, j);
			 }
		 }
		 return mat;
	}
	//será as coordenadas do xadrez.
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
	}
	
	

}
