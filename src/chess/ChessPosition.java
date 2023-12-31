package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erro instantiating ChessPosition. Valid are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a'); 
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow()); //casting para char 
	}
	
	@Override
	public String toString() {
		// O ("") foi para forçar o compilador a entender que é  um concatenacao de Strings. 
		return "" + column + row; 
	}
	
	//não poderá ser alterada a posicao de linha e coluna.
//	public void setColumn(char column) {
//		this.column = column;
//	}
//
//	public void setRow(int row) {
//		this.row = row;
//	}
	
	
	
	

}
