package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padrao o java já inicia com null
	}
	
	//somente será acessado no package boardgame e suas subclasses
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	//Met. Concreto utilizando um Met. Abstract (ROOKMETODS)
	public boolean possibleMove(Position position) {
		return possibleMoves() [position.getRow()][position.getColumn()];
	}
	
	//Implementacao concreta que depende de um método abstrato.
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat [i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	

}
