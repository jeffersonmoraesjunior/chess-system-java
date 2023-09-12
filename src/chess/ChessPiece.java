package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	//Foi retirado o SET, pois a cor da peça não será editada e sim acessada.
//	public void setColor(Color color) {
//		this.color = color;
//	}
	
	
	
	
}
