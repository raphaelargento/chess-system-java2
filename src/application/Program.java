package application;

import boardgame.Position;
import chess.ChessMatch;
import boardgame.Board;

public class Program {
    public static void main(String[] args) throws Exception {
            
            // Instancing ChessMatch and UI
            ChessMatch chessMatch = new ChessMatch();
            UI.printBoard(chessMatch.getPieces());
    }
}
