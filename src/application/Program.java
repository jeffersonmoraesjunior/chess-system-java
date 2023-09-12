package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces()); //não instanciei, coloquei a classe e o que seria pego nela (Peças)
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturePiece = chessMatch.performChessMove(source, target);
				
//				sc.close();
				
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			
		}
		

		
	}

}
