package application;

import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

import boardgame.Board;

public class Program {
    public static void main(String[] args) throws Exception {
            
            // Instancing ChessMatch and UI
            ChessMatch chessMatch = new ChessMatch();
            Scanner sc = new Scanner(System.in);

            while(true){
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }         
    }
}
