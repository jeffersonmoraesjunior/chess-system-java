package boardgame;

public class Piece {
	
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

}
